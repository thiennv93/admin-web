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
@Table(name = "product_options_exceptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductOptionsExceptions.findAll", query = "SELECT p FROM ProductOptionsExceptions p")
    , @NamedQuery(name = "ProductOptionsExceptions.findByExceptionId", query = "SELECT p FROM ProductOptionsExceptions p WHERE p.exceptionId = :exceptionId")
    , @NamedQuery(name = "ProductOptionsExceptions.findByProductId", query = "SELECT p FROM ProductOptionsExceptions p WHERE p.productId = :productId")})
public class ProductOptionsExceptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "exception_id")
    private Integer exceptionId;
    @Basic(optional = false)
    @Column(name = "product_id")
    private int productId;
    @Lob
    @Column(name = "combination")
    private String combination;

    public ProductOptionsExceptions() {
    }

    public ProductOptionsExceptions(Integer exceptionId) {
        this.exceptionId = exceptionId;
    }

    public ProductOptionsExceptions(Integer exceptionId, int productId) {
        this.exceptionId = exceptionId;
        this.productId = productId;
    }

    public Integer getExceptionId() {
        return exceptionId;
    }

    public void setExceptionId(Integer exceptionId) {
        this.exceptionId = exceptionId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getCombination() {
        return combination;
    }

    public void setCombination(String combination) {
        this.combination = combination;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exceptionId != null ? exceptionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductOptionsExceptions)) {
            return false;
        }
        ProductOptionsExceptions other = (ProductOptionsExceptions) object;
        if ((this.exceptionId == null && other.exceptionId != null) || (this.exceptionId != null && !this.exceptionId.equals(other.exceptionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductOptionsExceptions[ exceptionId=" + exceptionId + " ]";
    }
    
}
