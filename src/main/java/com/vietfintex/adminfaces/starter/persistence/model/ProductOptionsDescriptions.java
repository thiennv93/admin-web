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
@Table(name = "product_options_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductOptionsDescriptions.findAll", query = "SELECT p FROM ProductOptionsDescriptions p")
    , @NamedQuery(name = "ProductOptionsDescriptions.findByOptionId", query = "SELECT p FROM ProductOptionsDescriptions p WHERE p.productOptionsDescriptionsPK.optionId = :optionId")
    , @NamedQuery(name = "ProductOptionsDescriptions.findByLangCode", query = "SELECT p FROM ProductOptionsDescriptions p WHERE p.productOptionsDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "ProductOptionsDescriptions.findByOptionName", query = "SELECT p FROM ProductOptionsDescriptions p WHERE p.optionName = :optionName")
    , @NamedQuery(name = "ProductOptionsDescriptions.findByOptionText", query = "SELECT p FROM ProductOptionsDescriptions p WHERE p.optionText = :optionText")
    , @NamedQuery(name = "ProductOptionsDescriptions.findByComment", query = "SELECT p FROM ProductOptionsDescriptions p WHERE p.comment = :comment")
    , @NamedQuery(name = "ProductOptionsDescriptions.findByInnerHint", query = "SELECT p FROM ProductOptionsDescriptions p WHERE p.innerHint = :innerHint")
    , @NamedQuery(name = "ProductOptionsDescriptions.findByIncorrectMessage", query = "SELECT p FROM ProductOptionsDescriptions p WHERE p.incorrectMessage = :incorrectMessage")})
public class ProductOptionsDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductOptionsDescriptionsPK productOptionsDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "option_name")
    private String optionName;
    @Basic(optional = false)
    @Column(name = "option_text")
    private String optionText;
    @Lob
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "comment")
    private String comment;
    @Basic(optional = false)
    @Column(name = "inner_hint")
    private String innerHint;
    @Basic(optional = false)
    @Column(name = "incorrect_message")
    private String incorrectMessage;

    public ProductOptionsDescriptions() {
    }

    public ProductOptionsDescriptions(ProductOptionsDescriptionsPK productOptionsDescriptionsPK) {
        this.productOptionsDescriptionsPK = productOptionsDescriptionsPK;
    }

    public ProductOptionsDescriptions(ProductOptionsDescriptionsPK productOptionsDescriptionsPK, String optionName, String optionText, String comment, String innerHint, String incorrectMessage) {
        this.productOptionsDescriptionsPK = productOptionsDescriptionsPK;
        this.optionName = optionName;
        this.optionText = optionText;
        this.comment = comment;
        this.innerHint = innerHint;
        this.incorrectMessage = incorrectMessage;
    }

    public ProductOptionsDescriptions(int optionId, String langCode) {
        this.productOptionsDescriptionsPK = new ProductOptionsDescriptionsPK(optionId, langCode);
    }

    public ProductOptionsDescriptionsPK getProductOptionsDescriptionsPK() {
        return productOptionsDescriptionsPK;
    }

    public void setProductOptionsDescriptionsPK(ProductOptionsDescriptionsPK productOptionsDescriptionsPK) {
        this.productOptionsDescriptionsPK = productOptionsDescriptionsPK;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public String getOptionText() {
        return optionText;
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getInnerHint() {
        return innerHint;
    }

    public void setInnerHint(String innerHint) {
        this.innerHint = innerHint;
    }

    public String getIncorrectMessage() {
        return incorrectMessage;
    }

    public void setIncorrectMessage(String incorrectMessage) {
        this.incorrectMessage = incorrectMessage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productOptionsDescriptionsPK != null ? productOptionsDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductOptionsDescriptions)) {
            return false;
        }
        ProductOptionsDescriptions other = (ProductOptionsDescriptions) object;
        if ((this.productOptionsDescriptionsPK == null && other.productOptionsDescriptionsPK != null) || (this.productOptionsDescriptionsPK != null && !this.productOptionsDescriptionsPK.equals(other.productOptionsDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductOptionsDescriptions[ productOptionsDescriptionsPK=" + productOptionsDescriptionsPK + " ]";
    }
    
}
