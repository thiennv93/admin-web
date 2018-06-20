/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.adminfaces.starter.persistence.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "vendor_plan_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VendorPlanDescriptions.findAll", query = "SELECT v FROM VendorPlanDescriptions v")
    , @NamedQuery(name = "VendorPlanDescriptions.findByPlanId", query = "SELECT v FROM VendorPlanDescriptions v WHERE v.vendorPlanDescriptionsPK.planId = :planId")
    , @NamedQuery(name = "VendorPlanDescriptions.findByLangCode", query = "SELECT v FROM VendorPlanDescriptions v WHERE v.vendorPlanDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "VendorPlanDescriptions.findByPlan", query = "SELECT v FROM VendorPlanDescriptions v WHERE v.plan = :plan")})
public class VendorPlanDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VendorPlanDescriptionsPK vendorPlanDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "plan")
    private String plan;
    @Lob
    @Column(name = "description")
    private String description;

    public VendorPlanDescriptions() {
    }

    public VendorPlanDescriptions(VendorPlanDescriptionsPK vendorPlanDescriptionsPK) {
        this.vendorPlanDescriptionsPK = vendorPlanDescriptionsPK;
    }

    public VendorPlanDescriptions(VendorPlanDescriptionsPK vendorPlanDescriptionsPK, String plan) {
        this.vendorPlanDescriptionsPK = vendorPlanDescriptionsPK;
        this.plan = plan;
    }

    public VendorPlanDescriptions(int planId, String langCode) {
        this.vendorPlanDescriptionsPK = new VendorPlanDescriptionsPK(planId, langCode);
    }

    public VendorPlanDescriptionsPK getVendorPlanDescriptionsPK() {
        return vendorPlanDescriptionsPK;
    }

    public void setVendorPlanDescriptionsPK(VendorPlanDescriptionsPK vendorPlanDescriptionsPK) {
        this.vendorPlanDescriptionsPK = vendorPlanDescriptionsPK;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vendorPlanDescriptionsPK != null ? vendorPlanDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VendorPlanDescriptions)) {
            return false;
        }
        VendorPlanDescriptions other = (VendorPlanDescriptions) object;
        if ((this.vendorPlanDescriptionsPK == null && other.vendorPlanDescriptionsPK != null) || (this.vendorPlanDescriptionsPK != null && !this.vendorPlanDescriptionsPK.equals(other.vendorPlanDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "VendorPlanDescriptions[ vendorPlanDescriptionsPK=" + vendorPlanDescriptionsPK + " ]";
    }
    
}
