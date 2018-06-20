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
@Table(name = "product_file_folders")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductFileFolders.findAll", query = "SELECT p FROM ProductFileFolders p")
    , @NamedQuery(name = "ProductFileFolders.findByFolderId", query = "SELECT p FROM ProductFileFolders p WHERE p.folderId = :folderId")
    , @NamedQuery(name = "ProductFileFolders.findByProductId", query = "SELECT p FROM ProductFileFolders p WHERE p.productId = :productId")
    , @NamedQuery(name = "ProductFileFolders.findByPosition", query = "SELECT p FROM ProductFileFolders p WHERE p.position = :position")
    , @NamedQuery(name = "ProductFileFolders.findByStatus", query = "SELECT p FROM ProductFileFolders p WHERE p.status = :status")})
public class ProductFileFolders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "folder_id")
    private Integer folderId;
    @Basic(optional = false)
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;

    public ProductFileFolders() {
    }

    public ProductFileFolders(Integer folderId) {
        this.folderId = folderId;
    }

    public ProductFileFolders(Integer folderId, int productId, short position, Character status) {
        this.folderId = folderId;
        this.productId = productId;
        this.position = position;
        this.status = status;
    }

    public Integer getFolderId() {
        return folderId;
    }

    public void setFolderId(Integer folderId) {
        this.folderId = folderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
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
        hash += (folderId != null ? folderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFileFolders)) {
            return false;
        }
        ProductFileFolders other = (ProductFileFolders) object;
        if ((this.folderId == null && other.folderId != null) || (this.folderId != null && !this.folderId.equals(other.folderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductFileFolders[ folderId=" + folderId + " ]";
    }
    
}
