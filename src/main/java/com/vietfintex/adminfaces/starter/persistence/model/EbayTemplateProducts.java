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
@Table(name = "ebay_template_products")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EbayTemplateProducts.findAll", query = "SELECT e FROM EbayTemplateProducts e")
    , @NamedQuery(name = "EbayTemplateProducts.findByEbayItemId", query = "SELECT e FROM EbayTemplateProducts e WHERE e.ebayItemId = :ebayItemId")
    , @NamedQuery(name = "EbayTemplateProducts.findByTemplateId", query = "SELECT e FROM EbayTemplateProducts e WHERE e.ebayTemplateProductsPK.templateId = :templateId")
    , @NamedQuery(name = "EbayTemplateProducts.findByProductId", query = "SELECT e FROM EbayTemplateProducts e WHERE e.ebayTemplateProductsPK.productId = :productId")
    , @NamedQuery(name = "EbayTemplateProducts.findByProductHash", query = "SELECT e FROM EbayTemplateProducts e WHERE e.productHash = :productHash")})
public class EbayTemplateProducts implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EbayTemplateProductsPK ebayTemplateProductsPK;
    @Basic(optional = false)
    @Column(name = "ebay_item_id")
    private long ebayItemId;
    @Basic(optional = false)
    @Column(name = "product_hash")
    private String productHash;
    @Lob
    @Column(name = "pictures")
    private String pictures;
    @Lob
    @Column(name = "combinations")
    private byte[] combinations;

    public EbayTemplateProducts() {
    }

    public EbayTemplateProducts(EbayTemplateProductsPK ebayTemplateProductsPK) {
        this.ebayTemplateProductsPK = ebayTemplateProductsPK;
    }

    public EbayTemplateProducts(EbayTemplateProductsPK ebayTemplateProductsPK, long ebayItemId, String productHash) {
        this.ebayTemplateProductsPK = ebayTemplateProductsPK;
        this.ebayItemId = ebayItemId;
        this.productHash = productHash;
    }

    public EbayTemplateProducts(int templateId, int productId) {
        this.ebayTemplateProductsPK = new EbayTemplateProductsPK(templateId, productId);
    }

    public EbayTemplateProductsPK getEbayTemplateProductsPK() {
        return ebayTemplateProductsPK;
    }

    public void setEbayTemplateProductsPK(EbayTemplateProductsPK ebayTemplateProductsPK) {
        this.ebayTemplateProductsPK = ebayTemplateProductsPK;
    }

    public long getEbayItemId() {
        return ebayItemId;
    }

    public void setEbayItemId(long ebayItemId) {
        this.ebayItemId = ebayItemId;
    }

    public String getProductHash() {
        return productHash;
    }

    public void setProductHash(String productHash) {
        this.productHash = productHash;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public byte[] getCombinations() {
        return combinations;
    }

    public void setCombinations(byte[] combinations) {
        this.combinations = combinations;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ebayTemplateProductsPK != null ? ebayTemplateProductsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EbayTemplateProducts)) {
            return false;
        }
        EbayTemplateProducts other = (EbayTemplateProducts) object;
        if ((this.ebayTemplateProductsPK == null && other.ebayTemplateProductsPK != null) || (this.ebayTemplateProductsPK != null && !this.ebayTemplateProductsPK.equals(other.ebayTemplateProductsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EbayTemplateProducts[ ebayTemplateProductsPK=" + ebayTemplateProductsPK + " ]";
    }
    
}
