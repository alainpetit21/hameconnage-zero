package com.hameconnagezero.webapp.views.services;

import com.hameconnagezero.webapp.views.MainLayout;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;


@PageTitle("Services")
@Route(value = "Services", layout = MainLayout.class)
@AnonymousAllowed
public class ServicesView extends Main implements HasComponents, HasStyle {

    public ServicesView() {
        TabSheet tabSheet = new TabSheet();

        tabSheet.add("LightSail", new ServiceLightSail());
        tabSheet.add("CyInvestigation", new ServiceCyInvestigation());
        tabSheet.add("Campagne de sensibilisation", new ServiceCampaign());

        add(tabSheet);
    }
}
