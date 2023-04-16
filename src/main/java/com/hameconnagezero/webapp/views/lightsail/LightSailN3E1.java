package com.hameconnagezero.webapp.views.lightsail;

import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;


@PermitAll
@Route(value = "LightSailN3E1", layout = LightSailView.class)
public class LightSailN3E1 extends LightSailExercices {

    public LightSailN3E1() {
        super("Date : 12 avril 2023\n" +
                "De : support@apple.com\n" +
                "Subject : Facture d'achat\n" +
                "Pièce jointe : Facture_d_achat.pdf\n" +
                "Texte : Bonjour,\n" +
                "\n" +
                "Nous vous remercions pour votre récente commande chez Apple. Veuillez trouver ci-joint votre facture d'achat en format PDF.\n" +
                "\n" +
                "Si vous avez des questions concernant cette commande, veuillez nous contacter en répondant à cet e-mail.\n" +
                "\n" +
                "Cordialement,\n" +
                "Le support d'Apple");
    }
}
