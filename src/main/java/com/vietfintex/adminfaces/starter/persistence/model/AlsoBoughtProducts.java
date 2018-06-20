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
@Table(name = "also_bought_products")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AlsoBoughtProducts.findAll", query = "SELECT a FROM AlsoBoughtProducts a")
    , @NamedQuery(name = "AlsoBoughtProducts.findByProductId", query = "SELECT a FROM AlsoBoughtProducts a WHERE a.alsoBoughtProductsPK.productId = :productId")
    , @NamedQuery(name = "AlsoBoughtProducts.findByRelatedId", query = "SELECT a FROM AlsoBoughtProducts a WHERE a.alsoBoughtProductsPK.relatedId = :relatedId")
    , @NamedQuery(name = "AlsoBoughtProducts.findByAmount", query = "SELECT a FROM AlsoBoughtProducts a WHERE a.amount = :amount")})
public class AlsoBoughtProducts implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AlsoBoughtProductsPK alsoBoughtProductsPK;
    @Basic(optional = false)
    @Column(name = "amount")
    private short amount;

    public AlsoBoughtProducts() {
    }

    public AlsoBoughtProducts(AlsoBoughtProductsPK alsoBoughtProductsPK) {
        this.alsoBoughtProductsPK = alsoBoughtProductsPK;
    }

    public AlsoBoughtProducts(AlsoBoughtProductsPK alsoBoughtProductsPK, short amount) {
        this.alsoBoughtProductsPK = alsoBoughtProductsPK;
        this.amount = amount;
    }

    public AlsoBoughtProducts(int productId, int relatedId) {
        this.alsoBoughtProductsPK = new AlsoBoughtProductsPK(productId, relatedId);
    }

    public AlsoBoughtProductsPK getAlsoBoughtProductsPK() {
        return alsoBoughtProductsPK;
    }

    public void setAlsoBoughtProductsPK(AlsoBoughtProductsPK alsoBoughtProductsPK) {
        this.alsoBoughtProductsPK = alsoBoughtProductsPK;
    }

    public short getAmount() {
        return amount;
    }

    public void setAmount(short amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (alsoBoughtProductsPK != null ? alsoBoughtProductsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlsoBoughtProducts)) {
            return false;
        }
        AlsoBoughtProducts other = (AlsoBoughtProducts) object;
        if ((this.alsoBoughtProductsPK == null && other.alsoBoughtProductsPK != null) || (this.alsoBoughtProductsPK != null && !this.alsoBoughtProductsPK.equals(other.alsoBoughtProductsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AlsoBoughtProducts[ alsoBoughtProductsPK=" + alsoBoughtProductsPK + " ]";
    }
    
}
