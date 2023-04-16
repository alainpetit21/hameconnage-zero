package com.hameconnagezero.webapp.views.lightsail;

import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;


@PermitAll
@Route(value = "LightSailN1E2", layout = LightSailView.class)
public class LightSailN1E2 extends LightSailExercices {

    public LightSailN1E2() {
        super("Date : 12 avril 2023\n" +
                "De : support@banquefictive.com\n" +
                "Subject : Votre compte a été suspendu\n" +
                "Pièce jointe : Aucune\n" +
                "Texte : Bonjour,\n" +
                "\n" +
                "Nous avons détecté une activité suspecte sur votre compte bancaire et avons suspendu l'accès à votre compte par mesure de sécurité. Pour réactiver votre compte, veuillez cliquer sur le lien ci-dessous et suivre les instructions.\n" +
                "\n" +
                "Lien suspect : https://www.banquefictive-verification.com/reactiver-compte\n" +
                "\n" +
                "Nous vous remercions de votre coopération.\n" +
                "\n" +
                "Cordialement,\n" +
                "Le support de Banque Fictive");
    }
}
