package com.hameconnagezero.webapp.views.services;


import com.hameconnagezero.webapp.views.MainLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility;


@PageTitle("ServiceCampaign")
@Route(value = "ServiceCampaign", layout = MainLayout.class)
@AnonymousAllowed
public class ServiceCampaign extends VerticalLayout {
    public ServiceCampaign() {
        setSpacing(true);

        H2 header = new H2("Campagne de sensibilisation");
        header.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM);
        add(header);

        add(new Paragraph("Nos Services de campagne de sensibilisation sur mesure sont conçus pour aider les entreprises à sensibiliser leurs employés aux risques de courriels d'hameçonnage. Nous savons que chaque entreprise est unique et qu'il est important de personnaliser notre approche pour répondre à leurs besoins spécifiques. Nous travaillons en étroite collaboration avec nos clients pour comprendre leur environnement et les risques auxquels ils sont confrontés, afin de développer des campagnes de sensibilisation sur mesure qui répondent à leurs besoins."));
        add(new Paragraph("Nos campagnes de sensibilisation sont menées par une équipe dédiée de professionnels expérimentés en cybersécurité, comprenant des enquêteurs, des techniciens, des développeurs et des représentants. Nous avons une vaste expérience dans la réalisation de campagnes de sensibilisation réussies, et nous sommes fiers d'aider nos clients à atteindre leurs objectifs en matière de sécurité des courriels."));
        add(new Paragraph("Nous comprenons l'importance de mesurer l'efficacité de nos campagnes de sensibilisation, c'est pourquoi nous fournissons des rapports détaillés sur les résultats de chaque campagne. Ces rapports incluent des analyses statistiques et des commentaires de nos professionnels, ainsi que des recommandations pour améliorer la sécurité des courriels à l'avenir."));
        add(new Paragraph("Nous croyons que la sensibilisation est un élément clé de la cybersécurité, et nous sommes passionnés par notre mission d'aider les entreprises à protéger leurs employés et leurs données. Si vous cherchez à renforcer la sécurité de vos courriels et à protéger votre entreprise contre les risques d'hameçonnage, nous sommes là pour vous aider."));

        add (new H3("Clients satisfaits: "));

        HorizontalLayout hl = new HorizontalLayout();
        VerticalLayout vl = new VerticalLayout();

        vl.add(new H4("Gestion Immobilière Smith"));
        vl.add(new Paragraph("\"Grâce à Hameçonnage Zéro, nous avons pu former notre équipe sur la sécurité des courriels et minimiser les risques de violation de données. Leur approche personnalisée et leur expertise en matière de cybersécurité ont été précieuses pour nous. Nous sommes très satisfaits des résultats de notre campagne de sensibilisation et nous recommandons fortement les services de Hameçonnage Zéro.\""));
        vl.add(new Paragraph("John Smith, Directeur Général"));
        hl.add(vl);

        vl.add(new H4("Consultation Médicale Brown"));
        vl.add(new Paragraph("\"Notre entreprise a subi plusieurs violations de données à cause d'emails malveillants avant de faire appel à Hameçonnage Zéro. Grâce à leur formation approfondie, nous avons pu sensibiliser notre équipe à la sécurité des courriels et protéger nos données sensibles. Leur approche personnalisée et leur équipe d'experts ont été inestimables pour notre entreprise. Nous sommes reconnaissants pour leur service exceptionnel.\""));
        vl.add(new Paragraph("Sarah Brown, Directrice des opérations"));
        hl.add(vl);

        vl.add(new H4("Services Financiers Dupont"));
        vl.add(new Paragraph("\"Hameçonnage Zéro nous a aidés à identifier les vulnérabilités dans notre système de courrier électronique et à former notre équipe pour une meilleure sécurité. Nous sommes très satisfaits de la qualité du service et de l'attention aux détails de l'équipe de Hameçonnage Zéro. Leur plateforme de formation est conviviale et leur expertise en matière de cybersécurité est incomparable. Nous recommandons fortement leurs services pour tout type d'entreprise qui cherche à se protéger contre les attaques de courriel malveillant.\""));
        vl.add(new Paragraph("Philippe Dupont, Directeur des finances"));
        hl.add(vl);
        add(hl);

        //setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }
}
