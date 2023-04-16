package com.hameconnagezero.webapp.views.lightsail;

import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;


@PermitAll
@Route(value = "LightSailN1E3", layout = LightSailView.class)
public class LightSailN1E3 extends LightSailExercices {

    public LightSailN1E3() {
        super("Date : 12 avril 2023\n" +
                "De : serviceclient@paypal.com\n" +
                "Subject : Votre compte a été suspendu\n" +
                "Pièce jointe : Aucune\n" +
                "Texte : Cher(e) client(e),\n" +
                "\n" +
                "Nous avons détecté une activité suspecte sur votre compte PayPal et avons suspendu l'accès à votre compte par mesure de sécurité. Pour réactiver votre compte, veuillez cliquer sur le lien ci-dessous et suivre les instructions.\n" +
                "\n" +
                "Lien suspect : https://www.paypal-verification.com/reactiver-compte\n" +
                "\n" +
                "Nous vous remercions de votre coopération.\n" +
                "\n" +
                "Cordialement,\n" +
                "Le service client de PayPal");
    }
}
