package com.vietfintex.marketplace.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vietfintex.marketplace.Const;
import com.vietfintex.marketplace.dto.ResponseDTO;
import com.vietfintex.marketplace.dto.UserDTO;
import com.vietfintex.marketplace.service.UserService;
import com.vietfintex.marketplace.util.Constants;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.primefaces.model.diagram.connector.Connector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

import static org.springframework.util.StringUtils.isEmpty;
@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
    @Autowired
    UserService userService;
    private static Logger logger = Logger.getLogger(CustomAuthenticationProvider.class);

    @Override
    public Authentication authenticate(Authentication authentication)
            throws AuthenticationException {
        if (isEmpty(authentication.getCredentials()) || isEmpty(authentication.getName())) {
            throw new BadCredentialsException("Bad Credentials");
        }
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();
        Map<String, String> param = new HashMap<>();
        param.put("username", username);
        param.put("password", password);
        ResponseDTO responseDTO = userService.login(param);
        if (!responseDTO.isSuccess() || Objects.isNull(responseDTO.getObjectReturn())){
            return null;
        }
        ObjectMapper objectMapper = new ObjectMapper();

        UserDTO userDTO = objectMapper.convertValue(responseDTO.getObjectReturn(), UserDTO.class);
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext extenalContext = facesContext.getExternalContext();

        HttpServletRequest request = (HttpServletRequest) extenalContext.getRequest();
        request.getSession().setAttribute(Constants.USER_TOKEN, userDTO);
        //make the buffer bufferPrincipal here
        //must not change
        CustomPrincipal principal = new CustomPrincipal();
        URLBean urlBean = (URLBean) request.getSession().getAttribute(Const.URL_BEAN);
        principal.getPrincipals().add(urlBean);

        List<GrantedAuthority> grantedAuths = new ArrayList<>();
        return new UsernamePasswordAuthenticationToken(principal, null, grantedAuths);

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
