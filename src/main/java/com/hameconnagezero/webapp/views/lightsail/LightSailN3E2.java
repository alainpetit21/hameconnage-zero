package com.hameconnagezero.webapp.views.lightsail;

import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;


@PermitAll
@Route(value = "LightSailN3E2", layout = LightSailView.class)
public class LightSailN3E2 extends LightSailExercices {

    public LightSailN3E2() {
        super("Date : 12 avril 2023\n" +
                "De : serviceclient@amazon.com\n" +
                "Subject : Confirmation de commande\n" +
                "Pièce jointe : Confirmation_de_commande.doc\n" +
                "Texte : Bonjour,\n" +
                "\n" +
                "Nous vous remercions pour votre récente commande sur Amazon. Veuillez trouver ci-joint la confirmation de votre commande en format Word.\n" +
                "\n" +
                "Si vous avez des questions ou des préoccupations concernant cette commande, veuillez nous contacter en répondant à cet e-mail.\n" +
                "\n" +
                "Cordialement,\n" +
                "Le service client d'Amazon");
    }
}
