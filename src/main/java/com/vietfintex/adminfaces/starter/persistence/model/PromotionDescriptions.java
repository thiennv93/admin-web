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
@Table(name = "promotion_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PromotionDescriptions.findAll", query = "SELECT p FROM PromotionDescriptions p")
    , @NamedQuery(name = "PromotionDescriptions.findByPromotionId", query = "SELECT p FROM PromotionDescriptions p WHERE p.promotionDescriptionsPK.promotionId = :promotionId")
    , @NamedQuery(name = "PromotionDescriptions.findByName", query = "SELECT p FROM PromotionDescriptions p WHERE p.name = :name")
    , @NamedQuery(name = "PromotionDescriptions.findByLangCode", query = "SELECT p FROM PromotionDescriptions p WHERE p.promotionDescriptionsPK.langCode = :langCode")})
public class PromotionDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PromotionDescriptionsPK promotionDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Lob
    @Column(name = "short_description")
    private String shortDescription;
    @Lob
    @Column(name = "detailed_description")
    private String detailedDescription;

    public PromotionDescriptions() {
    }

    public PromotionDescriptions(PromotionDescriptionsPK promotionDescriptionsPK) {
        this.promotionDescriptionsPK = promotionDescriptionsPK;
    }

    public PromotionDescriptions(PromotionDescriptionsPK promotionDescriptionsPK, String name) {
        this.promotionDescriptionsPK = promotionDescriptionsPK;
        this.name = name;
    }

    public PromotionDescriptions(int promotionId, String langCode) {
        this.promotionDescriptionsPK = new PromotionDescriptionsPK(promotionId, langCode);
    }

    public PromotionDescriptionsPK getPromotionDescriptionsPK() {
        return promotionDescriptionsPK;
    }

    public void setPromotionDescriptionsPK(PromotionDescriptionsPK promotionDescriptionsPK) {
        this.promotionDescriptionsPK = promotionDescriptionsPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDetailedDescription() {
        return detailedDescription;
    }

    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (promotionDescriptionsPK != null ? promotionDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PromotionDescriptions)) {
            return false;
        }
        PromotionDescriptions other = (PromotionDescriptions) object;
        if ((this.promotionDescriptionsPK == null && other.promotionDescriptionsPK != null) || (this.promotionDescriptionsPK != null && !this.promotionDescriptionsPK.equals(other.promotionDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PromotionDescriptions[ promotionDescriptionsPK=" + promotionDescriptionsPK + " ]";
    }
    
}
