package com.hameconnagezero.webapp.views.lightsail;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.radiobutton.RadioGroupVariant;
import com.vaadin.flow.component.textfield.TextArea;


public class LightSailExercices extends Div {

    public LightSailExercices(String exerciceText) {
        LightSailView father = LightSailView.ptThis;

        father.detail.removeAll();

        TextArea emailExercice = new TextArea();
        emailExercice.setWidth("1000px");
        emailExercice.setHeight("250px");
        emailExercice.setValue(exerciceText);
        father.detail.add(emailExercice);
        father.detail.add(new Label("Question:"));
        father.detail.add(new Label("Qu'il y a-t-il de suspect dans le courriel ci-dessus:"));
        
        RadioButtonGroup<String> radioGroup = new RadioButtonGroup<>();
        radioGroup.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);
        radioGroup.setLabel("Qu'il y a-t-il de suspect dans le courriel ci-dessus:");
        radioGroup.setItems("Rien de suspect", "Suspect, expliquez ci-dessous ...");
        father.detail.add(radioGroup);

        father.detail.add(new Label("Si suspect, pourquoi?"));
        TextArea explication = new TextArea();
        explication.setWidth("1000px");
        explication.setHeight("200px");
        father.detail.add(explication);

    }
}
