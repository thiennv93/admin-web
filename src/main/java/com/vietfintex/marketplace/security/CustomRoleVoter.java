package com.vietfintex.marketplace.security;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.access.vote.RoleVoter;
import org.springframework.security.core.Authentication;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;

/**
 * Created by LamNV5 on 4/16/2015.
 */
public class CustomRoleVoter extends RoleVoter {
    private String outerRoleKey;
    private HashMap<String, String> roleMap;

    @Override
    public int vote(Authentication authentication, Object object, Collection<ConfigAttribute> attributes) {
        Method method = ((MethodInvocation) object).getMethod();
        String requireRole = null;
        ConfigAttribute rmAttribute = null;
        for (ConfigAttribute attribute : attributes) {
            if (attribute.getAttribute().equals(outerRoleKey)) {
                requireRole = roleMap.get(method.getDeclaringClass().getName() + "." + method.getName());
                //Neu ko co mapping trong file security-role.xml thi coi nhu duoc thuc hien
                if (requireRole==null || requireRole.isEmpty())
                    return ACCESS_GRANTED;

                rmAttribute = attribute;
            }
        }

        //Thay the bang role duoc cau hinh trong file security-role.xml
        if (rmAttribute != null) {
            attributes.remove(rmAttribute);
        }

        if (requireRole != null) {
            String[] roles = requireRole.split(",");
            for (int i = 0; i < roles.length; i++) {
                attributes.add(new SecurityConfig(roles[i].trim()));
            }
        }

        return super.vote(authentication, object, attributes);
    }

    public String getOuterRoleKey() {
        return outerRoleKey;
    }

    public void setOuterRoleKey(String outerRoleKey) {
        this.outerRoleKey = outerRoleKey;
    }

    public HashMap<String, String> getRoleMap() {
        return roleMap;
    }

    public void setRoleMap(HashMap<String, String> roleMap) {
        this.roleMap = roleMap;
    }
}
