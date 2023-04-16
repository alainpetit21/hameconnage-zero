package com.hameconnagezero.webapp.views.lightsail;

import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;


@PermitAll
@Route(value = "LightSailN1V1", layout = LightSailView.class)
public class LightSailN1V1 extends LightSailVideo {

    public LightSailN1V1() {
        super("images/video1.png", """
                Bienvenue dans cette vidéo expliquant le phishing. Le phishing est une technique de cybercriminalité très courante, utilisée pour voler des informations personnelles et financières. Dans cette vidéo, nous allons aborder les trois principales catégories de phishing, et comment les reconnaître pour éviter de devenir une victime.

                [Partie 1 - La reconnaissance des types de phishing et du mauvais formatage]

                Le premier type de phishing est le phishing par email. Les pirates informatiques envoient des courriels de phishing qui semblent être envoyés par des entreprises légitimes, comme des banques ou des sites de commerce électronique. Ces courriels contiennent souvent des liens ou des pièces jointes malveillantes qui infectent l'ordinateur ou volent les informations personnelles de la victime.

                Mais comment repérer ces courriels de phishing ? Premièrement, il faut vérifier l'adresse email de l'expéditeur. Si l'adresse ne semble pas correspondre à l'entreprise qu'elle prétend être, c'est un signe de phishing. Deuxièmement, le formatage du courriel peut être maladroit, avec des fautes d'orthographe ou de grammaire. Les entreprises légitimes ont généralement une équipe de relecture pour éviter de telles erreurs. Donc, si vous voyez de telles erreurs dans un courriel, méfiez-vous.

                """);

    }
}
