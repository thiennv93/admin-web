package com.vietfintex.marketplace.security;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vtsoft on 5/5/2015.
 */
public class CustomPrincipal implements Serializable {
    private List<Object> principals = new ArrayList<>();

    public List<Object> getPrincipals() {
        return principals;
    }

    public void setPrincipals(List<Object> principals) {
        this.principals = principals;
    }
}
