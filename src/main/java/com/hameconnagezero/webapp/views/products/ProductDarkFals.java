package com.hameconnagezero.webapp.views.products;


import com.hameconnagezero.webapp.views.MainLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility;

@PageTitle("ProductDarkFals")
@Route(value = "ProductDarkFals", layout = MainLayout.class)
@AnonymousAllowed
public class ProductDarkFals extends VerticalLayout {
    public ProductDarkFals() {
        setSpacing(true);

        H2 header = new H2("DarkFals");
        header.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM);
        add(header);

        add(new Paragraph("DarkFals est un outil révolutionnaire développé par Hameçonnage Zéro pour aider à lutter contre les cyberattaques à travers les courriels de phishing. Ce modèle d'intelligence artificielle est conçu pour générer des conversations avec les auteurs de courriels malveillants, dans le but de leur faire perdre leur temps et de réduire l'utilisation globale de courriels de phishing."));
        add(new Paragraph("L'idée derrière DarkFals est d'utiliser un \"honeypot\" spécialement conçu pour les courriels, qui permet de piéger les auteurs de courriels malveillants en leur faisant croire qu'ils ont réussi à piéger leur cible. En réalité, le \"honeypot\" de DarkFals est un faux destinataire de courriel qui répond automatiquement aux auteurs de courriels malveillants, leur faisant perdre leur temps et les empêchant de cibler d'autres victimes."));
        add(new Paragraph("Le principal avantage de DarkFals est qu'il réduit considérablement le nombre de courriels de phishing en réponse aux attaques malveillantes. En répondant automatiquement aux auteurs de courriels malveillants, DarkFals les empêche de cibler d'autres victimes potentielles. Cela permet de réduire le nombre de tentatives de phishing et de renforcer la sécurité des entreprises et des particuliers."));
        add(new Paragraph("En outre, DarkFals permet de recueillir des informations précieuses sur les tactiques et les techniques utilisées par les auteurs de courriels malveillants. En surveillant les conversations générées par DarkFals, nous pouvons identifier les tendances et les schémas de comportement utilisés par les auteurs de courriels malveillants. Ces informations sont ensuite utilisées pour améliorer la sécurité des entreprises et des particuliers contre les attaques de phishing."));
        add(new Paragraph("En résumé, DarkFals est un outil essentiel pour les entreprises et les particuliers qui cherchent à renforcer leur sécurité contre les cyberattaques. En piégeant les auteurs de courriels malveillants et en leur faisant perdre leur temps, DarkFals réduit considérablement le nombre de tentatives de phishing. De plus, en recueillant des informations sur les tactiques et les techniques utilisées par les auteurs de courriels malveillants, DarkFals permet de renforcer la sécurité des entreprises et des particuliers contre les attaques de phishing."));

        //setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }
}
