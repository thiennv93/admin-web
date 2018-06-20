/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.adminfaces.starter.persistence.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "buy_together")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BuyTogether.findAll", query = "SELECT b FROM BuyTogether b")
    , @NamedQuery(name = "BuyTogether.findByChainId", query = "SELECT b FROM BuyTogether b WHERE b.chainId = :chainId")
    , @NamedQuery(name = "BuyTogether.findByProductId", query = "SELECT b FROM BuyTogether b WHERE b.productId = :productId")
    , @NamedQuery(name = "BuyTogether.findByModifier", query = "SELECT b FROM BuyTogether b WHERE b.modifier = :modifier")
    , @NamedQuery(name = "BuyTogether.findByModifierType", query = "SELECT b FROM BuyTogether b WHERE b.modifierType = :modifierType")
    , @NamedQuery(name = "BuyTogether.findByDateFrom", query = "SELECT b FROM BuyTogether b WHERE b.dateFrom = :dateFrom")
    , @NamedQuery(name = "BuyTogether.findByDateTo", query = "SELECT b FROM BuyTogether b WHERE b.dateTo = :dateTo")
    , @NamedQuery(name = "BuyTogether.findByDisplayInPromotions", query = "SELECT b FROM BuyTogether b WHERE b.displayInPromotions = :displayInPromotions")
    , @NamedQuery(name = "BuyTogether.findByStatus", query = "SELECT b FROM BuyTogether b WHERE b.status = :status")})
public class BuyTogether implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "chain_id")
    private Integer chainId;
    @Basic(optional = false)
    @Column(name = "product_id")
    private int productId;
    @Lob
    @Column(name = "products")
    private String products;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "modifier")
    private BigDecimal modifier;
    @Basic(optional = false)
    @Column(name = "modifier_type")
    private String modifierType;
    @Basic(optional = false)
    @Column(name = "date_from")
    private int dateFrom;
    @Basic(optional = false)
    @Column(name = "date_to")
    private int dateTo;
    @Basic(optional = false)
    @Column(name = "display_in_promotions")
    private Character displayInPromotions;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;

    public BuyTogether() {
    }

    public BuyTogether(Integer chainId) {
        this.chainId = chainId;
    }

    public BuyTogether(Integer chainId, int productId, BigDecimal modifier, String modifierType, int dateFrom, int dateTo, Character displayInPromotions, Character status) {
        this.chainId = chainId;
        this.productId = productId;
        this.modifier = modifier;
        this.modifierType = modifierType;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.displayInPromotions = displayInPromotions;
        this.status = status;
    }

    public Integer getChainId() {
        return chainId;
    }

    public void setChainId(Integer chainId) {
        this.chainId = chainId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public BigDecimal getModifier() {
        return modifier;
    }

    public void setModifier(BigDecimal modifier) {
        this.modifier = modifier;
    }

    public String getModifierType() {
        return modifierType;
    }

    public void setModifierType(String modifierType) {
        this.modifierType = modifierType;
    }

    public int getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(int dateFrom) {
        this.dateFrom = dateFrom;
    }

    public int getDateTo() {
        return dateTo;
    }

    public void setDateTo(int dateTo) {
        this.dateTo = dateTo;
    }

    public Character getDisplayInPromotions() {
        return displayInPromotions;
    }

    public void setDisplayInPromotions(Character displayInPromotions) {
        this.displayInPromotions = displayInPromotions;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chainId != null ? chainId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BuyTogether)) {
            return false;
        }
        BuyTogether other = (BuyTogether) object;
        if ((this.chainId == null && other.chainId != null) || (this.chainId != null && !this.chainId.equals(other.chainId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BuyTogether[ chainId=" + chainId + " ]";
    }
    
}
