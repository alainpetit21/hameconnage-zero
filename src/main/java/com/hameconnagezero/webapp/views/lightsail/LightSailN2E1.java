package com.hameconnagezero.webapp.views.lightsail;

import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;


@PermitAll
@Route(value = "LightSailN2E1", layout = LightSailView.class)
public class LightSailN2E1 extends LightSailExercices {

    public LightSailN2E1() {
        super("""
                Date : 12 avril 2023
                De : support@fedex.com
                Subject : Votre colis n'a pas pu être livré
                Pièce jointe : Aucune
                Texte : Bonjour,

                Nous avons tenté de livrer votre colis mais nous avons rencontré un problème. Veuillez cliquer sur le lien ci-dessous pour confirmer votre adresse de livraison et programmer une nouvelle livraison.

                Lien suspect : https://www.fedex-livraison.com/programmer-livraison

                Nous vous remercions de votre coopération.

                Cordialement,
                Le support de FedEx""");
    }
}
