package com.vietfintex.marketplace.bean;

import com.vietfintex.marketplace.dto.MenuDTO;
import com.vietfintex.marketplace.dto.UserDTO;
import com.vietfintex.marketplace.i18n.AdminUTF8Bundle;
import com.vietfintex.marketplace.util.Constants;
import org.apache.log4j.Logger;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static java.util.Objects.isNull;
import static org.springframework.util.StringUtils.isEmpty;

@ManagedBean
public class MenuBean {
    private static final Logger logger = Logger.getLogger(MenuBean.class);
    private MenuModel model;

    private AdminUTF8Bundle resourceBundle = new AdminUTF8Bundle();

    @PostConstruct
    public void init() {
        model = new DefaultMenuModel();

        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext extenalContext = facesContext.getExternalContext();

        HttpServletRequest request = (HttpServletRequest) extenalContext.getRequest();
        UserDTO userDTO = (UserDTO) request.getSession().getAttribute(Constants.USER_TOKEN);

//        DefaultSubMenu firstSubMenu = new DefaultSubMenu();
//        model.addElement(firstSubMenu);
        List<MenuDTO> menuDTOList = userDTO.getMenuList();

        for (MenuDTO menuDTO : menuDTOList) {
            if (isNull(menuDTO.getChildMenu())){
                DefaultMenuItem item = new DefaultMenuItem(getMenuName(menuDTO.getMenuKey()));
                if (!isEmpty(menuDTO.getUrl())) {
                    item.setUrl(menuDTO.getUrl());
                }
                if (!isEmpty(menuDTO.getIcon())) {
                    item.setIcon(menuDTO.getIcon());
                }
//                item.setContainerStyleClass("treeview");
                model.addElement(item);
                continue;
            }
            DefaultSubMenu item = new DefaultSubMenu(getMenuName(menuDTO.getMenuKey()));
            if (!isEmpty(menuDTO.getIcon())) {
                item.setIcon(menuDTO.getIcon());
            }
//            item.setStyleClass("treeview");
            for (MenuDTO subMenuDTO: menuDTO.getChildMenu()){
                DefaultMenuItem subItem = new DefaultMenuItem(getMenuName(subMenuDTO.getMenuKey()));
                if (!isEmpty(subMenuDTO.getUrl())) {
                    subItem.setUrl(subMenuDTO.getUrl());
                }
                if (!isEmpty(subMenuDTO.getIcon())) {
                    subItem.setIcon(subMenuDTO.getIcon());
                }
//                subItem.setStyleClass("treeview-menu");
                item.addElement(subItem);
            }
            model.addElement(item);
        }
    }

    private String getMenuName(String key) {
        try {
            return resourceBundle.getString(key);
        } catch (Exception e) {
            logger.error(e);
        }
        return key;
    }

    public MenuModel getModel() {
        return model;
    }
}
