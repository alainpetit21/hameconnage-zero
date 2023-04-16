package com.hameconnagezero.webapp.views.lightbulb;

import com.hameconnagezero.webapp.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.AfterNavigationEvent;
import com.vaadin.flow.router.AfterNavigationObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

import java.util.Arrays;
import java.util.List;


@PageTitle("LightBulb")
@Route(value = "LightBulb", layout = MainLayout.class)
@PermitAll
public class LightBulbView extends Div implements AfterNavigationObserver {

    Grid<Person> grid = new Grid<>();
    List<Person> persons;


    public LightBulbView() {
        addClassName("light-bulb-view");
        setSizeFull();
        grid.setHeight("100%");
        grid.addThemeVariants(GridVariant.LUMO_NO_BORDER, GridVariant.LUMO_NO_ROW_BORDERS);
        grid.addComponentColumn(this::createCard);

        VerticalLayout vl = new VerticalLayout();
        HorizontalLayout hl = new HorizontalLayout();

        hl.add(new Label("Écrivez une requête pour LightBulb : "));
        TextField textField = new TextField("");
        Button button = new Button("Rechercher", e -> {
            persons = Arrays.asList(
                    createPerson("https://randomuser.me/api/portraits/men/42.jpg", "John Smith", "May 8",
                            textField.getValue(),
                            "0", "0", "0"),
                    createLightBuldAIAnswer( "Apr 09",
                            "D'après notre base de données, l'adresse email \"" + textField.getValue() + "\" a été observée dans une arnaque de cryptomonnaie connue pour être malveillante.\nNous recommandons fortement de ne pas interagir avec ce courriel et de le supprimer immédiatement.\nVeuillez également prendre les mesures de sécurité nécessaires pour protéger votre compte et vos informations personnelles.",
                            "0", "0", "0"));
            grid.setItems(persons);
        });

        hl.add(textField, button);
        vl.add(hl);


        add(vl);
        add(grid);
    }


    private HorizontalLayout createCard(Person person) {
        HorizontalLayout card = new HorizontalLayout();
        card.addClassName("card");
        card.setSpacing(false);
        card.getThemeList().add("spacing-s");

        Image image = new Image();
        image.setSrc(person.getImage());
        image.setWidth("128px");
        image.setHeight("128px");
        VerticalLayout description = new VerticalLayout();
        description.addClassName("description");
        description.setSpacing(false);
        description.setPadding(false);

        HorizontalLayout header = new HorizontalLayout();
        header.addClassName("header");
        header.setSpacing(false);
        header.getThemeList().add("spacing-s");

        Span name = new Span(person.getName());
        name.addClassName("name");
        Span date = new Span(person.getDate());
        date.addClassName("date");
        header.add(name, date);

        Span post = new Span(person.getPost());
        post.addClassName("post");

        HorizontalLayout actions = new HorizontalLayout();
        actions.addClassName("actions");
        actions.setSpacing(false);
        actions.getThemeList().add("spacing-s");

        Icon likeIcon = VaadinIcon.HEART.create();
        likeIcon.addClassName("icon");
        Span likes = new Span(person.getLikes());
        likes.addClassName("likes");
        Icon commentIcon = VaadinIcon.COMMENT.create();
        commentIcon.addClassName("icon");
        Span comments = new Span(person.getComments());
        comments.addClassName("comments");
        Icon shareIcon = VaadinIcon.CONNECT.create();
        shareIcon.addClassName("icon");
        Span shares = new Span(person.getShares());
        shares.addClassName("shares");

        actions.add(likeIcon, likes, commentIcon, comments, shareIcon, shares);

        description.add(header, post, actions);
        card.add(image, description);
        return card;
    }

    @Override
    public void afterNavigation(AfterNavigationEvent event) {

        // Set some data when this view is displayed.
        persons = Arrays.asList( //
                createPerson("https://randomuser.me/api/portraits/men/42.jpg", "John Smith", "May 8",
                        "info@life-news.jp",
                        "1K", "500", "20"),
                createLightBuldAIAnswer( "May 3",
                        "D'après notre base de données, l'adresse email \"info@life-news.jp\" a été observée dans une arnaque de cryptomonnaie connue pour être malveillante. Nous recommandons fortement de ne pas interagir avec ce courriel et de le supprimer immédiatement. Veuillez également prendre les mesures de sécurité nécessaires pour protéger votre compte et vos informations personnelles.",
                        "1K", "500", "20"),

                createPerson("https://randomuser.me/api/portraits/men/24.jpg", "Alberto Raya", "May 3",
                        "jorasanmiguel@hotmail.com",
                        "1K", "500", "20"),
                createLightBuldAIAnswer( "Apr 22",
                        "D'après notre base de données de IOC de courriel malveillants, l'adresse \"jorasanmiguel@hotmail.com\" a été observée dans plusieurs cas d'arnaques de livraison DHL en espagnol. Nous vous recommandons donc de ne pas répondre à ce courriel et de ne pas fournir d'informations personnelles ou financières à son expéditeur. Il est important de rester vigilant face à ce type d'arnaques et de ne pas se faire prendre au piège.",
                        "1K", "500", "20"),

                createPerson("https://randomuser.me/api/portraits/men/76.jpg", "Alf Huncoot", "Apr 21",
                        "directiongeneral231@gmail.com",
                        "1K", "500", "20"),
                createLightBuldAIAnswer( "Apr 17",
                        "D'après notre base de données de IOC, l'adresse e-mail \"directiongeneral231@gmail.com\" a été identifiée comme étant associée à des tentatives d'arnaques sur des fausses arrestations policières. Nous vous conseillons donc de ne pas répondre à ce courriel et de ne pas fournir d'informations personnelles ou financières à son expéditeur présumé. Il est important de signaler ce type de courriel suspect aux autorités compétentes et de sensibiliser vos proches à ces types d'arnaques. Soyez vigilant et ne laissez pas ces criminels vous piéger.",
                        "1K", "500", "20")
        );

        grid.setItems(persons);
    }

    private static Person createPerson(String image, String name, String date, String post, String likes,
                                       String comments, String shares) {
        Person p = new Person();
        p.setImage(image);
        p.setName(name);
        p.setDate(date);
        p.setPost(post);
        p.setLikes(likes);
        p.setComments(comments);
        p.setShares(shares);

        return p;
    }
    private static Person createLightBuldAIAnswer(String date, String post, String likes,
                                            String comments, String shares) {
        Person p = new Person();
        p.setImage("images/LightBulb.png");
        p.setName("LightBulbAI");
        p.setDate(date);
        p.setPost(post);
        p.setLikes(likes);
        p.setComments(comments);
        p.setShares(shares);

        return p;
    }

}
