package com.hameconnagezero.webapp.views.cyinvestigations;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;


@PermitAll
@Route(value = "CyInvestigations_pdf3", layout = CyInvestigationsView.class)
public class CyInvestigations_pdf3 extends Div {

    public CyInvestigations_pdf3() {
        CyInvestigationsView father = CyInvestigationsView.ptThis;

        father.detail.removeAll();
        Image img = new Image("images/pdf_3.png", "pdf_1");
        img.setWidth("1000px");
        father.detail.add(img);
    }
}
