package com.hameconnagezero.webapp.views.cyinvestigations;

import com.hameconnagezero.webapp.views.MainLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.router.*;
import jakarta.annotation.security.PermitAll;


@PageTitle("CyInvestigations")
@Route(value = "CyInvestigations", layout = MainLayout.class)
@PermitAll
@ParentLayout(MainLayout.class)
public class CyInvestigationsView extends Div implements RouterLayout {
    public static CyInvestigationsView ptThis = null;
    public VerticalLayout detail;
    VerticalLayout master;
    SplitLayout splitLayout;


    public CyInvestigationsView() {
        setHeight("100%");
        ptThis = this;

        splitLayout = new SplitLayout();
        master = new VerticalLayout();
        detail = new VerticalLayout();
        splitLayout.setSplitterPosition(10);

        master.add(createMasterList());
        detail.add(new Label("test Details"));
        splitLayout.addToPrimary(master);
        splitLayout.addToSecondary(detail);
        add(splitLayout);
    }

    VerticalLayout createMasterList(){
        VerticalLayout vl = new VerticalLayout();

        RouterLink one = new RouterLink("17/03/2023", CyInvestigations_pdf1.class);
        RouterLink two = new RouterLink("21/03/2023", CyInvestigations_pdf2.class);
        RouterLink three = new RouterLink("01/04/2023", CyInvestigations_pdf3.class);

        vl.add(one);
        vl.add(two);
        vl.add(three);
        return vl;
    }
}
