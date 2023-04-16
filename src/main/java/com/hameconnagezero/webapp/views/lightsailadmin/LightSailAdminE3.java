package com.hameconnagezero.webapp.views.lightsailadmin;

import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;


@PermitAll
@Route(value = "LightSailAdminE3", layout = LightSailAdminView.class)
public class LightSailAdminE3 extends LightSailAdminEmployees {

    public LightSailAdminE3() {
        super("Carl Côté", "C897654", "75%", "images/CampaignCarl.png");
    }
}
