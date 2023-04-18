package com.hameconnagezero.webapp.views.lightsail;

import com.hameconnagezero.webapp.data.entity.User;
import com.hameconnagezero.webapp.security.AuthenticatedUser;
import com.hameconnagezero.webapp.views.MainLayout;
import com.vaadin.flow.component.accordion.Accordion;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.router.*;
import com.vaadin.flow.server.StreamResource;
import jakarta.annotation.security.PermitAll;

import java.io.ByteArrayInputStream;
import java.util.Optional;


@PageTitle("LightSail")
@Route(value = "LightSail/:samplePersonID?/:action?(edit)", layout = MainLayout.class)
@PermitAll
@Uses(Icon.class)
@ParentLayout(MainLayout.class)
public class LightSailView extends Div implements RouterLayout {
    public static LightSailView ptThis = null;
    public VerticalLayout detail;
    VerticalLayout master;
    SplitLayout splitLayout;
    private AuthenticatedUser authenticatedUser;


    public LightSailView(AuthenticatedUser authenticatedUser) {
        setHeight("100%");
        ptThis = this;
        this.authenticatedUser = authenticatedUser;

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
        avatarUser.add(getAvatarPictureOfCurrentUser());
        avatarUser.add(getAvatarName());
        menuBar.add(avatarUser);

        VerticalLayout myLevel = new VerticalLayout();
        myLevel.add(new H2("3"));
        myLevel.add(new Label("My Level"));
        menuBar.add(myLevel);

        VerticalLayout myScore = new VerticalLayout();
        myScore.add(new H2("24 pts"));
        myScore.add(new Label("My Score"));
        menuBar.add(myScore);

        VerticalLayout nextLevel = new VerticalLayout();
        nextLevel.add(new H2("10 pts"));
        nextLevel.add(new Label("Next Level in"));
        menuBar.add(nextLevel);

        overallRightSide.add(menuBar);
        overallRightSide.add(detail);
        splitLayout.addToSecondary(overallRightSide);
        add(splitLayout);
    }

    VerticalLayout createMasterList(){

        VerticalLayout formationNiveau1 = new VerticalLayout();
        formationNiveau1.add(new RouterLink("Video", LightSailN1V1.class));
        formationNiveau1.add(new RouterLink("Exercices 1", LightSailN1E1.class));
        formationNiveau1.add(new RouterLink("Exercices 2", LightSailN1E2.class));
        formationNiveau1.add(new RouterLink("Exercices 3", LightSailN1E3.class));

        VerticalLayout formationNiveau2 = new VerticalLayout();
        formationNiveau2.add(new RouterLink("Video", LightSailN2V1.class));
        formationNiveau2.add(new RouterLink("Exercices 1", LightSailN2E1.class));
        formationNiveau2.add(new RouterLink("Exercices 2", LightSailN2E2.class));
        formationNiveau2.add(new RouterLink("Exercices 3", LightSailN2E3.class));

        VerticalLayout formationNiveau3 = new VerticalLayout();
        formationNiveau3.add(new RouterLink("Video", LightSailN3V1.class));
        formationNiveau3.add(new RouterLink("Exercices 1", LightSailN3E1.class));
        formationNiveau3.add(new RouterLink("Exercices 2", LightSailN3E2.class));
        formationNiveau3.add(new RouterLink("Exercices 3", LightSailN3E3.class));

        VerticalLayout formationSurMesure = new VerticalLayout();
        formationSurMesure.add(new RouterLink("Exercices Facile", LightSailN3E1.class));
        formationSurMesure.add(new RouterLink("Exercices Moyens", LightSailN3E2.class));
        formationSurMesure.add(new RouterLink("Exercices Difficiles", LightSailN3E3.class));

        Accordion accordion = new Accordion();
        accordion.add("Formation Niveau 1", formationNiveau1);
        accordion.add("Formation Niveau 2", formationNiveau2);
        accordion.add("Formation Niveau 3", formationNiveau3);
        accordion.add("Formation sur mesure", formationSurMesure);

        return new VerticalLayout(accordion);
    }

    Image getAvatarPictureOfCurrentUser(){
        Optional<User> maybeUser = authenticatedUser.get();
        Image avatarImage;

        if (maybeUser.isPresent()) {
            User user = maybeUser.get();
            StreamResource resource = new StreamResource("profile-pic", () -> new ByteArrayInputStream(user.getProfilePicture()));

            avatarImage = new Image(resource, "Avatar");

        }else{
            avatarImage = new Image("images/Avatar.png", "Avatar");
        }

        avatarImage.setHeight("64px");
        avatarImage.setWidth("64px");
        return avatarImage;
    }

    private String getAvatarName() {
        Optional<User> maybeUser = authenticatedUser.get();
        String avatarName;

        if (maybeUser.isPresent()) {
            User user = maybeUser.get();
            avatarName = user.getName();

        } else {
            avatarName = "User";
        }

        return avatarName;
    }
}
