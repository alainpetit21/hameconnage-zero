package com.hameconnagezero.webapp.views.services;


import com.hameconnagezero.webapp.views.MainLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility;


@PageTitle("ServiceLightSail")
@Route(value = "ServiceLightSail", layout = MainLayout.class)
@AnonymousAllowed
public class ServiceLightSail extends VerticalLayout {
    public ServiceLightSail() {
        setSpacing(true);

        H2 header = new H2("LightSail");
        header.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM);
        add(header);

        add(new Paragraph("LightSail est notre plateforme de formation interactive conçue pour aider les employés à reconnaître les courriels d'hameçonnage. La formation est un aspect crucial pour protéger une entreprise contre les attaques de phishing. Les employés sont souvent la première ligne de défense contre ces attaques, il est donc essentiel qu'ils soient formés de manière adéquate."));
        add(new Paragraph("LightSail utilise une approche ludique pour la formation. En utilisant la gamification, la plateforme utilise un système de pointage et de récompenses pour inciter les employés à se former régulièrement et à mettre en pratique leurs nouvelles connaissances."));
        add(new Paragraph("La plateforme est divisée en plusieurs modules, chacun contenant des vidéos de formation et des exercices pratiques pour aider les employés à mettre en pratique leurs compétences. Les modules sont organisés par niveau de difficulté et de complexité, permettant aux employés de progresser à leur rythme et de manière efficace."));
        add(new Paragraph("LightSail a été conçu pour être interactif et facile à utiliser. Les employés peuvent accéder à la plateforme depuis leur ordinateur de travail ou leur appareil mobile, ce qui leur permet de suivre la formation à leur convenance. Les modules sont courts et concis, et les exercices pratiques sont conçus pour aider les employés à appliquer leurs connaissances dans des situations réelles."));
        add(new Paragraph("L'efficacité de LightSail a été prouvée par de nombreux tests et études. Les entreprises qui utilisent LightSail ont constaté une amélioration significative de la capacité de leurs employés à reconnaître les courriels d'hameçonnage. Les employés formés avec LightSail sont plus confiants et plus aptes à détecter les tentatives d'hameçonnage, ce qui réduit les risques de réussite des attaques de phishing."));
        add(new Paragraph("En combinant notre outil LightSail avec nos outils LightSensor et DarkSensor, nous pouvons créer des exercices de formation adaptés aux courriels réels reçus par les employés, ce qui améliore considérablement le niveau de réalisme de la formation. Les employés peuvent donc pratiquer sur des courriels similaires à ceux qu'ils recevront dans leur travail quotidien, ce qui les prépare mieux à détecter les tentatives d'hameçonnage réelles. Cette approche unique et pratique est un élément clé de notre stratégie globale pour réduire les risques de cyberattaques par hameçonnage."));
        add(new Paragraph("En somme, LightSail est une plateforme de formation interactive et efficace qui aide les employés à reconnaître et à se protéger contre les attaques de phishing. En formant régulièrement les employés, vous renforcez la sécurité de votre entreprise et vous réduisez les risques de compromission de données ou de perte financière."));

        //setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }
}
