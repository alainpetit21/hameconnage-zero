package com.hameconnagezero.webapp.views.lightsail;

import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;


@PermitAll
@Route(value = "LightSailN3V1", layout = LightSailView.class)
public class LightSailN3V1 extends LightSailVideo {

    public LightSailN3V1() {
        super("images/video3.png", """
                [Partie 3 - La reconnaissance des marques de commerce connues utilisées à des fins malveillantes]

                Le troisième type de phishing est le phishing par hameçonnage. Les pirates informatiques créent des sites Web et des courriels qui ressemblent à des sites Web et des courriels légitimes pour tromper les victimes en leur faisant croire qu'elles ont affaire à une entreprise de confiance. Ils utilisent souvent des marques de commerce connues, comme des banques ou des sites de commerce électronique, pour tromper les victimes.

                Comment reconnaître ces sites Web de phishing ? Premièrement, vous devez vérifier l'URL du site Web. Les sites de phishing ont souvent des URL similaires à ceux des sites Web légitimes, mais avec quelques lettres ou caractères différents. Deuxièmement, il est important de vérifier le certificat de sécurité du site Web. Les sites Web légit




                """);
    }
}
