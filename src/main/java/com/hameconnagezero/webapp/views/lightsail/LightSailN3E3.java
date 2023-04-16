package com.hameconnagezero.webapp.views.lightsail;

import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;


@PermitAll
@Route(value = "LightSailN3E3", layout = LightSailView.class)
public class LightSailN3E3 extends LightSailExercices {

    public LightSailN3E3() {
        super("Date : 12 avril 2023\n" +
                "De : serviceclient@banquepopulaire.fr\n" +
                "Subject : Mise à jour de vos informations de compte\n" +
                "Pièce jointe : Formulaire_de_mise_a_jour.docx\n" +
                "Texte : Cher(e) client(e),\n" +
                "\n" +
                "Nous avons récemment mis à jour nos politiques de sécurité et avons besoin que vous confirmiez vos informations de compte. Veuillez trouver ci-joint un formulaire de mise à jour en format Word.\n" +
                "\n" +
                "Veuillez remplir et retourner le formulaire par courriel, en répondant à cet e-mail, dans les plus brefs délais.\n" +
                "\n" +
                "Cordialement,\n" +
                "Le service client de la Banque Populaire");
    }
}
