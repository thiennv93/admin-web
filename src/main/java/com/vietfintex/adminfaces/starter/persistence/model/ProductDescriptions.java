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
@Table(name = "product_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductDescriptions.findAll", query = "SELECT p FROM ProductDescriptions p")
    , @NamedQuery(name = "ProductDescriptions.findByProductId", query = "SELECT p FROM ProductDescriptions p WHERE p.productDescriptionsPK.productId = :productId")
    , @NamedQuery(name = "ProductDescriptions.findByLangCode", query = "SELECT p FROM ProductDescriptions p WHERE p.productDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "ProductDescriptions.findByProduct", query = "SELECT p FROM ProductDescriptions p WHERE p.product = :product")
    , @NamedQuery(name = "ProductDescriptions.findByShortname", query = "SELECT p FROM ProductDescriptions p WHERE p.shortname = :shortname")
    , @NamedQuery(name = "ProductDescriptions.findByMetaKeywords", query = "SELECT p FROM ProductDescriptions p WHERE p.metaKeywords = :metaKeywords")
    , @NamedQuery(name = "ProductDescriptions.findByMetaDescription", query = "SELECT p FROM ProductDescriptions p WHERE p.metaDescription = :metaDescription")
    , @NamedQuery(name = "ProductDescriptions.findByPageTitle", query = "SELECT p FROM ProductDescriptions p WHERE p.pageTitle = :pageTitle")
    , @NamedQuery(name = "ProductDescriptions.findByEbayTitle", query = "SELECT p FROM ProductDescriptions p WHERE p.ebayTitle = :ebayTitle")
    , @NamedQuery(name = "ProductDescriptions.findByOverride", query = "SELECT p FROM ProductDescriptions p WHERE p.override = :override")})
public class ProductDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductDescriptionsPK productDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "product")
    private String product;
    @Basic(optional = false)
    @Column(name = "shortname")
    private String shortname;
    @Lob
    @Column(name = "short_description")
    private String shortDescription;
    @Lob
    @Column(name = "full_description")
    private String fullDescription;
    @Basic(optional = false)
    @Column(name = "meta_keywords")
    private String metaKeywords;
    @Basic(optional = false)
    @Column(name = "meta_description")
    private String metaDescription;
    @Lob
    @Column(name = "search_words")
    private String searchWords;
    @Basic(optional = false)
    @Column(name = "page_title")
    private String pageTitle;
    @Lob
    @Column(name = "age_warning_message")
    private String ageWarningMessage;
    @Lob
    @Column(name = "promo_text")
    private String promoText;
    @Column(name = "ebay_title")
    private String ebayTitle;
    @Lob
    @Column(name = "ebay_description")
    private String ebayDescription;
    @Column(name = "override")
    private String override;

    public ProductDescriptions() {
    }

    public ProductDescriptions(ProductDescriptionsPK productDescriptionsPK) {
        this.productDescriptionsPK = productDescriptionsPK;
    }

    public ProductDescriptions(ProductDescriptionsPK productDescriptionsPK, String product, String shortname, String metaKeywords, String metaDescription, String pageTitle) {
        this.productDescriptionsPK = productDescriptionsPK;
        this.product = product;
        this.shortname = shortname;
        this.metaKeywords = metaKeywords;
        this.metaDescription = metaDescription;
        this.pageTitle = pageTitle;
    }

    public ProductDescriptions(int productId, String langCode) {
        this.productDescriptionsPK = new ProductDescriptionsPK(productId, langCode);
    }

    public ProductDescriptionsPK getProductDescriptionsPK() {
        return productDescriptionsPK;
    }

    public void setProductDescriptionsPK(ProductDescriptionsPK productDescriptionsPK) {
        this.productDescriptionsPK = productDescriptionsPK;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public String getSearchWords() {
        return searchWords;
    }

    public void setSearchWords(String searchWords) {
        this.searchWords = searchWords;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getAgeWarningMessage() {
        return ageWarningMessage;
    }

    public void setAgeWarningMessage(String ageWarningMessage) {
        this.ageWarningMessage = ageWarningMessage;
    }

    public String getPromoText() {
        return promoText;
    }

    public void setPromoText(String promoText) {
        this.promoText = promoText;
    }

    public String getEbayTitle() {
        return ebayTitle;
    }

    public void setEbayTitle(String ebayTitle) {
        this.ebayTitle = ebayTitle;
    }

    public String getEbayDescription() {
        return ebayDescription;
    }

    public void setEbayDescription(String ebayDescription) {
        this.ebayDescription = ebayDescription;
    }

    public String getOverride() {
        return override;
    }

    public void setOverride(String override) {
        this.override = override;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productDescriptionsPK != null ? productDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductDescriptions)) {
            return false;
        }
        ProductDescriptions other = (ProductDescriptions) object;
        if ((this.productDescriptionsPK == null && other.productDescriptionsPK != null) || (this.productDescriptionsPK != null && !this.productDescriptionsPK.equals(other.productDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductDescriptions[ productDescriptionsPK=" + productDescriptionsPK + " ]";
    }
    
}
