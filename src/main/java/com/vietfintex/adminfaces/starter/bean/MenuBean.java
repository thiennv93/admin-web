//package com.vietfintex.adminfaces.starter.bean;
//
//import com.ocpsoft.pretty.PrettyContext;
//import com.viettel.fw.bundle.UTF8ResourceBundle;
//import com.viettel.fw.common.util.DataUtil;
//import com.viettel.fw.passport.GrantedAuthorityPassport;
//import com.viettel.web.common.security.CustomAuthenticationProvider;
//import org.apache.log4j.Logger;
//import org.omnifaces.util.Faces;
//import org.primefaces.model.menu.DefaultMenuItem;
//import org.primefaces.model.menu.DefaultMenuModel;
//import org.primefaces.model.menu.DefaultSubMenu;
//import org.primefaces.model.menu.MenuModel;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//import viettel.passport.client.ObjectToken;
//
//import javax.annotation.PostConstruct;
//import javax.faces.bean.ManagedBean;
//import javax.faces.context.FacesContext;
//import java.io.IOException;
//import java.io.Serializable;
//import java.util.*;
//import java.util.concurrent.ConcurrentHashMap;
//
//@ManagedBean
//@Component
//@Scope("session")
//public class MenuBean implements Serializable {
//
//    private static final String URL_SPLIT = "/";
//    private static final String HOME_URL = "/home";
//
//    private MenuModel model;
//    private MenuModel subModel;
//    private boolean renderWarnRoleCheckMapping;
//
//    @Autowired
//    LoginBean loginBean;
//
//
//    @Value("${defaultSys}")
//    private String defaultSys;
//    private Map<String, ObjectToken> mapBreadCrumb = new HashMap<>();
//    private String url;
//
//    public MenuBean() {
//
//    }
//
//
//    private ResourceBundle resourceBundle;
//    private static final Logger logger = Logger.getLogger(MenuBean.class);
//
//    private Map<String, String> urlMapName = new ConcurrentHashMap<>();
//
//    @PostConstruct
//    private void init() {
//        init(FacesContext.getCurrentInstance().getApplication().getDefaultLocale());
//    }
//
//    public void init(Locale locate) {
//        Locale currentLocate = locate == null ? FacesContext.getCurrentInstance().getViewRoot().getLocale() : locate;
//        resourceBundle = new UTF8ResourceBundle("com.viettel.language.web-menu", currentLocate);
//        createSaleMenuModel();
//        createMapBreadCrumb();
//    }
//
//    private String mapMenuName(String name) {
//        try {
//            return resourceBundle.getString(name);
//        } catch (Exception e) {
//            logger.error(e);
//        }
//        return name;
//    }
//
//
//    public void loadBreadCrumb() {
//        if (!DataUtil.isNullOrEmpty(url)) {
//            ObjectToken grap;
//            String contextPath = FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath();
//            String[] newUrls = url.split(contextPath);
//            String newUrl = null;
//            if (newUrls.length < 1) {
//                return;
//            }
//            if (newUrls.length == 1) {
//                newUrl = newUrls[0];
//            }
//
//            if (newUrls.length == 2) {
//                newUrl = newUrls[1];
//            }
//
//            if (newUrl == null) {
//                newUrl = "";
//            }
//
//            if (newUrl.split(URL_SPLIT).length == 0) {
//                grap = mapBreadCrumb.get(url);
//            } else {
//                newUrl = URL_SPLIT + newUrl.split(URL_SPLIT)[1];
//                grap = mapBreadCrumb.get(newUrl);
//            }
//            subModel = new DefaultMenuModel();
//            DefaultMenuItem item = new DefaultMenuItem("Home");
//            item.setUrl(HOME_URL);
//            subModel.addElement(item);
//            if (grap != null) {
//                createSubMenu(grap, subModel);
//            } else {
//                DefaultMenuItem dashBoard = new DefaultMenuItem("Dashboard");
//                dashBoard.setUrl(HOME_URL);
//                subModel.addElement(dashBoard);
//                //kiem tra xem duong dan co bi che dau hay khong
//                String keyname = PrettyContext.getCurrentInstance(Faces.getRequest()).getCurrentMapping().getKeyName();
//                if(!DataUtil.isNullOrEmpty(keyname)){
//                    DefaultMenuItem hiddenMenu = new DefaultMenuItem(mapMenuName(keyname));
//                    hiddenMenu.setUrl(newUrl);
//                    subModel.addElement(hiddenMenu);
//                }
//            }
//
//        }
//    }
//
//
//    public void redirect(String url) throws IOException {
//        String requestBaseUrl = Faces.getRequestBaseURL();
//        String redirect = requestBaseUrl.substring(0, requestBaseUrl.length() - 1) + url;
//        Faces.redirect(redirect);
//    }
//
//    public void redirectUrl() throws IOException {
//        Map map = Faces.getRequestParameterValuesMap();
//        String url = ((String[]) map.get("url"))[0];
//        String requestBaseUrl = Faces.getRequestBaseURL();
//        String redirect = requestBaseUrl.substring(0, requestBaseUrl.length() - 1) + url;
//        Faces.redirect(redirect);
//    }
//
//    private void createSubMenu(ObjectToken grandObjectToken, MenuModel model) {
//        //option: remove the second item. if not: set i = 0
//        int i = 1;
//        for (; i < grandObjectToken.getChildObjects().size(); i++) {
//            ObjectToken parent = grandObjectToken.getChildObjects().get(i);
//
//            DefaultMenuItem item = new DefaultMenuItem(mapMenuName(parent.getObjectCode()));
//            item.setUrl(parent.getObjectUrl());
//            model.addElement(item);
//        }
//    }
//
//    private void createMapBreadCrumb() {
//        for (GrantedAuthorityPassport grantedAuthorityPassport : loginBean.getAuthoLstCache()) {
//            ObjectToken grap = new ObjectToken();
//            BeanUtils.copyProperties(grantedAuthorityPassport, grap);
//            List<ObjectToken> lstLastItem = new ArrayList<>();
//            lstLastItem.add(grantedAuthorityPassport);
//            grap.setChildObjects((ArrayList<ObjectToken>) lstLastItem);
//            mapBreadCrumb.put(grantedAuthorityPassport.getObjectUrl(), grap);
//            createMapBreadCrumb(grantedAuthorityPassport, lstLastItem);
//        }
//    }
//
//    private void createMapBreadCrumb(ObjectToken grantedAuthorityPassport, List<ObjectToken> lstLastItem) {
//        for (ObjectToken parent : grantedAuthorityPassport.getChildObjects()) {
//            List<ObjectToken> childLstLastItem = new ArrayList<>();
//            childLstLastItem.addAll(lstLastItem);
//            ObjectToken grap = new ObjectToken();
//            BeanUtils.copyProperties(grantedAuthorityPassport, grap);
//            childLstLastItem.add(parent);
//            grap.setChildObjects((ArrayList<ObjectToken>) childLstLastItem);
//            mapBreadCrumb.put(parent.getObjectUrl(), grap);
//            createMapBreadCrumb(parent, childLstLastItem);
//        }
//    }
//
//
//    public void createSaleMenuModel() {
//        model = new DefaultMenuModel();
//        urlMapName = new ConcurrentHashMap<>();
//
//        for (GrantedAuthorityPassport grantedAuthorityPassport : loginBean.getAuthoLstCache()) {
//            //generate menu for sale only
//            if (!grantedAuthorityPassport.getObjectCode().equals(defaultSys)) {
//                continue;
//            }
//            int countParent = 0;
//            for (ObjectToken menuToken : grantedAuthorityPassport.getChildObjects()) {
//                countParent++;
//                if (menuToken.getChildObjects().isEmpty()) {
//                    String menuName = mapMenuName(menuToken.getObjectCode());
//                    urlMapName.put(menuToken.getObjectUrl(), menuName);
//                    DefaultMenuItem item = new DefaultMenuItem(menuName);
//                    item.setUrl(menuToken.getObjectUrl());
//                    model.addElement(item);
//                    continue;
//                }
//                //cac menu cha chinh
//                String objectCode = menuToken.getObjectCode();
//                String menuName = mapMenuName(menuToken.getObjectCode());
//                urlMapName.put(menuToken.getObjectUrl(), menuName);
//                DefaultSubMenu subMenu = new DefaultSubMenu(menuName);
//                String classCssName = "cbs_menu_icon " + objectCode.replace(".", "_");
//                subMenu.setStyleClass(classCssName);
//
//                for (ObjectToken subMenuToken : menuToken.getChildObjects()) {
//                    addMenuToken(subMenuToken, subMenu, countParent);
//                }
//                model.addElement(subMenu);
//
//            }
//
//        }
//    }
//
//    public String getUrlName(String url) {
//        String menuUrl = urlMapName.get(url);
//        return menuUrl;
//    }
//
//
//    public void addMenuToken(ObjectToken menuToken, DefaultSubMenu subMenu, int countParent) {
//        if (menuToken.getChildObjects().isEmpty()) {
//            String menuName = mapMenuName(menuToken.getObjectCode());
//            DefaultMenuItem item = new DefaultMenuItem(menuName);
//            item.setUrl(menuToken.getObjectUrl());
//            item.setIcon("icon-link white");
//            subMenu.addElement(item);
//            urlMapName.put(menuToken.getObjectUrl(), menuName);
//
//        } else {
//            String menuName = mapMenuName(menuToken.getObjectCode());
//            DefaultSubMenu menuTokenSubMenu = new DefaultSubMenu(menuName);
//            subMenu.addElement(menuTokenSubMenu);
//            urlMapName.put(menuToken.getObjectUrl(), menuName);
//
//            int countChild = 0;
//            for (ObjectToken objectToken : menuToken.getChildObjects()) {
//                countChild++;
//                addMenuToken(objectToken, menuTokenSubMenu, countChild);
//            }
//        }
//    }
//
//    public MenuModel getModel() {
//        return model;
//    }
//
//    public void setModel(MenuModel model) {
//        this.model = model;
//    }
//
//
//    public MenuModel getSubModel() {
//        return subModel;
//    }
//
//    public void setSubModel(MenuModel subModel) {
//        this.subModel = subModel;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//
//    public boolean isRenderWarnRoleCheckMapping() {
//        renderWarnRoleCheckMapping =  CustomAuthenticationProvider.hasRole("BCCS2_CHECK_DEBIT_MAPPING_PERMISSION");
//        return renderWarnRoleCheckMapping;
//    }
//}
