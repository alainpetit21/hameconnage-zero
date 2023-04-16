package com.hameconnagezero.webapp.views.lightsail;

import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;


@PermitAll
@Route(value = "LightSailN3E1", layout = LightSailView.class)
public class LightSailN3E1 extends LightSailExercices {

    public LightSailN3E1() {
        super("""
                Date : 12 avril 2023
                De : support@apple.com
                Subject : Facture d'achat
                Pièce jointe : Facture_d_achat.pdf
                Texte : Bonjour,

                Nous vous remercions pour votre récente commande chez Apple. Veuillez trouver ci-joint votre facture d'achat en format PDF.

                Si vous avez des questions concernant cette commande, veuillez nous contacter en répondant à cet e-mail.

                Cordialement,
                Le support d'Apple""");
    }
}
