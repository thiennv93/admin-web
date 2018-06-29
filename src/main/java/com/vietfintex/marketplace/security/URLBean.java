package com.vietfintex.marketplace.security;

import java.io.Serializable;

/**
 * Created by vtsoft on 5/5/2015.
 */

public class URLBean implements Serializable{
    private String targetUrl = null;

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }
}
