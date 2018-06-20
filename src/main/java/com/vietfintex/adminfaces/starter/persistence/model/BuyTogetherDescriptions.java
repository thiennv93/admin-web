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
@Table(name = "buy_together_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BuyTogetherDescriptions.findAll", query = "SELECT b FROM BuyTogetherDescriptions b")
    , @NamedQuery(name = "BuyTogetherDescriptions.findByChainId", query = "SELECT b FROM BuyTogetherDescriptions b WHERE b.buyTogetherDescriptionsPK.chainId = :chainId")
    , @NamedQuery(name = "BuyTogetherDescriptions.findByName", query = "SELECT b FROM BuyTogetherDescriptions b WHERE b.name = :name")
    , @NamedQuery(name = "BuyTogetherDescriptions.findByLangCode", query = "SELECT b FROM BuyTogetherDescriptions b WHERE b.buyTogetherDescriptionsPK.langCode = :langCode")})
public class BuyTogetherDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BuyTogetherDescriptionsPK buyTogetherDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Lob
    @Column(name = "description")
    private String description;

    public BuyTogetherDescriptions() {
    }

    public BuyTogetherDescriptions(BuyTogetherDescriptionsPK buyTogetherDescriptionsPK) {
        this.buyTogetherDescriptionsPK = buyTogetherDescriptionsPK;
    }

    public BuyTogetherDescriptions(BuyTogetherDescriptionsPK buyTogetherDescriptionsPK, String name) {
        this.buyTogetherDescriptionsPK = buyTogetherDescriptionsPK;
        this.name = name;
    }

    public BuyTogetherDescriptions(int chainId, String langCode) {
        this.buyTogetherDescriptionsPK = new BuyTogetherDescriptionsPK(chainId, langCode);
    }

    public BuyTogetherDescriptionsPK getBuyTogetherDescriptionsPK() {
        return buyTogetherDescriptionsPK;
    }

    public void setBuyTogetherDescriptionsPK(BuyTogetherDescriptionsPK buyTogetherDescriptionsPK) {
        this.buyTogetherDescriptionsPK = buyTogetherDescriptionsPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        hash += (buyTogetherDescriptionsPK != null ? buyTogetherDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BuyTogetherDescriptions)) {
            return false;
        }
        BuyTogetherDescriptions other = (BuyTogetherDescriptions) object;
        if ((this.buyTogetherDescriptionsPK == null && other.buyTogetherDescriptionsPK != null) || (this.buyTogetherDescriptionsPK != null && !this.buyTogetherDescriptionsPK.equals(other.buyTogetherDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BuyTogetherDescriptions[ buyTogetherDescriptionsPK=" + buyTogetherDescriptionsPK + " ]";
    }
    
}
