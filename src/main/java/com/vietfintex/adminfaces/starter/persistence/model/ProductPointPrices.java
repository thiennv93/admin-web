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
@Table(name = "product_point_prices")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductPointPrices.findAll", query = "SELECT p FROM ProductPointPrices p")
    , @NamedQuery(name = "ProductPointPrices.findByPointPriceId", query = "SELECT p FROM ProductPointPrices p WHERE p.pointPriceId = :pointPriceId")
    , @NamedQuery(name = "ProductPointPrices.findByProductId", query = "SELECT p FROM ProductPointPrices p WHERE p.productId = :productId")
    , @NamedQuery(name = "ProductPointPrices.findByPointPrice", query = "SELECT p FROM ProductPointPrices p WHERE p.pointPrice = :pointPrice")
    , @NamedQuery(name = "ProductPointPrices.findByLowerLimit", query = "SELECT p FROM ProductPointPrices p WHERE p.lowerLimit = :lowerLimit")
    , @NamedQuery(name = "ProductPointPrices.findByUsergroupId", query = "SELECT p FROM ProductPointPrices p WHERE p.usergroupId = :usergroupId")})
public class ProductPointPrices implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "point_price_id")
    private Integer pointPriceId;
    @Basic(optional = false)
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @Column(name = "point_price")
    private int pointPrice;
    @Basic(optional = false)
    @Column(name = "lower_limit")
    private short lowerLimit;
    @Basic(optional = false)
    @Column(name = "usergroup_id")
    private int usergroupId;

    public ProductPointPrices() {
    }

    public ProductPointPrices(Integer pointPriceId) {
        this.pointPriceId = pointPriceId;
    }

    public ProductPointPrices(Integer pointPriceId, int productId, int pointPrice, short lowerLimit, int usergroupId) {
        this.pointPriceId = pointPriceId;
        this.productId = productId;
        this.pointPrice = pointPrice;
        this.lowerLimit = lowerLimit;
        this.usergroupId = usergroupId;
    }

    public Integer getPointPriceId() {
        return pointPriceId;
    }

    public void setPointPriceId(Integer pointPriceId) {
        this.pointPriceId = pointPriceId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getPointPrice() {
        return pointPrice;
    }

    public void setPointPrice(int pointPrice) {
        this.pointPrice = pointPrice;
    }

    public short getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(short lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public int getUsergroupId() {
        return usergroupId;
    }

    public void setUsergroupId(int usergroupId) {
        this.usergroupId = usergroupId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pointPriceId != null ? pointPriceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPointPrices)) {
            return false;
        }
        ProductPointPrices other = (ProductPointPrices) object;
        if ((this.pointPriceId == null && other.pointPriceId != null) || (this.pointPriceId != null && !this.pointPriceId.equals(other.pointPriceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductPointPrices[ pointPriceId=" + pointPriceId + " ]";
    }
    
}
