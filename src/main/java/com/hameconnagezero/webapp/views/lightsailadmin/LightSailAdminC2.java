package com.hameconnagezero.webapp.views.lightsailadmin;

import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;


@PermitAll
@Route(value = "LightSailAdminC2", layout = LightSailAdminView.class)
public class LightSailAdminC2 extends LightSailAdminCampaign {

    public LightSailAdminC2() {
        super("""
                Date : 12 avril 2023
                De : support@banquefictive.com
                Subject : Votre compte a été suspendu
                Pièce jointe : Aucune
                Texte : Bonjour,

                Nous avons détecté une activité suspecte sur votre compte bancaire et avons suspendu l'accès à votre compte par mesure de sécurité. Pour réactiver votre compte, veuillez cliquer sur le lien ci-dessous et suivre les instructions.

                Lien suspect : https://www.banquefictive-verification.com/reactiver-compte

                Nous vous remercions de votre coopération.

                Cordialement,
                Le support de Banque Fictive""", "images/Campaign20230316_Score.png", "75%");

    }
}
