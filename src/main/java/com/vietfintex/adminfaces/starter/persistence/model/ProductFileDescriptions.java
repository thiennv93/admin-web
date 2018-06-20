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
@Table(name = "product_file_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductFileDescriptions.findAll", query = "SELECT p FROM ProductFileDescriptions p")
    , @NamedQuery(name = "ProductFileDescriptions.findByFileId", query = "SELECT p FROM ProductFileDescriptions p WHERE p.productFileDescriptionsPK.fileId = :fileId")
    , @NamedQuery(name = "ProductFileDescriptions.findByLangCode", query = "SELECT p FROM ProductFileDescriptions p WHERE p.productFileDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "ProductFileDescriptions.findByFileName", query = "SELECT p FROM ProductFileDescriptions p WHERE p.fileName = :fileName")})
public class ProductFileDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductFileDescriptionsPK productFileDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "file_name")
    private String fileName;
    @Lob
    @Column(name = "license")
    private String license;
    @Lob
    @Column(name = "readme")
    private String readme;

    public ProductFileDescriptions() {
    }

    public ProductFileDescriptions(ProductFileDescriptionsPK productFileDescriptionsPK) {
        this.productFileDescriptionsPK = productFileDescriptionsPK;
    }

    public ProductFileDescriptions(ProductFileDescriptionsPK productFileDescriptionsPK, String fileName) {
        this.productFileDescriptionsPK = productFileDescriptionsPK;
        this.fileName = fileName;
    }

    public ProductFileDescriptions(int fileId, String langCode) {
        this.productFileDescriptionsPK = new ProductFileDescriptionsPK(fileId, langCode);
    }

    public ProductFileDescriptionsPK getProductFileDescriptionsPK() {
        return productFileDescriptionsPK;
    }

    public void setProductFileDescriptionsPK(ProductFileDescriptionsPK productFileDescriptionsPK) {
        this.productFileDescriptionsPK = productFileDescriptionsPK;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getReadme() {
        return readme;
    }

    public void setReadme(String readme) {
        this.readme = readme;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productFileDescriptionsPK != null ? productFileDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFileDescriptions)) {
            return false;
        }
        ProductFileDescriptions other = (ProductFileDescriptions) object;
        if ((this.productFileDescriptionsPK == null && other.productFileDescriptionsPK != null) || (this.productFileDescriptionsPK != null && !this.productFileDescriptionsPK.equals(other.productFileDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductFileDescriptions[ productFileDescriptionsPK=" + productFileDescriptionsPK + " ]";
    }
    
}
