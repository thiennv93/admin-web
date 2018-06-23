 /*
  * To change this license header, choose License Headers in Project Properties.
  * To change this template file, choose Tools | Templates
  * and open the template in the editor.
  */
 package com.vietfintex.adminfaces.starter.security;

 import com.vietfintex.adminfaces.starter.bean.URLBean;
 import com.vietfintex.adminfaces.starter.common.Const;
 import org.apache.log4j.Logger;
 import org.springframework.security.core.AuthenticationException;
 import org.springframework.security.web.RedirectStrategy;
 import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;

 import javax.servlet.RequestDispatcher;
 import javax.servlet.ServletException;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import java.io.IOException;

 /**
  * @author thiendn1
  */
 public class CustomLoginUrlAuthenticationEntryPoint extends LoginUrlAuthenticationEntryPoint {
     private static final Logger logger = Logger.getLogger(CustomLoginUrlAuthenticationEntryPoint.class);
     private RedirectStrategy redirectStrategy;

     public CustomLoginUrlAuthenticationEntryPoint(String loginFormUrl) {
         super(loginFormUrl);
     }

     @Override
     public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authenticationException) throws IOException, ServletException {

//         URLBean urlBean = new URLBean();
//         urlBean.setTargetUrl(request.getRequestURI());
//         request.setAttribute(Const.URL_BEAN, urlBean);
//         request.getSession().setAttribute(Const.URL_BEAN, urlBean);

         String redirectUrl = null;

         if (isUseForward()) {

             if (isForceHttps() && "http".equals(request.getScheme())) {
                 // First redirect the current request to HTTPS.
                 // When that request is received, the forward to the login page
                 // will be used.
                 redirectUrl = buildHttpsRedirectUrlForRequest(request);
             }

             if (redirectUrl == null) {
                 String loginForm = determineUrlToUseForThisRequest(request,
                         response, authenticationException);

                 logger.debug("Server side forward to: " + loginForm);

                 RequestDispatcher dispatcher = request
                         .getRequestDispatcher(loginForm);

                 dispatcher.forward(request, response);

                 return;
             }
         } else {
             // redirect to login page. Use https if forceHttps true

             redirectUrl = buildRedirectUrlToLoginPage(request, response, authenticationException);
         }
         redirectStrategy.sendRedirect(request, response, redirectUrl);
//         super.commence(request, response, authenticationException);

     }

     public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
         this.redirectStrategy = redirectStrategy;
     }
 }
