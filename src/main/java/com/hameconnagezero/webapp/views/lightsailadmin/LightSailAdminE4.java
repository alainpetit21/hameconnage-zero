package com.hameconnagezero.webapp.views.lightsailadmin;

import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;


@PermitAll
@Route(value = "LightSailAdminE4", layout = LightSailAdminView.class)
public class LightSailAdminE4 extends LightSailAdminEmployees {

    public LightSailAdminE4() {
        super("Dustin Dubois", "D654132", "75%", "images/CampaignDustin.png");
    }
}
