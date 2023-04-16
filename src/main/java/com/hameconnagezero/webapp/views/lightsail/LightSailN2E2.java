package com.hameconnagezero.webapp.views.lightsail;

import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;


@PermitAll
@Route(value = "LightSailN2E2", layout = LightSailView.class)
public class LightSailN2E2 extends LightSailExercices {

    public LightSailN2E2() {
        super("""
                Date : 12 avril 2023
                De : info@linkedin.com
                Subject : Nouvelle connexion à votre compte LinkedIn
                Pièce jointe : Aucune
                Texte : Bonjour,

                Nous avons détecté une connexion inconnue à votre compte LinkedIn. Si vous n'êtes pas à l'origine de cette connexion, veuillez cliquer sur le lien ci-dessous pour sécuriser votre compte.

                Lien suspect : https://www.linkedin-verification.com/securiser-compte

                Nous vous remercions de votre coopération.

                Cordialement,
                L'équipe de LinkedIn""");
    }
}
