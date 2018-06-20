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
@Table(name = "product_options")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductOptions.findAll", query = "SELECT p FROM ProductOptions p")
    , @NamedQuery(name = "ProductOptions.findByOptionId", query = "SELECT p FROM ProductOptions p WHERE p.optionId = :optionId")
    , @NamedQuery(name = "ProductOptions.findByProductId", query = "SELECT p FROM ProductOptions p WHERE p.productId = :productId")
    , @NamedQuery(name = "ProductOptions.findByCompanyId", query = "SELECT p FROM ProductOptions p WHERE p.companyId = :companyId")
    , @NamedQuery(name = "ProductOptions.findByOptionType", query = "SELECT p FROM ProductOptions p WHERE p.optionType = :optionType")
    , @NamedQuery(name = "ProductOptions.findByInventory", query = "SELECT p FROM ProductOptions p WHERE p.inventory = :inventory")
    , @NamedQuery(name = "ProductOptions.findByRegexp", query = "SELECT p FROM ProductOptions p WHERE p.regexp = :regexp")
    , @NamedQuery(name = "ProductOptions.findByRequired", query = "SELECT p FROM ProductOptions p WHERE p.required = :required")
    , @NamedQuery(name = "ProductOptions.findByMultiupload", query = "SELECT p FROM ProductOptions p WHERE p.multiupload = :multiupload")
    , @NamedQuery(name = "ProductOptions.findByAllowedExtensions", query = "SELECT p FROM ProductOptions p WHERE p.allowedExtensions = :allowedExtensions")
    , @NamedQuery(name = "ProductOptions.findByMaxFileSize", query = "SELECT p FROM ProductOptions p WHERE p.maxFileSize = :maxFileSize")
    , @NamedQuery(name = "ProductOptions.findByMissingVariantsHandling", query = "SELECT p FROM ProductOptions p WHERE p.missingVariantsHandling = :missingVariantsHandling")
    , @NamedQuery(name = "ProductOptions.findByStatus", query = "SELECT p FROM ProductOptions p WHERE p.status = :status")
    , @NamedQuery(name = "ProductOptions.findByPosition", query = "SELECT p FROM ProductOptions p WHERE p.position = :position")
    , @NamedQuery(name = "ProductOptions.findByValue", query = "SELECT p FROM ProductOptions p WHERE p.value = :value")
    , @NamedQuery(name = "ProductOptions.findByGoogleExportNameOption", query = "SELECT p FROM ProductOptions p WHERE p.googleExportNameOption = :googleExportNameOption")})
public class ProductOptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "option_id")
    private Integer optionId;
    @Basic(optional = false)
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Basic(optional = false)
    @Column(name = "option_type")
    private Character optionType;
    @Basic(optional = false)
    @Column(name = "inventory")
    private Character inventory;
    @Basic(optional = false)
    @Column(name = "regexp")
    private String regexp;
    @Basic(optional = false)
    @Column(name = "required")
    private Character required;
    @Basic(optional = false)
    @Column(name = "multiupload")
    private Character multiupload;
    @Basic(optional = false)
    @Column(name = "allowed_extensions")
    private String allowedExtensions;
    @Basic(optional = false)
    @Column(name = "max_file_size")
    private long maxFileSize;
    @Basic(optional = false)
    @Column(name = "missing_variants_handling")
    private Character missingVariantsHandling;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;
    @Basic(optional = false)
    @Column(name = "google_export_name_option")
    private String googleExportNameOption;

    public ProductOptions() {
    }

    public ProductOptions(Integer optionId) {
        this.optionId = optionId;
    }

    public ProductOptions(Integer optionId, int productId, int companyId, Character optionType, Character inventory, String regexp, Character required, Character multiupload, String allowedExtensions, long maxFileSize, Character missingVariantsHandling, Character status, short position, String value, String googleExportNameOption) {
        this.optionId = optionId;
        this.productId = productId;
        this.companyId = companyId;
        this.optionType = optionType;
        this.inventory = inventory;
        this.regexp = regexp;
        this.required = required;
        this.multiupload = multiupload;
        this.allowedExtensions = allowedExtensions;
        this.maxFileSize = maxFileSize;
        this.missingVariantsHandling = missingVariantsHandling;
        this.status = status;
        this.position = position;
        this.value = value;
        this.googleExportNameOption = googleExportNameOption;
    }

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public Character getOptionType() {
        return optionType;
    }

    public void setOptionType(Character optionType) {
        this.optionType = optionType;
    }

    public Character getInventory() {
        return inventory;
    }

    public void setInventory(Character inventory) {
        this.inventory = inventory;
    }

    public String getRegexp() {
        return regexp;
    }

    public void setRegexp(String regexp) {
        this.regexp = regexp;
    }

    public Character getRequired() {
        return required;
    }

    public void setRequired(Character required) {
        this.required = required;
    }

    public Character getMultiupload() {
        return multiupload;
    }

    public void setMultiupload(Character multiupload) {
        this.multiupload = multiupload;
    }

    public String getAllowedExtensions() {
        return allowedExtensions;
    }

    public void setAllowedExtensions(String allowedExtensions) {
        this.allowedExtensions = allowedExtensions;
    }

    public long getMaxFileSize() {
        return maxFileSize;
    }

    public void setMaxFileSize(long maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public Character getMissingVariantsHandling() {
        return missingVariantsHandling;
    }

    public void setMissingVariantsHandling(Character missingVariantsHandling) {
        this.missingVariantsHandling = missingVariantsHandling;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getGoogleExportNameOption() {
        return googleExportNameOption;
    }

    public void setGoogleExportNameOption(String googleExportNameOption) {
        this.googleExportNameOption = googleExportNameOption;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (optionId != null ? optionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductOptions)) {
            return false;
        }
        ProductOptions other = (ProductOptions) object;
        if ((this.optionId == null && other.optionId != null) || (this.optionId != null && !this.optionId.equals(other.optionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductOptions[ optionId=" + optionId + " ]";
    }
    
}
