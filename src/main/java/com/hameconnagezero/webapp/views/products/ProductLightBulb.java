package com.hameconnagezero.webapp.views.products;


import com.hameconnagezero.webapp.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility;


@PageTitle("ProductLightBulb")
@Route(value = "ProductLightBulb", layout = MainLayout.class)
@AnonymousAllowed
public class ProductLightBulb extends VerticalLayout {
    public ProductLightBulb() {
        setSpacing(true);

        H2 header = new H2("LightBulb");
        header.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM);
        add(header);


        add(new Paragraph("LightBulb est une base de données d'indicateurs d'éléments malveillants dans les courriels, développée par Hameçonnage Zéro pour aider les entreprises à détecter les menaces potentielles dans leurs emails. Cette base de données est le résultat de plus de quatre années de travail acharné et de collecte de données, et est devenue un outil indispensable pour les professionnels de la sécurité informatique."));

        Image img = new Image("images/LightBulb.png", "HZ_LogoBig");
        img.setWidth("512px");
        img.setWidth("256px");
        add(img);

        add(new Paragraph("LightBulb permet de faire des requêtes facilement et rapidement, soit par une API accessible à tous, soit par l'interface web en format Cypher pour Neo4J, ou encore grâce à notre interface de communication LightBulb AI, qui est similaire à un chatbot. Cette interface de communication permet aux utilisateurs de poser des questions sur les indicateurs d'éléments malveillants et d'obtenir des réponses précises et immédiates."));
        add(new Paragraph("L'une des caractéristiques les plus remarquables de LightBulb est sa capacité à fournir des résultats en temps réel, ce qui permet aux utilisateurs de détecter rapidement les menaces et de prendre des mesures pour les contrer. Cette base de données est également régulièrement mise à jour avec les dernières tendances en matière de menaces de courriels malveillants, garantissant ainsi que les utilisateurs ont toujours accès aux informations les plus récentes."));
        add(new Paragraph("LightBulb est facile à utiliser et offre une variété d'options pour accéder à la base de données. Les utilisateurs peuvent effectuer des requêtes à l'aide de notre interface de communication LightBulb AI, ou accéder à la base de données en utilisant notre API ou l'interface web en format Cypher pour Neo4J. Les résultats de LightBulb sont clairs et faciles à comprendre, permettant aux utilisateurs de prendre des décisions éclairées en matière de sécurité informatique."));
        add(new Paragraph("En résumé, LightBulb est un outil essentiel pour les professionnels de la sécurité informatique. Avec sa base de données d'indicateurs d'éléments malveillants dans les courriels, sa capacité à fournir des résultats en temps réel et son accès facile et flexible, LightBulb est un outil incontournable pour toute entreprise soucieuse de sa sécurité informatique. Si vous cherchez à renforcer la sécurité de votre entreprise et à détecter rapidement les menaces de courriels malveillants, LightBulb est l'outil qu'il vous faut."));

        add(new H3("Abonnez-vous! "));
        HorizontalLayout hl = new HorizontalLayout();
        VerticalLayout vlBasic = new VerticalLayout();
        VerticalLayout vlPersonal = new VerticalLayout();
        VerticalLayout vlEnterprise = new VerticalLayout();

        vlBasic.setJustifyContentMode(JustifyContentMode.CENTER);
        vlPersonal.setJustifyContentMode(JustifyContentMode.CENTER);
        vlEnterprise.setJustifyContentMode(JustifyContentMode.CENTER);

        vlBasic.add(new H4("De Base"));
        vlBasic.add(new UnorderedList(
                new ListItem("Prix: Gratuit!"),
                new ListItem("Nb requêtes: 5 / jour"),
                new ListItem("Délai: 1 / heure")));
        vlBasic.add(new Button("Abonnement"));

        vlPersonal.add(new H4("Personnel"));
        vlPersonal.add(new UnorderedList(
                new ListItem("Prix: 10$ / mois"),
                new ListItem("Nb requêtes: 100 / jour"),
                new ListItem("Délai: 1 / minute")));
        vlPersonal.add(new Button("Abonnement"));

        vlEnterprise.add(new H4("Entreprise"));
        vlEnterprise.add(new UnorderedList(
                new ListItem("Prix: 100 000$ / année"),
                new ListItem("Nb requêtes: illimitées!"),
                new ListItem("Délai: illimité")));
        vlEnterprise.add(new Button("Abonnement"));

        hl.add(vlBasic, vlPersonal, vlEnterprise);
        add(hl);

        //setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }
}
