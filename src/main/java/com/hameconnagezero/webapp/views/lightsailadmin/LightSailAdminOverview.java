package com.hameconnagezero.webapp.views.lightsailadmin;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;


@PermitAll
@Route(value = "LightSailAdminOverview", layout = LightSailAdminView.class)
public class LightSailAdminOverview extends Div {

    public LightSailAdminOverview() {
        LightSailAdminView father = LightSailAdminView.ptThis;

        father.detail.removeAll();

        Image img = new Image("images/CampaignOverall.png", "graph");
        img.setWidth("1000px");
        father.detail.add(img);

    }
}
