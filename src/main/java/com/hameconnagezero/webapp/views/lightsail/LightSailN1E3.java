package com.hameconnagezero.webapp.views.lightsail;

import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;


@PermitAll
@Route(value = "LightSailN1E3", layout = LightSailView.class)
public class LightSailN1E3 extends LightSailExercices {

    public LightSailN1E3() {
        super("""
                Date : 12 avril 2023
                De : serviceclient@paypal.com
                Subject : Votre compte a été suspendu
                Pièce jointe : Aucune
                Texte : Cher(e) client(e),

                Nous avons détecté une activité suspecte sur votre compte PayPal et avons suspendu l'accès à votre compte par mesure de sécurité. Pour réactiver votre compte, veuillez cliquer sur le lien ci-dessous et suivre les instructions.

                Lien suspect : https://www.paypal-verification.com/reactiver-compte

                Nous vous remercions de votre coopération.

                Cordialement,
                Le service client de PayPal""");
    }
}
