//package com.vietfintex.adminfaces.starter.bean;
//
//import com.viettel.fw.common.util.Const;
//import com.viettel.fw.passport.GrantedAuthorityPassport;
//import com.viettel.web.common.language.MultiResourceLang;
//import com.viettel.web.log.LoggingSession;
//import org.apache.log4j.Logger;
//import org.omnifaces.util.Faces;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//import viettel.passport.client.ObjectToken;
//import viettel.passport.client.UserToken;
//
//import javax.annotation.PostConstruct;
//import javax.faces.bean.ManagedBean;
//import javax.faces.context.ExternalContext;
//import javax.faces.context.FacesContext;
//import javax.servlet.http.HttpServletRequest;
//import java.io.Serializable;
//import java.util.*;
//
//@Component
//@ManagedBean
//@Scope("session")
//public class LoginBean implements Serializable {
//    private static final Logger logger = Logger.getLogger(LoginBean.class);
//    private static final long serialVersionUID = 1L;
//
//    UserToken userToken;
//    Date loginDate;
//    @Autowired(required = false)
//    LoggingSession loggingSession;
//
//    @PostConstruct
//    public void init() {
//        try {
//            ResourceBundle bundle = new MultiResourceLang(Faces.getDefaultLocale());
//            Enumeration<String> enm = bundle.getKeys();
//            List<String> lstKey = new ArrayList<>();
//            while (enm.hasMoreElements()) {
//                lstKey.add(enm.nextElement());
//            }
//            createAuthoCache(bundle, lstKey);
//            userToken = Faces.getSessionAttribute(Const.CONNECTOR.VSA_USER_TOKEN);
//            loginDate = Faces.getSessionAttribute(Const.CONNECTOR.LOGIN_DATE);
//
//        } catch (Exception e) {
//            logger.error(e.getMessage(), e);
//        }
//
//    }
//
//
//    public void createAuthoCache(ResourceBundle bundle, List<String> lstKey) {
//
//        authoLstCache = new ArrayList<>();
//        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
//        UserToken userToken = (UserToken) request.getSession().getAttribute(
//                Const.CONNECTOR.VSA_USER_TOKEN);
//        //Tao contextPath: gan Url cho cac subsystem
////        createContextPath(userToken.getParentMenu());
//
//        for (ObjectToken obj : userToken.getParentMenu()) {
//            GrantedAuthorityPassport newObjlv1 = new GrantedAuthorityPassport();
//            BeanUtils.copyProperties(obj, newObjlv1, "childObjects");
//            // child lv2
//            ArrayList<ObjectToken> objlv2Lst = new ArrayList<>();
//            for (ObjectToken objlv2 : obj.getChildObjects()) {
//                ObjectToken newObjlv2 = new ObjectToken();
//                BeanUtils.copyProperties(objlv2, newObjlv2, "childObjects");
//
//                // child lv3
//                ArrayList<ObjectToken> objlv3Lst = new ArrayList<>();
//                for (ObjectToken objlv3 : objlv2.getChildObjects()) {
//                    ObjectToken newObjlv3 = new ObjectToken();
//                    BeanUtils.copyProperties(objlv3, newObjlv3, "childObjects");
//
//                    // child lv4
//                    ArrayList<ObjectToken> objlv4Lst = new ArrayList<>();
//                    for (ObjectToken objlv4 : objlv3.getChildObjects()) {
//                        ObjectToken newObjlv4 = new ObjectToken();
//                        BeanUtils.copyProperties(objlv4, newObjlv4, "childObjects");
//
//                        objlv4Lst.add(newObjlv4);
//                    }
//                    newObjlv3.setChildObjects(objlv4Lst);
//
//                    objlv3Lst.add(newObjlv3);
//                }
//                newObjlv2.setChildObjects(objlv3Lst);
//
//                objlv2Lst.add(newObjlv2);
//            }
//
//            newObjlv1.setChildObjects(objlv2Lst);
//
//            authoLstCache.add(newObjlv1);
//
//        }
//    }
//
//
//    /**
//     * Cancel.
//     *
//     * @return the string
//     */
//    public String cancel() {
//        return null;
//    }
//
//    public UserToken getUserToken() {
//        return userToken;
//    }
//
//    public void setUserToken(UserToken userToken) {
//        this.userToken = userToken;
//    }
//
//    @SuppressWarnings("unchecked")
//    public List<ObjectToken> getLstChildObjects() {
//        //x_comment return lstChildObjects;
//        FacesContext facesContext = FacesContext.getCurrentInstance();
//        ExternalContext extenalContext = facesContext.getExternalContext();
//        HttpServletRequest request = (HttpServletRequest) extenalContext.getRequest();
//
//        return (List<ObjectToken>) request.getSession().getAttribute("LST_CHILD_OBJECTS");
//    }
//
//    public void setAuthoLstCache(List<GrantedAuthorityPassport> authoLstCache) {
//        this.authoLstCache = authoLstCache;
//    }
//
//
//    @SuppressWarnings("unchecked")
//    public Map<String, String> getMapContextPath() {
//        //xxx_temp start
//        //return mapContextPath;
//        FacesContext facesContext = FacesContext.getCurrentInstance();
//        ExternalContext extenalContext = facesContext.getExternalContext();
//        HttpServletRequest request = (HttpServletRequest) extenalContext.getRequest();
//        return (Map<String, String>) request.getSession().getAttribute("MAP_CONTEXT_PATH");
//        //xxx_temp end
//    }
//
//    public List<GrantedAuthorityPassport> getAuthoLstCache() {
//        return authoLstCache;
//    }
//
//    public Date getLoginDate() {
//        return loginDate;
//    }
//
//}
