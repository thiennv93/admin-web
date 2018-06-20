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
public class EbayTemplateProductsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "template_id")
    private int templateId;
    @Basic(optional = false)
    @Column(name = "product_id")
    private int productId;

    public EbayTemplateProductsPK() {
    }

    public EbayTemplateProductsPK(int templateId, int productId) {
        this.templateId = templateId;
        this.productId = productId;
    }

    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) templateId;
        hash += (int) productId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EbayTemplateProductsPK)) {
            return false;
        }
        EbayTemplateProductsPK other = (EbayTemplateProductsPK) object;
        if (this.templateId != other.templateId) {
            return false;
        }
        if (this.productId != other.productId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EbayTemplateProductsPK[ templateId=" + templateId + ", productId=" + productId + " ]";
    }
    
}
