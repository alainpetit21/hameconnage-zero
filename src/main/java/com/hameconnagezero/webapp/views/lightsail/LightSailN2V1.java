package com.hameconnagezero.webapp.views.lightsail;

import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;


@PermitAll
@Route(value = "LightSailN2V1", layout = LightSailView.class)
public class LightSailN2V1 extends LightSailVideo {

    public LightSailN2V1() {
        super("images/video2.png", "[Partie 2 - La reconnaissance des courriels et des pièces jointes suspectes]\n" +
                "\n" +
                "Le deuxième type de phishing est le phishing par pièce jointe. Les pirates informatiques envoient des courriels avec des pièces jointes malveillantes, qui peuvent contenir des logiciels espions ou des virus. Ces pièces jointes peuvent sembler inoffensives, comme un fichier PDF ou une image, mais elles peuvent causer de graves dommages à l'ordinateur de la victime.\n" +
                "\n" +
                "Comment reconnaître ces pièces jointes malveillantes ? Premièrement, il est important de ne pas ouvrir de pièces jointes provenant d'expéditeurs inconnus ou suspects. Deuxièmement, vous devez vérifier l'extension de la pièce jointe. Les extensions de fichiers telles que .exe, .bat et .zip sont souvent associées à des logiciels malveillants. Donc, si vous voyez une pièce jointe avec l'une de ces extensions, supprimez-la immédiatement.");
    }
}
