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
@Table(name = "product_file_ekeys")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductFileEkeys.findAll", query = "SELECT p FROM ProductFileEkeys p")
    , @NamedQuery(name = "ProductFileEkeys.findByEkey", query = "SELECT p FROM ProductFileEkeys p WHERE p.ekey = :ekey")
    , @NamedQuery(name = "ProductFileEkeys.findByFileId", query = "SELECT p FROM ProductFileEkeys p WHERE p.productFileEkeysPK.fileId = :fileId")
    , @NamedQuery(name = "ProductFileEkeys.findByProductId", query = "SELECT p FROM ProductFileEkeys p WHERE p.productId = :productId")
    , @NamedQuery(name = "ProductFileEkeys.findByOrderId", query = "SELECT p FROM ProductFileEkeys p WHERE p.productFileEkeysPK.orderId = :orderId")
    , @NamedQuery(name = "ProductFileEkeys.findByDownloads", query = "SELECT p FROM ProductFileEkeys p WHERE p.downloads = :downloads")
    , @NamedQuery(name = "ProductFileEkeys.findByActive", query = "SELECT p FROM ProductFileEkeys p WHERE p.active = :active")
    , @NamedQuery(name = "ProductFileEkeys.findByTtl", query = "SELECT p FROM ProductFileEkeys p WHERE p.ttl = :ttl")})
public class ProductFileEkeys implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductFileEkeysPK productFileEkeysPK;
    @Basic(optional = false)
    @Column(name = "ekey")
    private String ekey;
    @Basic(optional = false)
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @Column(name = "downloads")
    private int downloads;
    @Basic(optional = false)
    @Column(name = "active")
    private Character active;
    @Basic(optional = false)
    @Column(name = "ttl")
    private int ttl;

    public ProductFileEkeys() {
    }

    public ProductFileEkeys(ProductFileEkeysPK productFileEkeysPK) {
        this.productFileEkeysPK = productFileEkeysPK;
    }

    public ProductFileEkeys(ProductFileEkeysPK productFileEkeysPK, String ekey, int productId, int downloads, Character active, int ttl) {
        this.productFileEkeysPK = productFileEkeysPK;
        this.ekey = ekey;
        this.productId = productId;
        this.downloads = downloads;
        this.active = active;
        this.ttl = ttl;
    }

    public ProductFileEkeys(int fileId, int orderId) {
        this.productFileEkeysPK = new ProductFileEkeysPK(fileId, orderId);
    }

    public ProductFileEkeysPK getProductFileEkeysPK() {
        return productFileEkeysPK;
    }

    public void setProductFileEkeysPK(ProductFileEkeysPK productFileEkeysPK) {
        this.productFileEkeysPK = productFileEkeysPK;
    }

    public String getEkey() {
        return ekey;
    }

    public void setEkey(String ekey) {
        this.ekey = ekey;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getDownloads() {
        return downloads;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

    public Character getActive() {
        return active;
    }

    public void setActive(Character active) {
        this.active = active;
    }

    public int getTtl() {
        return ttl;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productFileEkeysPK != null ? productFileEkeysPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFileEkeys)) {
            return false;
        }
        ProductFileEkeys other = (ProductFileEkeys) object;
        if ((this.productFileEkeysPK == null && other.productFileEkeysPK != null) || (this.productFileEkeysPK != null && !this.productFileEkeysPK.equals(other.productFileEkeysPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductFileEkeys[ productFileEkeysPK=" + productFileEkeysPK + " ]";
    }
    
}
