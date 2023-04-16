package com.hameconnagezero.webapp.views.products;


import com.hameconnagezero.webapp.views.MainLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility;


@PageTitle("ProductDarkSensor")
@Route(value = "ProductDarkSensor", layout = MainLayout.class)
@AnonymousAllowed
public class ProductDarkSensor extends VerticalLayout {
    public ProductDarkSensor() {
        setSpacing(true);

        H2 header = new H2("DarkSensor");
        header.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM);
        add(header);

        add(new Paragraph("DarkSensor est un outil développé par Hameçonnage Zéro pour aider les entreprises à former leurs employés à détecter les tentatives de hameçonnage. Ce modèle d'intelligence artificielle est capable de générer de faux courriels d'hameçonnage qui peuvent être utilisés dans notre plateforme de formation \"LightSail\" ou dans des campagnes sur mesure pour nos clients."));
        add(new Paragraph("Le principal avantage de DarkSensor est qu'il permet aux entreprises de former leurs employés de manière pratique et réaliste. En effet, les faux courriels d'hameçonnage générés par DarkSensor sont conçus pour ressembler à des courriels d'hameçonnage réels, ce qui permet aux employés de s'entraîner à détecter les signes d'une attaque réelle."));
        add(new Paragraph("En utilisant DarkSensor dans notre plateforme de formation \"LightSail\", les entreprises peuvent former leurs employés de manière efficace et à grande échelle. La plateforme \"LightSail\" propose une formation interactive et immersive qui utilise des cas d'utilisation réels pour aider les employés à comprendre les risques associés à l'hameçonnage et à développer les compétences nécessaires pour les éviter."));
        add(new Paragraph("DarkSensor peut également être utilisé pour des campagnes sur mesure pour nos clients. En effet, nos clients peuvent nous fournir des informations sur leur entreprise et leurs employés, et nous pouvons utiliser DarkSensor pour générer des faux courriels d'hameçonnage personnalisés pour leur entreprise. Cela permet aux clients de mesurer l'efficacité de leur formation et de leur sensibilisation à l'hameçonnage, ainsi que de prendre des mesures pour améliorer leur sécurité informatique."));
        add(new Paragraph("En résumé, DarkSensor est un outil essentiel pour les entreprises qui cherchent à améliorer leur sécurité informatique. En permettant aux employés de s'entraîner à détecter les tentatives d'hameçonnage de manière pratique et réaliste, DarkSensor aide les entreprises à réduire les risques associés à l'hameçonnage. Que ce soit dans le cadre de notre plateforme de formation \"LightSail\" ou de campagnes sur mesure pour nos clients, DarkSensor est un outil incontournable pour toute entreprise soucieuse de sa sécurité informatique."));

        //setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }
}
