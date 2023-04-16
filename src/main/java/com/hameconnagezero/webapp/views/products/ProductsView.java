package com.hameconnagezero.webapp.views.products;

import com.hameconnagezero.webapp.views.MainLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;


@PageTitle("Products")
@Route(value = "products", layout = MainLayout.class)
@AnonymousAllowed
public class ProductsView  extends HorizontalLayout {

    public ProductsView() {
        TabSheet tabSheet = new TabSheet();

        tabSheet.add("LightSensor", new ProductLightSensor());
        tabSheet.add("LightBulb", new ProductLightBulb());
        tabSheet.add("DarkSensor", new ProductDarkSensor());
        tabSheet.add("DarkFals", new ProductDarkFals());

        add(tabSheet);
    }
}
