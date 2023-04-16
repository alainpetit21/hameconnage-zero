package com.hameconnagezero.webapp.views.lightsail;

import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;


@PermitAll
@Route(value = "LightSailN2E1", layout = LightSailView.class)
public class LightSailN2E1 extends LightSailExercices {

    public LightSailN2E1() {
        super("Date : 12 avril 2023\n" +
                "De : support@fedex.com\n" +
                "Subject : Votre colis n'a pas pu être livré\n" +
                "Pièce jointe : Aucune\n" +
                "Texte : Bonjour,\n" +
                "\n" +
                "Nous avons tenté de livrer votre colis mais nous avons rencontré un problème. Veuillez cliquer sur le lien ci-dessous pour confirmer votre adresse de livraison et programmer une nouvelle livraison.\n" +
                "\n" +
                "Lien suspect : https://www.fedex-livraison.com/programmer-livraison\n" +
                "\n" +
                "Nous vous remercions de votre coopération.\n" +
                "\n" +
                "Cordialement,\n" +
                "Le support de FedEx");
    }
}
