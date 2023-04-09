package com.hameconnagezero.webapp.views.about;

import com.hameconnagezero.webapp.views.MainLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;

@PageTitle("About")
@Route(value = "about", layout = MainLayout.class)
@AnonymousAllowed
public class AboutView extends VerticalLayout {

    public AboutView() {
        setSpacing(true);


        H2 header = new H2("À propos de \"Hameçonnage Zéro\"");
        header.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM);
        add(header);

        Image img = new Image("images/HZ_LogoBig.png", "HZ_LogoBig");
        img.setWidth("512px");
        img.setWidth("256px");
        add(img);


        add(new Paragraph("Alain Petit, Jérémie Dufault, Alexandre Guindon, et Jonathan Dubreuil sont les fondateurs de \"Hameçonnage Zéro\", une entreprise spécialisée en Cyber Threat Intelligence, qui se concentre sur la lutte contre le phishing. Ces quatre entrepreneurs ont travaillé ensemble pour créer une entreprise novatrice qui aide les entreprises et les particuliers à se protéger contre les menaces de phishing en utilisant des produits basés sur l'IA, des programmes de formation, et des campagnes de sensibilisation."));

        img = new Image("images/AlainPetit.png", "AlainPetit");
        img.setWidth("256px");
        add(img);
        H3 subTitle = new H3("Alain Petit");
        subTitle.addClassNames(LumoUtility.Margin.Top.LARGE, LumoUtility.Margin.Bottom.MEDIUM);
        add(subTitle);
        add(new Paragraph("Originaire de Montréal, a étudié l'informatique à l'Université de Montréal avant de travailler dans le domaine de la sécurité informatique pendant plusieurs années. Avec sa vaste expérience dans la création de solutions de sécurité informatique, Alain est devenu un expert dans la détection des menaces de phishing et a eu l'idée de créer une entreprise spécialisée dans ce domaine."));

        img = new Image("images/JérémieDufault.png", "JérémieDufault");
        img.setWidth("256px");
        add(img);
        subTitle = new H3("Jérémie Dufault");
        subTitle.addClassNames(LumoUtility.Margin.Top.LARGE, LumoUtility.Margin.Bottom.MEDIUM);
        add(subTitle);
        add(new Paragraph("Également de Montréal, a étudié la cybersécurité à l'Université Concordia avant de travailler dans le domaine de la sécurité informatique. Avec son expérience en tant qu'analyste en cybersécurité, Jérémie a apporté une connaissance approfondie de la manière dont les hackers utilisent les courriels de phishing pour tromper les utilisateurs."));


        img = new Image("images/AlexandreGuindon.png", "AlexandreGuindon");
        img.setWidth("256px");
        add(img);
        subTitle = new H3("Alexandre Guindon");
        subTitle.addClassNames(LumoUtility.Margin.Top.LARGE, LumoUtility.Margin.Bottom.MEDIUM);
        add(subTitle);
        add(new Paragraph("Originaire de Québec, a étudié l'ingénierie informatique à l'Université Laval avant de travailler dans le domaine de la sécurité informatique. Avec son expérience en tant qu'ingénieur en cybersécurité, Alexandre a apporté une expertise technique dans la création de produits de sécurité informatique."));


        img = new Image("images/JonathanDubreuil.png", "JonathanDubreuil");
        img.setWidth("256px");
        add(img);
        subTitle = new H3("JonathanDubreuil");
        subTitle.addClassNames(LumoUtility.Margin.Top.LARGE, LumoUtility.Margin.Bottom.MEDIUM);
        add(subTitle);
        add(new Paragraph("Originaire de Sherbrooke, a étudié l'informatique à l'Université de Sherbrooke avant de travailler dans le domaine de la sécurité informatique. Avec son expérience en tant qu'analyste en cybersécurité, Jonathan a apporté une connaissance approfondie de la manière dont les hackers utilisent les courriels de phishing pour accéder à des informations sensibles."));


        add(new Paragraph("En travaillant ensemble, Alain, Jérémie, Alexandre, et Jonathan ont créé \"Hameçonnage Zéro\" pour aider les entreprises et les particuliers à se protéger contre les menaces de phishing en utilisant des solutions basées sur l'IA. Leur passion pour la cybersécurité et leur engagement à créer un monde plus sûr en ligne ont conduit à la création d'une entreprise novatrice qui a permis de protéger des milliers d'utilisateurs contre les menaces de phishing."));
        add(new Paragraph("Au fil des ans, les fondateurs de \"Hameçonnage Zéro\" ont développé une solide équipe de professionnels de la cybersécurité pour aider à construire leur entreprise. Ensemble, ils ont travaillé dur pour créer des produits de pointe qui offrent une protection supérieure contre les menaces de phishing. Leur expertise et leur expérience ont permis à l'entreprise de se développer rapidement et de devenir un leader dans le domaine de la Cyber Threat Intelligence."));
        add(new Paragraph("Avec leur engagement à aider les entreprises et les particuliers à se protéger contre les menaces de phishing, les fondateurs de \"Hameçonnage Zéro\" ont créé une entreprise qui est déterminée à lutter contre le phishing et à protéger les utilisateurs contre les cybercriminals."));


        //setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }

}
