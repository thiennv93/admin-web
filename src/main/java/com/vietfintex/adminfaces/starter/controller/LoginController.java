package com.vietfintex.adminfaces.starter.controller;


import org.apache.log4j.Logger;
import org.omnifaces.cdi.ViewScoped;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.Serializable;

//@Component
@ManagedBean
@ViewScoped
public class LoginController {

    private static final Logger logger = Logger.getLogger(LoginController.class);
    public void login() throws IOException, ServletException {

        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();

        RequestDispatcher dispatcher = ((ServletRequest) context.getRequest()).getRequestDispatcher("/j_spring_security_check");

        dispatcher.forward((ServletRequest) context.getRequest(), (ServletResponse) context.getResponse());

        FacesContext.getCurrentInstance().responseComplete();
    }

//    public void login() {
//        FacesContext facesContext = FacesContext.getCurrentInstance();
//        ExternalContext extenalContext = facesContext.getExternalContext();
//        HttpServletRequest request = (HttpServletRequest) extenalContext.getRequest();
//        try {
//            if (DataUtil.isNullOrEmpty(vsaTicket)) {
//                String redirectUrl = connector.getPassportLoginURL()
//                        + "?appCode="
//                        + connector.getDomainCode()
//                        + "&service="
//                        + URLEncoder.encode(connector.getServiceURL(), "UTF-8");
//                request.setAttribute("VSA-IsPassedVSAFilter", "False");
//                request.setAttribute("VSA-Flag", "InPageRedirect");
//                request.setAttribute("VSA-Location", redirectUrl);
//                request.setAttribute("VSA-Redirect", "1");
//                extenalContext.redirect(redirectUrl);
//            } else {
//                RequestDispatcher dispatcher = request.getRequestDispatcher("/j_spring_security_check?ticket=" + vsaTicket);
//                dispatcher.forward(request, (ServletResponse) extenalContext.getResponse());
//                SecurityContextHolder.getContext().getAuthentication();
//                facesContext.responseComplete();
//                UserToken userToken = (UserToken) request.getSession().getAttribute(Const.CONNECTOR.VSA_USER_TOKEN);
//                if (userToken != null) {
//                    List<String> vsaAllowedURL = new ArrayList<>();
//                    for (ObjectToken ot : userToken.getObjectTokens()) {
//                        String servletPath = ot.getObjectUrl();
//                        if (!("#".equals(servletPath))) {
//                            vsaAllowedURL.add(servletPath.split("\\?")[0]);
//                        }
//                    }
//                    request.getSession().setAttribute(Const.VSA_ALLOW_URL, vsaAllowedURL);
//                    request.getSession().setAttribute(Const.DEFAULT_SYS, systemConfig.DEFAULT_SYS);
//                    request.getSession().setAttribute("userName", userToken.getUserName());
//                    request.getSession().setAttribute(Const.CONNECTOR.LOGIN_DATE, new Date(System.currentTimeMillis()));
//
//                }
//
//            }
//        } catch (Exception e) {
//            logger.error(e);
//        } finally {
//            this.vsaTicket = null;
//        }
//
//    }

//    public void logout() throws Exception {
//
//        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
//        SecurityContextHolder.clearContext();
//        /**
//         * Delete Cookies
//         */
//        HttpServletRequest request = (HttpServletRequest) externalContext.getRequest();
//        HttpServletResponse response = (HttpServletResponse) externalContext.getResponse();
//        Cookie cookie = new Cookie("SPRING_SECURITY_REMEMBER_ME_COOKIE", null);
//        Cookie jsessionId = new Cookie("JSESSIONID", null);
//        cookie.setMaxAge(0);
//        cookie.setPath(request.getContextPath().length() > 0 ? request
//                .getContextPath() : "/");
//        jsessionId.setMaxAge(0);
//        jsessionId.setPath(request.getContextPath().length() > 0 ? request
//                .getContextPath() : "/");
//        response.addCookie(cookie);
//        response.addCookie(jsessionId);
//
//        String redirectUrl = "";
//        UserToken userToken = (UserToken) request.getSession().getAttribute(Const.CONNECTOR.VSA_USER_TOKEN);
//        if (userToken != null) {
//            String logoutUrl = "{0}?service={1}&userName={2}&appCode={3}";
//            redirectUrl = MessageFormat.format(
//                    logoutUrl,
//                    connector.getLogoutUrl(),
//                    URLEncoder.encode(connector.getServiceURL(), "UTF-8"),
//                    userToken.getUserName(),
//                    connector.getDomainCode());
//        }
//
//        externalContext.invalidateSession();
//        externalContext.redirect(redirectUrl);
//    }
//
//    public void handleExpiredSession() throws IOException {
//        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
//        String redirectUrl = "";
//        try {
//            String expiredUrl = "{0}?service={1}&appCode={2}?faces-redirect=true";
//            redirectUrl = MessageFormat.format(
//                    expiredUrl,
//                    connector.getLogoutUrl(),
//                    URLEncoder.encode(connector.getServiceURL(), "UTF-8"),
//                    connector.getDomainCode());
//        } catch (UnsupportedEncodingException e) {
//            logger.error(e);
//        }
//        try {
//            externalContext.redirect(redirectUrl);
//        } catch (IOException e) {
//            logger.error(e);
//        }
//    }
}
