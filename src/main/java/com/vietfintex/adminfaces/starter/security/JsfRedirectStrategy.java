/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.adminfaces.starter.security;

import com.vietfintex.adminfaces.starter.bean.URLBean;
import com.vietfintex.adminfaces.starter.common.Const;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.web.session.InvalidSessionStrategy;
import org.springframework.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;

/**
 
 */
public class JsfRedirectStrategy implements InvalidSessionStrategy {

    private Logger logger = LoggerFactory.getLogger(getClass());
    private static final String FACES_REQUEST_HEADER = "faces-request";
    private String invalidSessionUrl;

    @Autowired
    ApplicationContext context;
    /**
     * {@inheritDoc}
     * @param request
     * @param response
     * @throws IOException
     * @throws javax.servlet.ServletException
     */
    @Override
    public void onInvalidSessionDetected(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        boolean ajaxRedirect = "partial/ajax".equals(request.getHeader(FACES_REQUEST_HEADER));
        if (ajaxRedirect) {
            String contextPath = request.getContextPath();
            String redirectUrl = contextPath + invalidSessionUrl;
            logger.debug("Session expired due to ajax request, redirecting to '{}'", redirectUrl);
            String referrer = request.getHeader("referer");
            if(referrer!=null){
                URL url = new URL(referrer);
                URLBean urlBean = new URLBean();
                urlBean.setTargetUrl(url.getPath());
                request.getSession().setAttribute(Const.URL_BEAN,urlBean);
            }
            String ajaxRedirectXml = createAjaxRedirectXml(redirectUrl);
            logger.debug("Ajax partial response to redirect: {}", ajaxRedirectXml);
            response.setContentType("text/xml");
            response.getWriter().write(ajaxRedirectXml);
        } else {
            String requestURI = getRequestUrl(request);
            logger.debug("Session expired due to non-ajax request, starting a new session and redirect to requested url '{}'", requestURI);
            request.getSession(true);
            response.sendRedirect(requestURI);
        }

    }

    private String getRequestUrl(HttpServletRequest request) {
        StringBuffer requestURL = request.getRequestURL();

        String queryString = request.getQueryString();
        if (StringUtils.hasText(queryString)) {
            requestURL.append("?").append(queryString);
        }

        return requestURL.toString();
    }

    private String createAjaxRedirectXml(String redirectUrl) {
        return new StringBuilder()
                .append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>")
                .append("<partial-response><redirect url=\"")
                .append(redirectUrl)
                .append("\"></redirect></partial-response>")
                .toString();
    }

    public void setInvalidSessionUrl(String invalidSessionUrl) {
        this.invalidSessionUrl = invalidSessionUrl;
    }
}
