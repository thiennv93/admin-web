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
@Table(name = "logos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Logos.findAll", query = "SELECT l FROM Logos l")
    , @NamedQuery(name = "Logos.findByLogoId", query = "SELECT l FROM Logos l WHERE l.logoId = :logoId")
    , @NamedQuery(name = "Logos.findByLayoutId", query = "SELECT l FROM Logos l WHERE l.layoutId = :layoutId")
    , @NamedQuery(name = "Logos.findByStyleId", query = "SELECT l FROM Logos l WHERE l.styleId = :styleId")
    , @NamedQuery(name = "Logos.findByCompanyId", query = "SELECT l FROM Logos l WHERE l.companyId = :companyId")
    , @NamedQuery(name = "Logos.findByType", query = "SELECT l FROM Logos l WHERE l.type = :type")})
public class Logos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "logo_id")
    private Integer logoId;
    @Basic(optional = false)
    @Column(name = "layout_id")
    private int layoutId;
    @Basic(optional = false)
    @Column(name = "style_id")
    private String styleId;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;

    public Logos() {
    }

    public Logos(Integer logoId) {
        this.logoId = logoId;
    }

    public Logos(Integer logoId, int layoutId, String styleId, int companyId, String type) {
        this.logoId = logoId;
        this.layoutId = layoutId;
        this.styleId = styleId;
        this.companyId = companyId;
        this.type = type;
    }

    public Integer getLogoId() {
        return logoId;
    }

    public void setLogoId(Integer logoId) {
        this.logoId = logoId;
    }

    public int getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(int layoutId) {
        this.layoutId = layoutId;
    }

    public String getStyleId() {
        return styleId;
    }

    public void setStyleId(String styleId) {
        this.styleId = styleId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (logoId != null ? logoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Logos)) {
            return false;
        }
        Logos other = (Logos) object;
        if ((this.logoId == null && other.logoId != null) || (this.logoId != null && !this.logoId.equals(other.logoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Logos[ logoId=" + logoId + " ]";
    }
    
}
