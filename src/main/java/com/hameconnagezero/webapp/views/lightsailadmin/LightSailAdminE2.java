package com.hameconnagezero.webapp.views.lightsailadmin;

import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;


@PermitAll
@Route(value = "LightSailAdminE2", layout = LightSailAdminView.class)
public class LightSailAdminE2 extends LightSailAdminEmployees {

    public LightSailAdminE2() {
        super("Bob Bouchard", "B456789", "50%", "images/CampaignBob.png");
    }
}
