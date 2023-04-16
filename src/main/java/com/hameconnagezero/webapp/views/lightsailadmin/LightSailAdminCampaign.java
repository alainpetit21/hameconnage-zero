package com.hameconnagezero.webapp.views.lightsailadmin;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextArea;


public class LightSailAdminCampaign extends Div {

    public LightSailAdminCampaign(String campaignText, String campaignGraph, String campaignScore) {
        LightSailAdminView father = LightSailAdminView.ptThis;

        father.detail.removeAll();

        TextArea emailExercice = new TextArea();
        emailExercice.setWidth("1000px");
        emailExercice.setHeight("250px");
        emailExercice.setValue(campaignText);
        father.detail.add(emailExercice);

        HorizontalLayout hl_GraphScore= new HorizontalLayout();
        Image img = new Image(campaignGraph, "graph");
        img.setWidth("512px");
        hl_GraphScore.add(img);
        hl_GraphScore.add(new H2("Réussi à " + campaignScore));
        father.detail.add(hl_GraphScore);
    }
}
