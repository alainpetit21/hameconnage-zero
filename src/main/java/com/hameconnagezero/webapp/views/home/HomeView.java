package com.hameconnagezero.webapp.views.home;

import com.hameconnagezero.webapp.views.MainLayout;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility;

@PageTitle("Home")
@Route(value = "home", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@AnonymousAllowed
public class HomeView extends VerticalLayout {

    private TextField name;
    private Button sayHello;

    public HomeView() {
        setSpacing(true);


        H2 header = new H2("Bienvenue sur le site de \"Hameçonnage Zéro\"");
        header.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM);
        add(header);


        Image img = new Image("images/HZ_LogoBig.png", "HZ_LogoBig");
        img.setWidth("512px");
        img.setWidth("256px");
        add(img);


        add(new Paragraph("Nous sommes une compagnie spécialisée en renseignement des cybermenaces. Nous sommes un leader dans la lutte contre l'hameçonnage, et nous sommes fiers de vous offrir des produits de pointe basés sur l'IA pour détecter les courriels malveillants. En plus de cela, nous proposons une plate-forme de formation et des campagnes de sensibilisation au hameçonnage. Fondée en 2020, notre entreprise a été créée en réponse à l'augmentation des courriels d'hameçonnage liés à la pandémie de COVID-19. Depuis lors, nous avons travaillé dur pour offrir des solutions efficaces pour aider les entreprises et les particuliers à se protéger contre ces menaces."));

        H3 subTitle = new H3("Nos produits de renseignement des cybermenaces");
        subTitle.addClassNames(LumoUtility.Margin.Top.LARGE, LumoUtility.Margin.Bottom.MEDIUM);
        add(subTitle);

        add(new Paragraph("Chez \"Hameçonnage Zéro\", nous sommes passionnés par la création de produits de haute qualité qui protègent les utilisateurs contre les menaces d'hameçonnage. Nous sommes fiers de vous présenter notre suite de produits basés sur l'IA pour détecter les courriels malveillants. Notre ligne de produits \"Light\" and \"Dark\", sont une suite de solutions de détection d'hameçonnage entièrement automatisée qui utilise l'IA pour détecter les courriels malveillants et les bloquer avant qu'ils n'atteignent les utilisateurs finaux. Nous offrons également des solutions personnalisées pour les entreprises qui ont des besoins spécifiques en matière de protection contre l'hameçonnage."));

        subTitle = new H3("Notre plateforme de formation");
        subTitle.addClassNames(LumoUtility.Margin.Top.LARGE, LumoUtility.Margin.Bottom.MEDIUM);
        add(subTitle);

        add(new Paragraph("Nous offrons également une plate-forme de formation pour aider les utilisateurs à identifier les courriels d'hameçonnage et à les éviter. Notre programme de formation est conçu pour être accessible à tous les utilisateurs, quels que soient leur niveau d'expérience en informatique ou leur rôle professionnel. Nous sommes convaincus que la formation est essentielle pour lutter efficacement contre les menaces d'hameçonnage, et nous sommes fiers de jouer un rôle actif dans la sensibilisation des utilisateurs aux bonnes pratiques en matière de sécurité informatique."));

        subTitle = new H3("Nos campagnes de sensibilisation");
        subTitle.addClassNames(LumoUtility.Margin.Top.LARGE, LumoUtility.Margin.Bottom.MEDIUM);
        add(subTitle);

        add(new Paragraph("Enfin, nous sommes également engagés dans des campagnes de sensibilisation au hameçonnage pour aider à informer les utilisateurs sur les dernières tendances en matière de cybercriminalité. Nous travaillons avec des organisations du secteur pour créer des programmes de sensibilisation qui éduquent les utilisateurs sur les différents types d'hameçonnage et sur les meilleures pratiques pour éviter de tomber dans le piège. Nous croyons que la prévention est la meilleure arme contre l'hameçonnage, et nous sommes fiers de contribuer à la création d'un monde où l'hameçonnage n'est plus un problème majeur."));

        add(new Paragraph("Chez \"Hameçonnage Zéro\", nous sommes fiers de proposer des solutions de pointe pour aider les entreprises et les particuliers à se protéger contre les menaces d'hameçonnage. Nous croyons que la formation et la sensibilisation sont des éléments clés pour lutter contre l'hameçonnage, et nous sommes engagés à fournir des solutions de haute qualité pour aider à réduire les risques. Nous sommes une entreprise jeune et dynamique, et nous sommes impatients de travailler avec vous pour rendre l'utilisation d'Internet plus sûre pour tous."));

        //setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }

}
