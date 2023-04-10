package com.hameconnagezero.webapp.views.services;

import com.hameconnagezero.webapp.views.MainLayout;
import com.hameconnagezero.webapp.views.products.ProductDarkFals;
import com.hameconnagezero.webapp.views.products.ProductDarkSensor;
import com.hameconnagezero.webapp.views.products.ProductLightBulb;
import com.hameconnagezero.webapp.views.products.ProductLightSensor;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.component.html.OrderedList;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility.AlignItems;
import com.vaadin.flow.theme.lumo.LumoUtility.Display;
import com.vaadin.flow.theme.lumo.LumoUtility.FontSize;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import com.vaadin.flow.theme.lumo.LumoUtility.JustifyContent;
import com.vaadin.flow.theme.lumo.LumoUtility.ListStyleType;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;
import com.vaadin.flow.theme.lumo.LumoUtility.MaxWidth;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;
import com.vaadin.flow.theme.lumo.LumoUtility.TextColor;

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
