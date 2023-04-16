package com.hameconnagezero.webapp.views;

import com.hameconnagezero.webapp.data.entity.User;
import com.hameconnagezero.webapp.security.AuthenticatedUser;
import com.hameconnagezero.webapp.views.about.AboutView;
import com.hameconnagezero.webapp.views.cyinvestigations.CyInvestigationsView;
import com.hameconnagezero.webapp.views.home.HomeView;
import com.hameconnagezero.webapp.views.lightbulb.LightBulbView;
import com.hameconnagezero.webapp.views.lightsail.LightSailView;
import com.hameconnagezero.webapp.views.lightsailadmin.LightSailAdminView;
import com.hameconnagezero.webapp.views.lightsensor.LightSensorView;
import com.hameconnagezero.webapp.views.products.ProductsView;
import com.hameconnagezero.webapp.views.services.ServicesView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.server.StreamResource;
import com.vaadin.flow.server.auth.AccessAnnotationChecker;
import com.vaadin.flow.theme.lumo.LumoUtility.*;
import org.vaadin.lineawesome.LineAwesomeIcon;

import java.io.ByteArrayInputStream;
import java.util.Optional;


public class MainLayout extends AppLayout {

    public static class MenuItemInfo extends ListItem {

        private final Class<? extends Component> view;

        public MenuItemInfo(String menuTitle, Component icon, Class<? extends Component> view) {
            this.view = view;
            RouterLink link = new RouterLink();
            // Use Lumo classnames for various styling
            link.addClassNames(Display.FLEX, Gap.XSMALL, Height.MEDIUM, AlignItems.CENTER, Padding.Horizontal.SMALL,
                    TextColor.BODY);
            link.setRoute(view);

            Span text = new Span(menuTitle);
            // Use Lumo classnames for various styling
            text.addClassNames(FontWeight.MEDIUM, FontSize.MEDIUM, Whitespace.NOWRAP);

            if (icon != null) {
                link.add(icon);
            }
            link.add(text);
            add(link);
        }

        public Class<?> getView() {
            return view;
        }

    }


    private AuthenticatedUser authenticatedUser;
    private AccessAnnotationChecker accessChecker;


    public MainLayout(AuthenticatedUser authenticatedUser, AccessAnnotationChecker accessChecker) {
        this.authenticatedUser = authenticatedUser;
        this.accessChecker = accessChecker;

        addToNavbar(createHeaderContent());
    }

    private Component createHeaderContent() {
        Header header = new Header();
        header.addClassNames(BoxSizing.BORDER, Display.FLEX, FlexDirection.COLUMN, Width.FULL);

        Div layout = new Div();
        layout.addClassNames(Display.FLEX, AlignItems.CENTER, Padding.Horizontal.LARGE);

        Image logoHZ = new Image("images/HZ_Logo.png", "HZLOGO");
        logoHZ.setHeight("48px");
        logoHZ.setWidth("96px");
        layout.add(logoHZ);

        H1 appName = new H1("Hameconnage Zéro");
        appName.addClassNames(Margin.Vertical.MEDIUM, Margin.End.AUTO, FontSize.LARGE);
        layout.add(appName);

        Optional<User> maybeUser = authenticatedUser.get();
        if (maybeUser.isPresent()) {
            User user = maybeUser.get();

            Avatar avatar = new Avatar(user.getName());
            StreamResource resource = new StreamResource("profile-pic",
                    () -> new ByteArrayInputStream(user.getProfilePicture()));
            avatar.setImageResource(resource);
            avatar.setThemeName("xsmall");
            avatar.getElement().setAttribute("tabindex", "-1");

            MenuBar userMenu = new MenuBar();
            userMenu.setThemeName("tertiary-inline contrast");

            MenuItem userName = userMenu.addItem("");
            Div div = new Div();
            div.add(avatar);
            div.add(user.getName());
            div.add(new Icon("lumo", "dropdown"));
            div.getElement().getStyle().set("display", "flex");
            div.getElement().getStyle().set("align-items", "center");
            div.getElement().getStyle().set("gap", "var(--lumo-space-s)");
            userName.add(div);
            userName.getSubMenu().addItem("Sign out", e -> {
                authenticatedUser.logout();
            });

            layout.add(userMenu);
        } else {
            Anchor loginLink = new Anchor("login", "Sign in");
            layout.add(loginLink);
        }

        Nav nav = new Nav();
        nav.addClassNames(Display.FLEX, Overflow.AUTO, Padding.Horizontal.MEDIUM, Padding.Vertical.XSMALL);

        // Wrap the links in a list; improves accessibility
        UnorderedList list = new UnorderedList();
        list.addClassNames(Display.FLEX, Gap.SMALL, ListStyleType.NONE, Margin.NONE, Padding.NONE);
        nav.add(list);

        for (MenuItemInfo menuItem : createMenuItems()) {
            if (accessChecker.hasAccess(menuItem.getView())) {
                list.add(menuItem);
            }

        }

        header.add(layout, nav);
        return header;
    }

    private MenuItemInfo[] createMenuItems() {
        Image imgLightSail= new Image("icons/LightSail.png", "LightSail");
        imgLightSail.setHeight("24px");
        imgLightSail.setWidth("24px");
        Image imgLightSail2= new Image("icons/LightSail.png", "LightSail");
        imgLightSail2.setHeight("24px");
        imgLightSail2.setWidth("24px");
        Image imgLightBulb= new Image("icons/LightBulb.png", "LightBulb");
        imgLightBulb.setHeight("24px");
        imgLightBulb.setWidth("24px");
        Image imgLightSensor= new Image("icons/LightSensor.png", "LightSensor");
        imgLightSensor.setHeight("24px");
        imgLightSensor.setWidth("24px");
        Image imgCyInvestigation= new Image("icons/CyInvestigation.png", "CyInvestigation");
        imgCyInvestigation.setHeight("24px");
        imgCyInvestigation.setWidth("24px");

        return new MenuItemInfo[]{
                new MenuItemInfo("Origine", LineAwesomeIcon.GLOBE_SOLID.create(), HomeView.class), //
                new MenuItemInfo("Produits", LineAwesomeIcon.TH_LIST_SOLID.create(), ProductsView.class), //
                new MenuItemInfo("Services", LineAwesomeIcon.TH_LIST_SOLID.create(), ServicesView.class), //
                new MenuItemInfo("À propos de nous", LineAwesomeIcon.FILE.create(), AboutView.class), //
                new MenuItemInfo("LightSail", imgLightSail, LightSailView.class), //
                new MenuItemInfo("LightSail (Admin)", imgLightSail2, LightSailAdminView.class), //
                new MenuItemInfo("LightBulb", imgLightBulb, LightBulbView.class), //
                new MenuItemInfo("LightSensor", imgLightSensor, LightSensorView.class), //
                new MenuItemInfo("CyInvestigations", imgCyInvestigation, CyInvestigationsView.class), //
        };
    }

}
