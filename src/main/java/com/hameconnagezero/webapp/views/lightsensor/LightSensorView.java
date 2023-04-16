package com.hameconnagezero.webapp.views.lightsensor;

import com.hameconnagezero.webapp.data.entity.Email;
import com.hameconnagezero.webapp.data.service.EmailService;
import com.hameconnagezero.webapp.views.MainLayout;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.BeanValidationBinder;
import com.vaadin.flow.data.binder.ValidationException;
import com.vaadin.flow.data.renderer.LitRenderer;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.data.VaadinSpringDataHelpers;
import jakarta.annotation.security.PermitAll;
import org.springframework.data.domain.PageRequest;
import org.springframework.orm.ObjectOptimisticLockingFailureException;

import java.util.Optional;


@PageTitle("LightSensor")
@Route(value = "LightSensor/:emailID?/:action?(edit)", layout = MainLayout.class)
@PermitAll
@Uses(Icon.class)
public class LightSensorView extends Div implements BeforeEnterObserver {

    private final String EMAIL_ID = "emailID";
    private final String EMAIL_EDIT_ROUTE_TEMPLATE = "LightSensor/%s/edit";
    private final Grid<Email> grid = new Grid<>(Email.class, false);

    private DatePicker dateReceived;
    private TextField emailFrom;
    private TextField emailReplyTo;
    private TextField emailTo;
    private TextField subject;
    private TextField text;
    private Checkbox hasAttachment;
    private Checkbox wasInvestigated;

    private final Button cancel = new Button("Annuler");
    private final Button save = new Button("Enregistrer");

    private final BeanValidationBinder<Email> binder;

    private Email email;

    private final EmailService emailService;


    public LightSensorView(EmailService emailService) {
        this.emailService = emailService;
        addClassNames("light-sensor-view");

        // Create UI
        SplitLayout splitLayout = new SplitLayout();

        createGridLayout(splitLayout);
        createEditorLayout(splitLayout);

        add(splitLayout);

        // Configure Grid
        grid.addColumn("dateReceived").setAutoWidth(true);
        grid.addColumn("emailFrom").setAutoWidth(true);
        grid.addColumn("emailReplyTo").setAutoWidth(true);
        grid.addColumn("emailTo").setAutoWidth(true);
        grid.addColumn("subject").setAutoWidth(true);
        grid.addColumn("text").setAutoWidth(true);
        LitRenderer<Email> attachmentRenderer = LitRenderer.<Email>of(
                        "<vaadin-icon icon='vaadin:${item.icon}' style='width: var(--lumo-icon-size-s); height: var(--lumo-icon-size-s); color: ${item.color};'></vaadin-icon>")
                .withProperty("icon", attachment -> attachment.hasAttachment() ? "check" : "minus").withProperty("color",
                        attachment -> attachment.hasAttachment()
                                ? "var(--lumo-primary-text-color)"
                                : "var(--lumo-disabled-text-color)");

        grid.addColumn(attachmentRenderer).setHeader("Attachments").setAutoWidth(true);
        LitRenderer<Email> investigatedRenderer = LitRenderer.<Email>of(
                        "<vaadin-icon icon='vaadin:${item.icon}' style='width: var(--lumo-icon-size-s); height: var(--lumo-icon-size-s); color: ${item.color};'></vaadin-icon>")
                .withProperty("icon", investigated -> investigated.wasInvestigated() ? "check" : "minus").withProperty("color",
                        investigated -> investigated.wasInvestigated()
                                ? "var(--lumo-primary-text-color)"
                                : "var(--lumo-disabled-text-color)");

        grid.addColumn(investigatedRenderer).setHeader("Investigated").setAutoWidth(true);

        grid.setItems(query -> emailService.list(
                PageRequest.of(query.getPage(), query.getPageSize(), VaadinSpringDataHelpers.toSpringDataSort(query)))
                .stream());
        grid.addThemeVariants(GridVariant.LUMO_NO_BORDER);

        // when a row is selected or deselected, populate form
        grid.asSingleSelect().addValueChangeListener(event -> {
            if (event.getValue() != null) {
                UI.getCurrent().navigate(String.format(EMAIL_EDIT_ROUTE_TEMPLATE, event.getValue().getId()));
            } else {
                clearForm();
                UI.getCurrent().navigate(LightSensorView.class);
            }
        });

        // Configure Form
        binder = new BeanValidationBinder<>(Email.class);

        // Bind fields. This is where you'd define e.g. validation rules

        binder.bindInstanceFields(this);

        cancel.addClickListener(e -> {
            clearForm();
            refreshGrid();
        });

        save.addClickListener(e -> {
            try {
                if (this.email == null) {
                    this.email = new Email();
                }
                binder.writeBean(this.email);
                emailService.update(this.email);
                clearForm();
                refreshGrid();
                Notification.show("Data updated");
                UI.getCurrent().navigate(LightSensorView.class);
            } catch (ObjectOptimisticLockingFailureException exception) {
                Notification n = Notification.show(
                        "Error updating the data. Somebody else has updated the record while you were making changes.");
                n.setPosition(Position.MIDDLE);
                n.addThemeVariants(NotificationVariant.LUMO_ERROR);
            } catch (ValidationException validationException) {
                Notification.show("Failed to update the data. Check again that all values are valid");
            }
        });
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        Optional<Long> emailId = event.getRouteParameters().get(EMAIL_ID).map(Long::parseLong);
        if (emailId.isPresent()) {
            Optional<Email> emailFromBackend = emailService.get(emailId.get());
            if (emailFromBackend.isPresent()) {
                populateForm(emailFromBackend.get());
            } else {
                Notification.show(
                        String.format("The requested samplePerson was not found, ID = %s", emailId.get()), 3000,
                        Notification.Position.BOTTOM_START);
                // when a row is selected but the data is no longer available,
                // refresh grid
                refreshGrid();
                event.forwardTo(LightSensorView.class);
            }
        }
    }

