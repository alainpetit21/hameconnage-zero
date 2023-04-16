package com.hameconnagezero.webapp.views.lightsail;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextArea;


public class LightSailVideo extends Div {

    public LightSailVideo(String videoString, String script) {
        LightSailView father = LightSailView.ptThis;

        father.detail.removeAll();
        Image img = new Image(videoString, "video");
        img.setWidth("1000px");
        father.detail.add(img);
        father.detail.add(new Label("Script:"));

        TextArea tfScript = new TextArea();

        tfScript.setWidth("1000px");
        tfScript.setHeight("250px");
        tfScript.setValue(script);
        father.detail.add(tfScript);


    }
}
