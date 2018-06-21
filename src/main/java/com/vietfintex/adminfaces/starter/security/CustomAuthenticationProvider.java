package com.vietfintex.adminfaces.starter.security;

import com.vietfintex.adminfaces.starter.bean.URLBean;
import com.vietfintex.adminfaces.starter.common.Const;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LamNV5 on 4/16/2015.
 */
public class CustomAuthenticationProvider implements AuthenticationProvider {

    private static Logger logger = Logger
            .getLogger(CustomAuthenticationProvider.class);

    @Override
    public Authentication authenticate(Authentication authentication)
            throws AuthenticationException {
//        if (authentication.getCredentials() == null) {
//            throw new BadCredentialsException("Bad Credentials");
//        }
//        FacesContext facesContext = FacesContext.getCurrentInstance();
//        ExternalContext extenalContext = facesContext.getExternalContext();
//
//        HttpServletRequest request = (HttpServletRequest) extenalContext.getRequest();
//        HttpServletResponse httpServletResponse = (HttpServletResponse) extenalContext.getResponse();
        //thiendn1: make the buffer bufferPrincipal here
        //must not change
        CustomPrincipal principal = new CustomPrincipal();
//        URLBean urlBean = (URLBean) request.getSession().getAttribute(Const.URL_BEAN);
//        principal.getPrincipals().add(urlBean);

//        request.setAttribute("VSA-IsPassedVSAFilter", "True");
//        if (!connector.isDomain("BCCS_SALE_VTP")) {
//            Connector cnn = new Connector(request, httpServletResponse);
//            try {
//                if (!(cnn.getAuthenticate())) {
//                    throw new BadCredentialsException("Bad Credentials");
//                }
//            } catch (IOException e) {
//                logger.fatal(e);
//                throw new BadCredentialsException("Bad Credentials");
//            }
//        }
//
//        UserToken userToken = (UserToken) request.getSession().getAttribute(
//                Const.CONNECTOR.VSA_USER_TOKEN);

        //x_1604_1: co che phan quyen sping
        List<GrantedAuthority> grantedAuths = new ArrayList<>();
//        if (userToken != null) {
//            for (ObjectToken component : userToken.getComponentList()) {
//                GrantedAuthorityPassport subComponent = new GrantedAuthorityPassport();
//                BeanUtils.copyProperties(component, subComponent, "childObjects");
//
//                grantedAuths.add(subComponent);
//            }
//
//            principal.getPrincipals().add(0, userToken.getFullName());
//        }

        //x_1604_1: co che phan quyen sping
        return new UsernamePasswordAuthenticationToken(principal, null, grantedAuths);

    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

}
