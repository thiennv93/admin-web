package com.vietfintex.marketplace.bean;

import com.vietfintex.marketplace.spring.AdminConfig;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

import static java.util.Objects.nonNull;

/**
 * Created by rmpestano on 07/01/17.
 */
//@Named
//@SessionScoped

@ViewScoped
@ManagedBean
public class SkinMB implements Serializable {

    private String skin;

    @ManagedProperty(value="#{adminConfig}")
    private AdminConfig adminConfig;

    @PostConstruct
    public void init() {
        skin = adminConfig.getSkin();
        if(nonNull(skin)) {
            skin = "skin-blue";
        }
    }


    public void changeSkin(String skin){
        this.skin = skin;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public AdminConfig getAdminConfig() {
        return adminConfig;
    }

    public void setAdminConfig(AdminConfig adminConfig) {
        this.adminConfig = adminConfig;
    }
}