    private void createEditorLayout(SplitLayout splitLayout) {
        Div editorLayoutDiv = new Div();
        editorLayoutDiv.setClassName("editor-layout");

        Div editorDiv = new Div();
        editorDiv.setClassName("editor");
        editorLayoutDiv.add(editorDiv);

        FormLayout formLayout = new FormLayout();
        dateReceived = new DatePicker("dateReceived");
        emailFrom = new TextField("emailFrom");
        emailReplyTo = new TextField("emailReplyTo");
        emailTo = new TextField("emailTo");
        subject = new TextField("subject");
        text = new TextField("text");
        hasAttachment = new Checkbox("pièces jointes?");
        wasInvestigated = new Checkbox("demande d'enquête?");
        formLayout.add(dateReceived, emailFrom, emailReplyTo, emailTo, subject, text, hasAttachment, wasInvestigated);

        editorDiv.add(formLayout);
        createButtonLayout(editorLayoutDiv);

        splitLayout.addToSecondary(editorLayoutDiv);
    }

    private void createButtonLayout(Div editorLayoutDiv) {
        HorizontalLayout buttonLayout = new HorizontalLayout();
        buttonLayout.setClassName("button-layout");
        cancel.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonLayout.add(save, cancel);
        editorLayoutDiv.add(buttonLayout);
    }

    private void createGridLayout(SplitLayout splitLayout) {
        Div wrapper = new Div();
        wrapper.setClassName("grid-wrapper");
        splitLayout.addToPrimary(wrapper);
        wrapper.add(grid);
    }

    private void refreshGrid() {
        grid.select(null);
        grid.getDataProvider().refreshAll();
    }

    private void clearForm() {
        populateForm(null);
    }

    private void populateForm(Email value) {
        this.email = value;
        binder.readBean(this.email);

    }
}
