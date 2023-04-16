package com.hameconnagezero.webapp.views.lightsail;

import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;


@PermitAll
@Route(value = "LightSailN1E1", layout = LightSailView.class)
public class LightSailN1E1 extends LightSailExercices {

    public LightSailN1E1() {
        super("Date : 12 avril 2023\n" +
                "De : support@microsoft-outlook.com\n" +
                "Subject : Votre compte est verrouillé\n" +
                "Pièce jointe : Aucune\n" +
                "Texte : Cher(e) utilisateur/trice,\n" +
                "\n" +
                "Nous avons détecté une activité inhabituelle sur votre compte de messagerie Microsoft Outlook. Pour protéger vos informations, nous avons temporairement verrouillé votre compte.\n" +
                "\n" +
                "Pour débloquer votre compte, veuillez cliquer sur le lien ci-dessous et suivre les instructions.\n" +
                "\n" +
                "Lien suspect : https://www.microsoft-outlook-verification.com/debloquer-compte\n" +
                "\n" +
                "Nous vous remercions de votre collaboration.\n" +
                "\n" +
                "Cordialement,\n" +
                "Le support de Microsoft Outlook");
    }
}
