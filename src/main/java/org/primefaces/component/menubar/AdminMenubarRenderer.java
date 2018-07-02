package org.primefaces.component.menubar;

import org.primefaces.component.api.AjaxSource;
import org.primefaces.component.api.UIOutcomeTarget;
import org.primefaces.component.menu.AbstractMenu;
import org.primefaces.component.menu.BaseMenuRenderer;
import org.primefaces.model.menu.MenuElement;
import org.primefaces.model.menu.MenuItem;
import org.primefaces.model.menu.Separator;
import org.primefaces.model.menu.Submenu;
import org.primefaces.util.ComponentTraversalUtils;
import org.primefaces.util.WidgetBuilder;

import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@FacesRenderer(componentFamily = "org.primefaces.component",
        rendererType = "org.primefaces.component.AdminMenubarRenderer")
public class AdminMenubarRenderer extends BaseMenuRenderer {
    @Override
    protected void encodeScript(FacesContext context, AbstractMenu abstractMenu) throws IOException {
        Menubar menubar = (Menubar) abstractMenu;
        String clientId = menubar.getClientId(context);

        WidgetBuilder wb = getWidgetBuilder(context);
        wb.init("Admin", menubar.resolveWidgetVar(), clientId);

        wb.finish();
    }

    @Override
    protected void encodeMarkup(FacesContext context, AbstractMenu abstractMenu) throws IOException {
        Menubar menubar = (Menubar) abstractMenu;
        String style = menubar.getStyle();
        String styleClass = menubar.getStyleClass();
        final String CONTAINER_CLASS = "sidebar-menu tree";
        styleClass = (styleClass == null ? CONTAINER_CLASS : CONTAINER_CLASS + " " + styleClass);

        encodeMenu(context, menubar, style, styleClass);
    }

    protected void encodeMenu(FacesContext context, AbstractMenu menu, String style, String styleClass) throws IOException {
        ResponseWriter writer = context.getResponseWriter();

        writer.startElement("ul", menu);
        writer.writeAttribute("id", menu.getClientId(context), "id");
        writer.writeAttribute("class", styleClass, "styleClass");
        writer.writeAttribute("data-widget", "tree","data-widget");

        if (style != null) {
            writer.writeAttribute("style", style, "style");
        }

        if (menu.getElementsCount() > 0) {
            encodeElements(context, menu, menu.getElements());
        }

        writer.endElement("ul");
    }

    protected void encodeElements(FacesContext context, AbstractMenu menu, List<MenuElement> elements) throws IOException {
        ResponseWriter writer = context.getResponseWriter();

        for (MenuElement element : elements) {
            if (element.isRendered()) {
                if (element instanceof MenuItem) {
                    MenuItem menuItem = (MenuItem) element;
                    String containerStyle = menuItem.getContainerStyle();
                    String containerStyleClass = menuItem.getContainerStyleClass();

                    writer.startElement("li", null);
                    writer.writeAttribute("id", menuItem.getClientId(), null);
//                    writer.writeAttribute("class", containerStyleClass, null);
                    writer.writeAttribute("class", "treeview", null);
//                    writer.writeAttribute("role", "menuitem", null);
                    if (containerStyle != null) {
                        writer.writeAttribute("style", containerStyle, null);
                    }
                    encodeMenuItem(context, menu, menuItem);
                    writer.endElement("li");
                } else if (element instanceof Submenu) {
                    Submenu submenu = (Submenu) element;
                    String style = submenu.getStyle();
                    String styleClass = submenu.getStyleClass();

                    writer.startElement("li", null);
                    writer.writeAttribute("id", submenu.getClientId(), null);
//                    writer.writeAttribute("class", styleClass, null);
                    writer.writeAttribute("class", "treeview", null);
                    if (style != null) {
                        writer.writeAttribute("style", style, null);
                    }
//                    writer.writeAttribute("role", "menuitem", null);
                    encodeSubmenu(context, menu, submenu);
                    writer.endElement("li");
                } else if (element instanceof Separator) {
                    encodeSeparator(context, (Separator) element);
                }
            }
        }
    }

