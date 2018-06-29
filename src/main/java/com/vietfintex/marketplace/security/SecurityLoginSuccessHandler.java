package com.vietfintex.marketplace.security;

import com.vietfintex.marketplace.Const;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class SecurityLoginSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response, Authentication auth)
            throws IOException, ServletException {
        URLBean urlBean = getURLBean(request, response, auth);
        if (urlBean != null) {
            response.sendRedirect(urlBean.getTargetUrl());
            return;
        }
        response.sendRedirect(request.getContextPath() + "/home");
    }

    private URLBean getURLBean(HttpServletRequest request,
                               HttpServletResponse response, Authentication auth) {
        URLBean urlBean = (URLBean) request.getSession().getAttribute(Const.URL_BEAN);
        if (urlBean == null) {
            CustomPrincipal principal = (CustomPrincipal) auth.getPrincipal();
            if (principal != null) {
                urlBean = (URLBean) principal.getPrincipals().get(1);
            }
        }

        return urlBean;
    }

}
