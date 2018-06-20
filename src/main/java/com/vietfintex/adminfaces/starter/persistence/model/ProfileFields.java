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
@Table(name = "profile_fields")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProfileFields.findAll", query = "SELECT p FROM ProfileFields p")
    , @NamedQuery(name = "ProfileFields.findByFieldId", query = "SELECT p FROM ProfileFields p WHERE p.fieldId = :fieldId")
    , @NamedQuery(name = "ProfileFields.findByFieldName", query = "SELECT p FROM ProfileFields p WHERE p.fieldName = :fieldName")
    , @NamedQuery(name = "ProfileFields.findByProfileShow", query = "SELECT p FROM ProfileFields p WHERE p.profileShow = :profileShow")
    , @NamedQuery(name = "ProfileFields.findByProfileRequired", query = "SELECT p FROM ProfileFields p WHERE p.profileRequired = :profileRequired")
    , @NamedQuery(name = "ProfileFields.findByCheckoutShow", query = "SELECT p FROM ProfileFields p WHERE p.checkoutShow = :checkoutShow")
    , @NamedQuery(name = "ProfileFields.findByCheckoutRequired", query = "SELECT p FROM ProfileFields p WHERE p.checkoutRequired = :checkoutRequired")
    , @NamedQuery(name = "ProfileFields.findByPartnerShow", query = "SELECT p FROM ProfileFields p WHERE p.partnerShow = :partnerShow")
    , @NamedQuery(name = "ProfileFields.findByPartnerRequired", query = "SELECT p FROM ProfileFields p WHERE p.partnerRequired = :partnerRequired")
    , @NamedQuery(name = "ProfileFields.findByFieldType", query = "SELECT p FROM ProfileFields p WHERE p.fieldType = :fieldType")
    , @NamedQuery(name = "ProfileFields.findByPosition", query = "SELECT p FROM ProfileFields p WHERE p.position = :position")
    , @NamedQuery(name = "ProfileFields.findByIsDefault", query = "SELECT p FROM ProfileFields p WHERE p.isDefault = :isDefault")
    , @NamedQuery(name = "ProfileFields.findBySection", query = "SELECT p FROM ProfileFields p WHERE p.section = :section")
    , @NamedQuery(name = "ProfileFields.findByMatchingId", query = "SELECT p FROM ProfileFields p WHERE p.matchingId = :matchingId")
    , @NamedQuery(name = "ProfileFields.findByClass1", query = "SELECT p FROM ProfileFields p WHERE p.class1 = :class1")
    , @NamedQuery(name = "ProfileFields.findByAutocompleteType", query = "SELECT p FROM ProfileFields p WHERE p.autocompleteType = :autocompleteType")})
public class ProfileFields implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "field_id")
    private Integer fieldId;
    @Basic(optional = false)
    @Column(name = "field_name")
    private String fieldName;
    @Column(name = "profile_show")
    private Character profileShow;
    @Column(name = "profile_required")
    private Character profileRequired;
    @Column(name = "checkout_show")
    private Character checkoutShow;
    @Column(name = "checkout_required")
    private Character checkoutRequired;
    @Column(name = "partner_show")
    private Character partnerShow;
    @Column(name = "partner_required")
    private Character partnerRequired;
    @Basic(optional = false)
    @Column(name = "field_type")
    private Character fieldType;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Column(name = "is_default")
    private Character isDefault;
    @Column(name = "section")
    private Character section;
    @Basic(optional = false)
    @Column(name = "matching_id")
    private int matchingId;
    @Basic(optional = false)
    @Column(name = "class")
    private String class1;
    @Basic(optional = false)
    @Column(name = "autocomplete_type")
    private String autocompleteType;

    public ProfileFields() {
    }

    public ProfileFields(Integer fieldId) {
        this.fieldId = fieldId;
    }

    public ProfileFields(Integer fieldId, String fieldName, Character fieldType, short position, int matchingId, String class1, String autocompleteType) {
        this.fieldId = fieldId;
        this.fieldName = fieldName;
        this.fieldType = fieldType;
        this.position = position;
        this.matchingId = matchingId;
        this.class1 = class1;
        this.autocompleteType = autocompleteType;
    }

    public Integer getFieldId() {
        return fieldId;
    }

    public void setFieldId(Integer fieldId) {
        this.fieldId = fieldId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Character getProfileShow() {
        return profileShow;
    }

    public void setProfileShow(Character profileShow) {
        this.profileShow = profileShow;
    }

    public Character getProfileRequired() {
        return profileRequired;
    }

    public void setProfileRequired(Character profileRequired) {
        this.profileRequired = profileRequired;
    }

    public Character getCheckoutShow() {
        return checkoutShow;
    }

    public void setCheckoutShow(Character checkoutShow) {
        this.checkoutShow = checkoutShow;
    }

    public Character getCheckoutRequired() {
        return checkoutRequired;
    }

    public void setCheckoutRequired(Character checkoutRequired) {
        this.checkoutRequired = checkoutRequired;
    }

    public Character getPartnerShow() {
        return partnerShow;
    }

    public void setPartnerShow(Character partnerShow) {
        this.partnerShow = partnerShow;
    }

    public Character getPartnerRequired() {
        return partnerRequired;
    }

    public void setPartnerRequired(Character partnerRequired) {
        this.partnerRequired = partnerRequired;
    }

    public Character getFieldType() {
        return fieldType;
    }

    public void setFieldType(Character fieldType) {
        this.fieldType = fieldType;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public Character getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Character isDefault) {
        this.isDefault = isDefault;
    }

    public Character getSection() {
        return section;
    }

    public void setSection(Character section) {
        this.section = section;
    }

    public int getMatchingId() {
        return matchingId;
    }

    public void setMatchingId(int matchingId) {
        this.matchingId = matchingId;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public String getAutocompleteType() {
        return autocompleteType;
    }

    public void setAutocompleteType(String autocompleteType) {
        this.autocompleteType = autocompleteType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fieldId != null ? fieldId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfileFields)) {
            return false;
        }
        ProfileFields other = (ProfileFields) object;
        if ((this.fieldId == null && other.fieldId != null) || (this.fieldId != null && !this.fieldId.equals(other.fieldId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProfileFields[ fieldId=" + fieldId + " ]";
    }
    
}
