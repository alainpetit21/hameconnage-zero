package com.hameconnagezero.webapp.views.lightsail;

import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;


@PermitAll
@Route(value = "LightSailN2E3", layout = LightSailView.class)
public class LightSailN2E3 extends LightSailExercices {

    public LightSailN2E3() {
        super("""
                Date : 12 avril 2023
                De : support@icloud.com
                Subject : Votre compte iCloud a été suspendu
                Pièce jointe : Aucune
                Texte : Cher(e) utilisateur/trice,

                Nous avons détecté une activité suspecte sur votre compte iCloud et avons suspendu l'accès à votre compte par mesure de sécurité. Pour réactiver votre compte, veuillez cliquer sur le lien ci-dessous et suivre les instructions.

                Lien suspect : https://www.icloud-verification.com/reactiver-compte

                Nous vous remercions de votre coopération.

                Cordialement,
                Le support d'iCloud""");
    }
}