    @Override
    protected void encodeMenuItem(FacesContext context, AbstractMenu menu, MenuItem menuitem) throws IOException {
        ResponseWriter writer = context.getResponseWriter();

        if (menuitem.shouldRenderChildren()) {
            renderChildren(context, (UIComponent) menuitem);
        } else {
            String title = menuitem.getTitle();
            String style = menuitem.getStyle();
            boolean disabled = menuitem.isDisabled();
            String rel = menuitem.getRel();

            writer.startElement("a", null);
            if (title != null) {
                writer.writeAttribute("title", title, null);
            }

            String styleClass = this.getLinkStyleClass(menuitem);
            if (disabled) {
                styleClass += " ui-state-disabled";
            }

            writer.writeAttribute("class", styleClass, null);

            if (style != null) {
                writer.writeAttribute("style", style, null);
            }

            if (rel != null) {
                writer.writeAttribute("rel", rel, null);
            }

            if (disabled) {
                writer.writeAttribute("href", "#", null);
                writer.writeAttribute("onclick", "return false;", null);
            } else {
                setConfirmationScript(context, menuitem);
                String onclick = menuitem.getOnclick();

                // GET
                if (menuitem.getUrl() != null || menuitem.getOutcome() != null) {
                    String targetURL = getTargetURL(context, (UIOutcomeTarget) menuitem);
                    writer.writeAttribute("href", targetURL, "href");

                    if (menuitem.getTarget() != null) {
                        writer.writeAttribute("target", menuitem.getTarget(), null);
                    }
                } else { // POST
                    writer.writeAttribute("href", "#", null);

                    //UIComponent form = ComponentUtils.findParentForm(context, menu); // PrimeFaces-5.2
                    UIComponent form = ComponentTraversalUtils.closestForm(context, menu); // @sine PrimeFaces-5.3
                    if (form == null) {
                        throw new FacesException("MenuItem must be inside a form element");
                    }

                    String command;
                    if (menuitem.isDynamic()) {
                        String menuClientId = menu.getClientId(context);
                        Map<String, List<String>> params = menuitem.getParams();
                        if (params == null) {
                            params = new LinkedHashMap<>();
                        }
                        List<String> idParams = new ArrayList<>();
                        idParams.add(menuitem.getId());
                        params.put(menuClientId + "_menuid", idParams);

                        command = menuitem.isAjax() ? buildAjaxRequest(context, menu, (AjaxSource) menuitem, form, params) : buildNonAjaxRequest(context, menu, form, menuClientId, params, true);
                    } else {
                        command = menuitem.isAjax() ? buildAjaxRequest(context, (AjaxSource) menuitem, form) : buildNonAjaxRequest(context, ((UIComponent) menuitem), form, ((UIComponent) menuitem).getClientId(context), true);
                    }

                    onclick = (onclick == null) ? command : onclick + ";" + command;
                }

                if (onclick != null) {
                    if (menuitem.requiresConfirmation()) {
                        writer.writeAttribute("data-pfconfirmcommand", onclick, null);
                        writer.writeAttribute("onclick", menuitem.getConfirmationScript(), "onclick");
                    } else {
                        writer.writeAttribute("onclick", onclick, null);
                    }
                }
            }

            encodeMenuItemContent(context, menu, menuitem);

            writer.endElement("a");
        }
    }

    @Override
    protected String getLinkStyleClass(MenuItem menuItem) {
        String styleClass = menuItem.getStyleClass();
//        final String MENUITEM_LINK_CLASS = ""; // AbstractMenu.MENUITEM_LINK_CLASS
//        return (styleClass == null) ? MENUITEM_LINK_CLASS : MENUITEM_LINK_CLASS + " " + styleClass;
        return styleClass;
    }

    @Override
    protected void encodeMenuItemContent(FacesContext context, AbstractMenu menu, MenuItem menuitem) throws IOException {
        ResponseWriter writer = context.getResponseWriter();
        String icon = menuitem.getIcon();
        Object value = menuitem.getValue();

        if (icon != null) {
            writer.startElement("i", null);
            // writer.writeAttribute("class", icon, null);
            if (icon.startsWith("material-icons ")) {
                writer.writeAttribute("class", "material-icons", null);
                writer.writeText(icon.substring("material-icons ".length()), "value");
            } else {
                writer.writeAttribute("class", icon, null);
            }
            writer.endElement("i");
        }

        writer.startElement("span", null);
        if (value != null) {
            if (menuitem.isEscape()) {
                writer.writeText(value, "value");
            } else {
                writer.write(value.toString());
            }
        }
        writer.endElement("span");
    }

    protected void encodeSubmenu(FacesContext context, AbstractMenu menu, Submenu submenu) throws IOException {
        ResponseWriter writer = context.getResponseWriter();
        String icon = submenu.getIcon();
        String label = submenu.getLabel();

        writer.startElement("a", null);
        writer.writeAttribute("href", "#", null);
        writer.writeAttribute("class", "ripplelink", null);

        //user icon
        if (icon != null) {
            writer.startElement("i", null);
            // writer.writeAttribute("class", icon, null);
            if (icon.startsWith("material-icons ")) {
                writer.writeAttribute("class", "material-icons", null);
                writer.writeText(icon.substring("material-icons ".length()), "value");
            } else {
                writer.writeAttribute("class", icon, null);
            }
            writer.endElement("i");
        }

        //submenu label
        writer.startElement("span", null);
        writer.writeText(label, null);
        writer.endElement("span");

        //toggle icon
        encodeSubmenuIcon(context, submenu);

        writer.endElement("a");

        //submenu children
        if (submenu.getElementsCount() > 0) {
            writer.startElement("ul", null);
//            writer.writeAttribute("class", submenu.getStyleClass(), null);
            writer.writeAttribute("class", "treeview-menu", null);
            writer.writeAttribute("role", "menu", null);
            encodeElements(context, menu, submenu.getElements());
            writer.endElement("ul");
        }
    }

    protected void encodeSubmenuIcon(FacesContext context, Submenu submenu) throws IOException {
        ResponseWriter writer = context.getResponseWriter();

        writer.startElement("span", null);
        writer.writeAttribute("class", "pull-right-container", null);

        writer.startElement("i", null);
        writer.writeAttribute("class", "fa fa-angle-left pull-right", null);
        writer.endElement("i");
        writer.endElement("span");
    }
}
