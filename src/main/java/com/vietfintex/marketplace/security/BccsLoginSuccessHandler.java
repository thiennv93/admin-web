package com.vietfintex.marketplace.security;

import com.vietfintex.marketplace.Const;
import org.apache.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by vtsoft on 4/15/2015.
 */
public class BccsLoginSuccessHandler implements AuthenticationSuccessHandler {

    public static final Logger logger = Logger.getLogger(BccsLoginSuccessHandler.class);

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response, Authentication auth)
            throws IOException, ServletException {
        URLBean urlBean = getURLBean(request, response, auth);
//        if (urlBean != null) {
//            response.sendRedirect(urlBean.getTargetUrl());
//            return;
//        }
        response.sendRedirect(request.getContextPath() + "/home");

        //Luon goi ham nay de truyen sang service
//        getStaffDTO();
    }

    private URLBean getURLBean(HttpServletRequest request,
                               HttpServletResponse response, Authentication auth) {
        URLBean urlBean = (URLBean) request.getSession().getAttribute(Const.URL_BEAN);
        if (urlBean == null) {
            CustomPrincipal principal = (CustomPrincipal) auth.getPrincipal();
            if (principal != null) {
//                urlBean = (URLBean) principal.getPrincipals().get(1);
            }
        }

        return urlBean;
    }

//    public static String getUserName() {
//        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
//        UserToken userToken = (UserToken) request.getSession().getAttribute(CustomConnector.VSA_USER_TOKEN);
//        return userToken.getUserName();
//    }

    /**
     * Sua nhanh loi mat staffDTO trong truong hop session keo dai
     *
     * @return
     */
//    public static StaffDTO getStaffDTO() {
//        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
//        String ipAddress = request.getHeader("X-FORWARDED-FOR");
//        if (ipAddress == null) {
//            ipAddress = request.getRemoteAddr();
//        }
//        StaffDTO staffDTO = (StaffDTO) request.getSession().getAttribute(com.viettel.fw.common.util.Const.STAFF_TOKEN);
//        try {
//            if (staffDTO == null || DataUtil.isNullOrEmpty(staffDTO.getStaffCode())) {
//                UserToken userToken = (UserToken) request.getSession().getAttribute(CustomConnector.VSA_USER_TOKEN);
////                Thiennv15, comment phan check user tu DB, tao 1 object moi
////                ApplicationContext context = ApplicationContextProvider.getApplicationContext();
////                StaffService staffServiceIn = context.getBean(StaffService.class);
////                staffDTO = staffServiceIn.findActiveByUserName(userToken.getUserName());
//                staffDTO = new StaffDTO();
//                staffDTO.setStaffCode(userToken.getUserName());
//                staffDTO.setBirthDay(userToken.getDateOfBirth());
//                staffDTO.setEmail(userToken.getEmail());
//                staffDTO.setMobile(userToken.getTelephone());
//                staffDTO.setDepartmentId(userToken.getDeptId());
//                staffDTO.setUserId(userToken.getUserID());
//                staffDTO.setUsername(userToken.getUserName());
//                request.getSession().setAttribute(com.viettel.fw.common.util.Const.STAFF_TOKEN, staffDTO);
//                staffDTO.setIpAddress(ipAddress);
//                UserDTO userDTO = new UserDTO(staffDTO.getUserId(), staffDTO.getStaffCode(), staffDTO.getShopId(), staffDTO.getShopCode());
//                request.getSession().setAttribute(com.viettel.fw.common.util.Const.USER_DTO_TOKEN, userDTO);
//            }
//            staffDTO.setCurrentURL(getURL(request));
//        } catch (Exception ex) {
//            logger.error(ex.getMessage(), ex);
//        }
//
//        return staffDTO;
//    }
//
//    private static String getURL(HttpServletRequest request) throws Exception {
//        PrettyContext prettyContext = PrettyContext.getCurrentInstance(request);
//        if(prettyContext!=null){
//            UrlMapping mapping = PrettyContext.getCurrentInstance(request).getCurrentMapping();
//            return mapping==null?null:mapping.getPattern();
//        }
//        return null;
//    }
//
//    public static String getIpAddress() {
//        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
//        String ipAddress = request.getHeader("X-FORWARDED-FOR");
//        if (ipAddress == null) {
//            ipAddress = request.getRemoteAddr();
//        }
//        return ipAddress;
//    }
//
//    public static Long getUserId() {
//        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
//        UserToken userToken = (UserToken) request.getSession().getAttribute(CustomConnector.VSA_USER_TOKEN);
//        return userToken.getUserID();
//    }
}
