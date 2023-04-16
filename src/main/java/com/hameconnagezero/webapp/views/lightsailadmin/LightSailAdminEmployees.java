package com.hameconnagezero.webapp.views.lightsailadmin;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;


public class LightSailAdminEmployees extends Div {

    public LightSailAdminEmployees(String employeeName, String employeeId, String employeeScore, String employeeGraph) {
        LightSailAdminView father = LightSailAdminView.ptThis;

        father.detail.removeAll();
        HorizontalLayout hl_employeeName= new HorizontalLayout();
        hl_employeeName.add(new Label("Nom:"), new H3(employeeName));
        father.detail.add(hl_employeeName);

        HorizontalLayout hl_employeeId= new HorizontalLayout();
        hl_employeeId.add(new Label("Id:"), new H3(employeeId));
        father.detail.add(hl_employeeName);

        HorizontalLayout hl_employeeScore= new HorizontalLayout();
        hl_employeeScore.add(new Label("Score Moyen:"), new H3(employeeScore));
        father.detail.add(hl_employeeName);

        Image img = new Image(employeeGraph, "graph");
        img.setWidth("1000px");
        father.detail.add(img);

    }
}
