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
@Table(name = "product_file_folder_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductFileFolderDescriptions.findAll", query = "SELECT p FROM ProductFileFolderDescriptions p")
    , @NamedQuery(name = "ProductFileFolderDescriptions.findByFolderId", query = "SELECT p FROM ProductFileFolderDescriptions p WHERE p.productFileFolderDescriptionsPK.folderId = :folderId")
    , @NamedQuery(name = "ProductFileFolderDescriptions.findByLangCode", query = "SELECT p FROM ProductFileFolderDescriptions p WHERE p.productFileFolderDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "ProductFileFolderDescriptions.findByFolderName", query = "SELECT p FROM ProductFileFolderDescriptions p WHERE p.folderName = :folderName")})
public class ProductFileFolderDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductFileFolderDescriptionsPK productFileFolderDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "folder_name")
    private String folderName;

    public ProductFileFolderDescriptions() {
    }

    public ProductFileFolderDescriptions(ProductFileFolderDescriptionsPK productFileFolderDescriptionsPK) {
        this.productFileFolderDescriptionsPK = productFileFolderDescriptionsPK;
    }

    public ProductFileFolderDescriptions(ProductFileFolderDescriptionsPK productFileFolderDescriptionsPK, String folderName) {
        this.productFileFolderDescriptionsPK = productFileFolderDescriptionsPK;
        this.folderName = folderName;
    }

    public ProductFileFolderDescriptions(int folderId, String langCode) {
        this.productFileFolderDescriptionsPK = new ProductFileFolderDescriptionsPK(folderId, langCode);
    }

    public ProductFileFolderDescriptionsPK getProductFileFolderDescriptionsPK() {
        return productFileFolderDescriptionsPK;
    }

    public void setProductFileFolderDescriptionsPK(ProductFileFolderDescriptionsPK productFileFolderDescriptionsPK) {
        this.productFileFolderDescriptionsPK = productFileFolderDescriptionsPK;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productFileFolderDescriptionsPK != null ? productFileFolderDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFileFolderDescriptions)) {
            return false;
        }
        ProductFileFolderDescriptions other = (ProductFileFolderDescriptions) object;
        if ((this.productFileFolderDescriptionsPK == null && other.productFileFolderDescriptionsPK != null) || (this.productFileFolderDescriptionsPK != null && !this.productFileFolderDescriptionsPK.equals(other.productFileFolderDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductFileFolderDescriptions[ productFileFolderDescriptionsPK=" + productFileFolderDescriptionsPK + " ]";
    }
    
}
