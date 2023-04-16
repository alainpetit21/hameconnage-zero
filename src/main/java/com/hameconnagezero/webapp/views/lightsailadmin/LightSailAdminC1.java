package com.hameconnagezero.webapp.views.lightsailadmin;

import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;


@PermitAll
@Route(value = "LightSailAdminC1", layout = LightSailAdminView.class)
public class LightSailAdminC1 extends LightSailAdminCampaign {

    public LightSailAdminC1() {
        super("""
                Date : 12 avril 2023
                De : support@microsoft-outlook.com
                Subject : Votre compte est verrouillé
                Pièce jointe : Aucune
                Texte : Cher(e) utilisateur/trice,

                Nous avons détecté une activité inhabituelle sur votre compte de messagerie Microsoft Outlook. Pour protéger vos informations, nous avons temporairement verrouillé votre compte.

                Pour débloquer votre compte, veuillez cliquer sur le lien ci-dessous et suivre les instructions.

                Lien suspect : https://www.microsoft-outlook-verification.com/debloquer-compte

                Nous vous remercions de votre collaboration.

                Cordialement,
                Le support de Microsoft Outlook""", "images/Campaign20230312_Score.png", "50%");

    }
}
