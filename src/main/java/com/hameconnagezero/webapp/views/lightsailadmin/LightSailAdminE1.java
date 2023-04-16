package com.hameconnagezero.webapp.views.lightsailadmin;

import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;


@PermitAll
@Route(value = "LightSailAdminE1", layout = LightSailAdminView.class)
public class LightSailAdminE1 extends LightSailAdminEmployees {

    public LightSailAdminE1() {
        super("Alice Aubé", "D12345", "75%", "images/CampaignAlice.png");
    }
}
