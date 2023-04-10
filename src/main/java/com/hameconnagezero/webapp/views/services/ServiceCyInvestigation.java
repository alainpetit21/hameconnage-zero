package com.hameconnagezero.webapp.views.services;


import com.hameconnagezero.webapp.views.MainLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility;

@PageTitle("ServiceCyInvestigation")
@Route(value = "ServiceCyInvestigation", layout = MainLayout.class)
@AnonymousAllowed
public class ServiceCyInvestigation extends VerticalLayout {
    public ServiceCyInvestigation() {
        setSpacing(true);

        H2 header = new H2("CyInvestigation");
        header.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM);
        add(header);

        add(new Paragraph("Chez Hameçonnage Zéro, nous comprenons l'importance de comprendre l'origine des courriels malveillants. C'est pourquoi nous avons créé notre service d'investigation cybernétique, CyInvestigation. Nous avons rassemblé une équipe d'enquêteurs dédiés qui sont prêts à travailler avec vous pour déterminer l'origine de ces courriels et vous aider à comprendre leur histoire."));
        add(new Paragraph("Avec plus de 20 ans d'expérience cumulée, notre équipe d'enquêteurs possède une expertise inégalée en matière de cybercriminalité. Ils utilisent des techniques avancées pour retracer l'origine des courriels malveillants, en remontant les chaînes de données pour découvrir les auteurs de ces attaques. Notre équipe travaille en étroite collaboration avec vous pour vous fournir des rapports détaillés sur l'origine des courriels, vous donnant ainsi un aperçu de l'histoire complète de ces tentatives d'hameçonnage."));
        add(new Paragraph("Avec CyInvestigation, vous pouvez en apprendre davantage sur la manière dont les cybercriminels tentent de vous cibler et comment vous pouvez vous protéger à l'avenir. Notre équipe d'enquêteurs est dédiée à fournir un service de haute qualité à nos clients, en utilisant des méthodes éprouvées pour résoudre les enquêtes. Nous travaillons également en étroite collaboration avec les autorités locales pour poursuivre les auteurs de ces attaques, afin de protéger nos clients contre les menaces futures."));
        add(new Paragraph("En résumé, notre service d'investigation cybernétique, CyInvestigation, est un outil essentiel pour tout propriétaire d'entreprise souhaitant comprendre et se protéger contre les courriels malveillants. Avec notre équipe d'enquêteurs expérimentés et dévoués, vous pouvez vous sentir en sécurité en sachant que nous travaillons pour protéger vos données et votre entreprise contre les menaces en ligne."));

        //setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }
}
