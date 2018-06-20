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
@Table(name = "ebay_template_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EbayTemplateDescriptions.findAll", query = "SELECT e FROM EbayTemplateDescriptions e")
    , @NamedQuery(name = "EbayTemplateDescriptions.findByTemplateId", query = "SELECT e FROM EbayTemplateDescriptions e WHERE e.ebayTemplateDescriptionsPK.templateId = :templateId")
    , @NamedQuery(name = "EbayTemplateDescriptions.findByLangCode", query = "SELECT e FROM EbayTemplateDescriptions e WHERE e.ebayTemplateDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "EbayTemplateDescriptions.findByName", query = "SELECT e FROM EbayTemplateDescriptions e WHERE e.name = :name")})
public class EbayTemplateDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EbayTemplateDescriptionsPK ebayTemplateDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    public EbayTemplateDescriptions() {
    }

    public EbayTemplateDescriptions(EbayTemplateDescriptionsPK ebayTemplateDescriptionsPK) {
        this.ebayTemplateDescriptionsPK = ebayTemplateDescriptionsPK;
    }

    public EbayTemplateDescriptions(EbayTemplateDescriptionsPK ebayTemplateDescriptionsPK, String name) {
        this.ebayTemplateDescriptionsPK = ebayTemplateDescriptionsPK;
        this.name = name;
    }

    public EbayTemplateDescriptions(int templateId, String langCode) {
        this.ebayTemplateDescriptionsPK = new EbayTemplateDescriptionsPK(templateId, langCode);
    }

    public EbayTemplateDescriptionsPK getEbayTemplateDescriptionsPK() {
        return ebayTemplateDescriptionsPK;
    }

    public void setEbayTemplateDescriptionsPK(EbayTemplateDescriptionsPK ebayTemplateDescriptionsPK) {
        this.ebayTemplateDescriptionsPK = ebayTemplateDescriptionsPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ebayTemplateDescriptionsPK != null ? ebayTemplateDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EbayTemplateDescriptions)) {
            return false;
        }
        EbayTemplateDescriptions other = (EbayTemplateDescriptions) object;
        if ((this.ebayTemplateDescriptionsPK == null && other.ebayTemplateDescriptionsPK != null) || (this.ebayTemplateDescriptionsPK != null && !this.ebayTemplateDescriptionsPK.equals(other.ebayTemplateDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EbayTemplateDescriptions[ ebayTemplateDescriptionsPK=" + ebayTemplateDescriptionsPK + " ]";
    }
    
}
