/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.adminfaces.starter.persistence.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Dell
 */
@Embeddable
public class EbayCategoriesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "category_id")
    private int categoryId;
    @Basic(optional = false)
    @Column(name = "site_id")
    private int siteId;

    public EbayCategoriesPK() {
    }

    public EbayCategoriesPK(int categoryId, int siteId) {
        this.categoryId = categoryId;
        this.siteId = siteId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) categoryId;
        hash += (int) siteId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EbayCategoriesPK)) {
            return false;
        }
        EbayCategoriesPK other = (EbayCategoriesPK) object;
        if (this.categoryId != other.categoryId) {
            return false;
        }
        if (this.siteId != other.siteId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EbayCategoriesPK[ categoryId=" + categoryId + ", siteId=" + siteId + " ]";
    }
    
}
