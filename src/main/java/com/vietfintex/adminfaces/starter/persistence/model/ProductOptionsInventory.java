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
@Table(name = "product_options_inventory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductOptionsInventory.findAll", query = "SELECT p FROM ProductOptionsInventory p")
    , @NamedQuery(name = "ProductOptionsInventory.findByProductId", query = "SELECT p FROM ProductOptionsInventory p WHERE p.productId = :productId")
    , @NamedQuery(name = "ProductOptionsInventory.findByProductCode", query = "SELECT p FROM ProductOptionsInventory p WHERE p.productCode = :productCode")
    , @NamedQuery(name = "ProductOptionsInventory.findByCombinationHash", query = "SELECT p FROM ProductOptionsInventory p WHERE p.combinationHash = :combinationHash")
    , @NamedQuery(name = "ProductOptionsInventory.findByCombination", query = "SELECT p FROM ProductOptionsInventory p WHERE p.combination = :combination")
    , @NamedQuery(name = "ProductOptionsInventory.findByAmount", query = "SELECT p FROM ProductOptionsInventory p WHERE p.amount = :amount")
    , @NamedQuery(name = "ProductOptionsInventory.findByTemp", query = "SELECT p FROM ProductOptionsInventory p WHERE p.temp = :temp")
    , @NamedQuery(name = "ProductOptionsInventory.findByPosition", query = "SELECT p FROM ProductOptionsInventory p WHERE p.position = :position")})
public class ProductOptionsInventory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @Column(name = "product_code")
    private String productCode;
    @Id
    @Basic(optional = false)
    @Column(name = "combination_hash")
    private Integer combinationHash;
    @Basic(optional = false)
    @Column(name = "combination")
    private String combination;
    @Basic(optional = false)
    @Column(name = "amount")
    private int amount;
    @Basic(optional = false)
    @Column(name = "temp")
    private Character temp;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;

    public ProductOptionsInventory() {
    }

    public ProductOptionsInventory(Integer combinationHash) {
        this.combinationHash = combinationHash;
    }

    public ProductOptionsInventory(Integer combinationHash, int productId, String productCode, String combination, int amount, Character temp, short position) {
        this.combinationHash = combinationHash;
        this.productId = productId;
        this.productCode = productCode;
        this.combination = combination;
        this.amount = amount;
        this.temp = temp;
        this.position = position;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Integer getCombinationHash() {
        return combinationHash;
    }

    public void setCombinationHash(Integer combinationHash) {
        this.combinationHash = combinationHash;
    }

    public String getCombination() {
        return combination;
    }

    public void setCombination(String combination) {
        this.combination = combination;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Character getTemp() {
        return temp;
    }

    public void setTemp(Character temp) {
        this.temp = temp;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (combinationHash != null ? combinationHash.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductOptionsInventory)) {
            return false;
        }
        ProductOptionsInventory other = (ProductOptionsInventory) object;
        if ((this.combinationHash == null && other.combinationHash != null) || (this.combinationHash != null && !this.combinationHash.equals(other.combinationHash))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductOptionsInventory[ combinationHash=" + combinationHash + " ]";
    }
    
}
