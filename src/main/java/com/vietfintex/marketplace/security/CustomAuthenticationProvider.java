package com.vietfintex.marketplace.security;

import org.apache.log4j.Logger;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Collection;

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
//        //thiendn1: make the buffer bufferPrincipal here
//        //must not change
//        CustomPrincipal principal = new CustomPrincipal();
//        URLBean urlBean = (URLBean) request.getSession().getAttribute(Const.URL_BEAN);
//        principal.getPrincipals().add(urlBean);
//
//        Connector cnn = new Connector(request, httpServletResponse);
//        request.setAttribute("VSA-IsPassedVSAFilter", "True");
//        try {
//            if (!(cnn.getAuthenticate())) {
//                throw new BadCredentialsException("Bad Credentials");
//            }
//        } catch (IOException e) {
//            logger.fatal(e);
//            throw new BadCredentialsException("Bad Credentials");
//        }
//
//        UserToken userToken = (UserToken) request.getSession().getAttribute(
//                CustomConnector.VSA_USER_TOKEN);
//
//        //x_1604_1: co che phan quyen sping
//        List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
//        for (ObjectToken component : userToken.getComponentList()) {
//            GrantedAuthorityPassport subComponent = new GrantedAuthorityPassport();
//            BeanUtils.copyProperties(component, subComponent,
//                    new String[]{"childObjects"});
//
//            grantedAuths.add(subComponent);
//        }
//
//        principal.getPrincipals().add(0, userToken.getFullName());
//        return new UsernamePasswordAuthenticationToken(principal, null, grantedAuths);
        return new UsernamePasswordAuthenticationToken(null, null, null);

    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

    public static boolean hasRole(String role) {
        Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>)
                SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        boolean hasRole = false;
        for (GrantedAuthority authority : authorities) {
            //logger.info(authority.getAuthority());
            hasRole = authority.getAuthority().equals(role);
            if (hasRole) {
                break;
            }
        }

        return hasRole;
    }

//    public static RequiredRoleMap getAllRoles() {
//        Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>)
//                SecurityContextHolder.getContext().getAuthentication().getAuthorities();
//        List<String> roles = authorities.stream().map(x -> x.getAuthority()).collect(Collectors.toList());
//        RequiredRoleMap requiredRoleMap = new RequiredRoleMap();
//        requiredRoleMap.setValues(roles);
//        return requiredRoleMap;
//    }
//
//    public static RequiredRoleMap createRequiredRoleMap(String... roles) {
//        RequiredRoleMap roleMap = new RequiredRoleMap();
//        for (String role : roles) {
//            if (hasRole(role)) roleMap.add(role);
//        }
//
//        return roleMap;
//    }
//
//    public static RequiredRoleMap createRequiredRoleMap(List<String> roles) {
//        RequiredRoleMap roleMap = new RequiredRoleMap();
//        roles.stream().filter(CustomAuthenticationProvider::hasRole).forEach(roleMap::add);
//        return roleMap;
//    }
}
