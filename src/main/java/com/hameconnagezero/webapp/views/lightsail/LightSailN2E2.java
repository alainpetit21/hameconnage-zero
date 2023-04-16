package com.hameconnagezero.webapp.views.lightsail;

import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;


@PermitAll
@Route(value = "LightSailN2E2", layout = LightSailView.class)
public class LightSailN2E2 extends LightSailExercices {

    public LightSailN2E2() {
        super("Date : 12 avril 2023\n" +
                "De : info@linkedin.com\n" +
                "Subject : Nouvelle connexion à votre compte LinkedIn\n" +
                "Pièce jointe : Aucune\n" +
                "Texte : Bonjour,\n" +
                "\n" +
                "Nous avons détecté une connexion inconnue à votre compte LinkedIn. Si vous n'êtes pas à l'origine de cette connexion, veuillez cliquer sur le lien ci-dessous pour sécuriser votre compte.\n" +
                "\n" +
                "Lien suspect : https://www.linkedin-verification.com/securiser-compte\n" +
                "\n" +
                "Nous vous remercions de votre coopération.\n" +
                "\n" +
                "Cordialement,\n" +
                "L'équipe de LinkedIn");
    }
}
