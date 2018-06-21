package com.vietfintex.adminfaces.starter.security;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CustomPrincipal implements Serializable {
    private List<Object> principals = new ArrayList<>();

    public List<Object> getPrincipals() {
        return principals;
    }

    public void setPrincipals(List<Object> principals) {
        this.principals = principals;
    }
}
