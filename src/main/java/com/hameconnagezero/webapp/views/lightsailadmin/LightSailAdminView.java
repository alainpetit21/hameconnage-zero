package com.hameconnagezero.webapp.views.lightsailadmin;

import com.hameconnagezero.webapp.views.MainLayout;
import com.vaadin.flow.component.accordion.Accordion;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.router.*;
import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;


@PageTitle("LightSail (Admin)")
@Route(value = "LightSail-(Admin)", layout = MainLayout.class)
@Uses(Icon.class)
@ParentLayout(MainLayout.class)
@RolesAllowed("ADMIN")
@PermitAll
public class LightSailAdminView extends Div implements RouterLayout {
    public static com.hameconnagezero.webapp.views.lightsailadmin.LightSailAdminView ptThis = null;
    public VerticalLayout detail;
    VerticalLayout master;
    SplitLayout splitLayout;


    public LightSailAdminView() {
        setHeight("100%");
        ptThis = this;
        splitLayout = new SplitLayout();
        master = new VerticalLayout();
        detail = new VerticalLayout();
        splitLayout.setSplitterPosition(10);

        master.add(createMasterList());
        detail.add(new Label("test Details"));
        splitLayout.addToPrimary(master);

        VerticalLayout overallRightSide = new VerticalLayout();
        HorizontalLayout menuBar= new HorizontalLayout();

        VerticalLayout avatarUser = new VerticalLayout();
        Image avatar = new Image("images/Avatar.png", "Admin");
        avatar.setHeight("128px");
        avatar.setWidth("128px");
        avatarUser.add(avatar);
        avatarUser.add(new Label("Admin"));
        menuBar.add(avatarUser);

        overallRightSide.add(menuBar);
        overallRightSide.add(detail);
        splitLayout.addToSecondary(overallRightSide);
        add(splitLayout);
    }

    VerticalLayout createMasterList(){

        VerticalLayout employees = new VerticalLayout();
        employees.add(new RouterLink("Alice", LightSailAdminE1.class));
        employees.add(new RouterLink("Bob", LightSailAdminE2.class));
        employees.add(new RouterLink("Carl", LightSailAdminE3.class));
        employees.add(new RouterLink("Dustin", LightSailAdminE4.class));

        VerticalLayout campaign = new VerticalLayout();
        campaign.add(new RouterLink("12/03/2023", LightSailAdminC1.class));
        campaign.add(new RouterLink("16/03/2023", LightSailAdminC2.class));
        campaign.add(new RouterLink("01/05/2023", LightSailAdminC3.class));
        campaign.add(new RouterLink("01/06/2023", LightSailAdminC4.class));

        VerticalLayout overview = new VerticalLayout();
        overview.add(new RouterLink("Overview", LightSailAdminOverview.class));

        Accordion accordion = new Accordion();
        accordion.add("Employés", employees);
        accordion.add("Campagne Hameçonnage", campaign);
        accordion.add("Survol campagnes", overview);

        return new VerticalLayout(accordion);
    }

}
