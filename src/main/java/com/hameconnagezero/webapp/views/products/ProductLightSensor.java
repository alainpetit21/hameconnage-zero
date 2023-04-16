package com.hameconnagezero.webapp.views.products;


import com.hameconnagezero.webapp.views.MainLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility;


@PageTitle("ProductLightSensor")
@Route(value = "ProductLightSensor", layout = MainLayout.class)
@AnonymousAllowed
public class ProductLightSensor extends VerticalLayout {
    public ProductLightSensor() {
        setSpacing(true);

        H2 header = new H2("LightSensor");
        header.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM);
        add(header);

        add(new Paragraph("LightSensor est un modèle d'IA de pointe développé par Hameçonnage Zéro pour aider les entreprises à détecter les courriels de phishing et à protéger leurs données sensibles. Conçu pour être utilisé en conjonction avec LightSnitch, notre agent d'interception de courriel, LightSensor utilise les dernières avancées en matière d'apprentissage automatique pour classifier les courriels et identifier les messages malveillants."));

        Image img = new Image("images/lightSensorClassifier.png", "HZ_LogoBig");
        img.setWidth("512px");
        img.setWidth("256px");
        add(img);

        add(new Paragraph("L'installation de LightSnitch sur une station de travail ou sur un serveur Exchange permet de capturer l'ensemble du trafic de messagerie entrant et sortant, ce qui permet à LightSensor de classifier rapidement les courriels et de les catégoriser en fonction de leur niveau de risque. Les messages qui présentent un risque élevé sont immédiatement signalés à l'utilisateur, permettant ainsi une réponse rapide et efficace pour empêcher les attaques de phishing."));
        add(new Paragraph("Le modèle LightSensor utilise une variété de techniques d'apprentissage automatique pour identifier les courriels malveillants, y compris la classification supervisée et non supervisée, ainsi que la détection d'anomalies. Le modèle est régulièrement mis à jour pour inclure les dernières tendances en matière de cybermenaces et pour améliorer la précision de la classification des courriels."));
        add(new Paragraph("LightSensor est facile à utiliser et s'intègre parfaitement avec LightSnitch. Les utilisateurs peuvent gérer les paramètres de sécurité et les seuils de classification des courriels de manière transparente, permettant ainsi une personnalisation complète de l'outil. Les rapports de LightSensor sont clairs et détaillés, permettant aux administrateurs de sécurité de visualiser facilement les tendances et les problèmes potentiels liés aux courriels malveillants."));
        add(new Paragraph("En résumé, LightSensor est un outil d'intelligence artificielle de pointe conçu pour aider les entreprises à détecter les courriels de phishing et à protéger leurs données sensibles. Avec l'intégration facile de LightSnitch et la puissance de l'apprentissage automatique, LightSensor fournit une solution complète pour la gestion des courriels malveillants. Si vous cherchez à améliorer votre sécurité informatique et à protéger votre entreprise contre les menaces de phishing, LightSensor est l'outil idéal pour vous aider à atteindre cet objectif."));

        //setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }
}
