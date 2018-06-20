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
@Table(name = "user_profiles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserProfiles.findAll", query = "SELECT u FROM UserProfiles u")
    , @NamedQuery(name = "UserProfiles.findByProfileId", query = "SELECT u FROM UserProfiles u WHERE u.profileId = :profileId")
    , @NamedQuery(name = "UserProfiles.findByUserId", query = "SELECT u FROM UserProfiles u WHERE u.userId = :userId")
    , @NamedQuery(name = "UserProfiles.findByProfileType", query = "SELECT u FROM UserProfiles u WHERE u.profileType = :profileType")
    , @NamedQuery(name = "UserProfiles.findByBFirstname", query = "SELECT u FROM UserProfiles u WHERE u.bFirstname = :bFirstname")
    , @NamedQuery(name = "UserProfiles.findByBLastname", query = "SELECT u FROM UserProfiles u WHERE u.bLastname = :bLastname")
    , @NamedQuery(name = "UserProfiles.findByBAddress", query = "SELECT u FROM UserProfiles u WHERE u.bAddress = :bAddress")
    , @NamedQuery(name = "UserProfiles.findByBAddress2", query = "SELECT u FROM UserProfiles u WHERE u.bAddress2 = :bAddress2")
    , @NamedQuery(name = "UserProfiles.findByBCity", query = "SELECT u FROM UserProfiles u WHERE u.bCity = :bCity")
    , @NamedQuery(name = "UserProfiles.findByBCounty", query = "SELECT u FROM UserProfiles u WHERE u.bCounty = :bCounty")
    , @NamedQuery(name = "UserProfiles.findByBState", query = "SELECT u FROM UserProfiles u WHERE u.bState = :bState")
    , @NamedQuery(name = "UserProfiles.findByBCountry", query = "SELECT u FROM UserProfiles u WHERE u.bCountry = :bCountry")
    , @NamedQuery(name = "UserProfiles.findByBZipcode", query = "SELECT u FROM UserProfiles u WHERE u.bZipcode = :bZipcode")
    , @NamedQuery(name = "UserProfiles.findByBPhone", query = "SELECT u FROM UserProfiles u WHERE u.bPhone = :bPhone")
    , @NamedQuery(name = "UserProfiles.findBySFirstname", query = "SELECT u FROM UserProfiles u WHERE u.sFirstname = :sFirstname")
    , @NamedQuery(name = "UserProfiles.findBySLastname", query = "SELECT u FROM UserProfiles u WHERE u.sLastname = :sLastname")
    , @NamedQuery(name = "UserProfiles.findBySAddress", query = "SELECT u FROM UserProfiles u WHERE u.sAddress = :sAddress")
    , @NamedQuery(name = "UserProfiles.findBySAddress2", query = "SELECT u FROM UserProfiles u WHERE u.sAddress2 = :sAddress2")
    , @NamedQuery(name = "UserProfiles.findBySCity", query = "SELECT u FROM UserProfiles u WHERE u.sCity = :sCity")
    , @NamedQuery(name = "UserProfiles.findBySCounty", query = "SELECT u FROM UserProfiles u WHERE u.sCounty = :sCounty")
    , @NamedQuery(name = "UserProfiles.findBySState", query = "SELECT u FROM UserProfiles u WHERE u.sState = :sState")
    , @NamedQuery(name = "UserProfiles.findBySCountry", query = "SELECT u FROM UserProfiles u WHERE u.sCountry = :sCountry")
    , @NamedQuery(name = "UserProfiles.findBySZipcode", query = "SELECT u FROM UserProfiles u WHERE u.sZipcode = :sZipcode")
    , @NamedQuery(name = "UserProfiles.findBySPhone", query = "SELECT u FROM UserProfiles u WHERE u.sPhone = :sPhone")
    , @NamedQuery(name = "UserProfiles.findBySAddressType", query = "SELECT u FROM UserProfiles u WHERE u.sAddressType = :sAddressType")
    , @NamedQuery(name = "UserProfiles.findByProfileName", query = "SELECT u FROM UserProfiles u WHERE u.profileName = :profileName")})
public class UserProfiles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "profile_id")
    private Integer profileId;
    @Basic(optional = false)
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @Column(name = "profile_type")
    private Character profileType;
    @Basic(optional = false)
    @Column(name = "b_firstname")
    private String bFirstname;
    @Basic(optional = false)
    @Column(name = "b_lastname")
    private String bLastname;
    @Basic(optional = false)
    @Column(name = "b_address")
    private String bAddress;
    @Basic(optional = false)
    @Column(name = "b_address_2")
    private String bAddress2;
    @Basic(optional = false)
    @Column(name = "b_city")
    private String bCity;
    @Basic(optional = false)
    @Column(name = "b_county")
    private String bCounty;
    @Basic(optional = false)
    @Column(name = "b_state")
    private String bState;
    @Basic(optional = false)
    @Column(name = "b_country")
    private String bCountry;
    @Basic(optional = false)
    @Column(name = "b_zipcode")
    private String bZipcode;
    @Basic(optional = false)
    @Column(name = "b_phone")
    private String bPhone;
    @Basic(optional = false)
    @Column(name = "s_firstname")
    private String sFirstname;
    @Basic(optional = false)
    @Column(name = "s_lastname")
    private String sLastname;
    @Basic(optional = false)
    @Column(name = "s_address")
    private String sAddress;
    @Basic(optional = false)
    @Column(name = "s_address_2")
    private String sAddress2;
    @Basic(optional = false)
    @Column(name = "s_city")
    private String sCity;
    @Basic(optional = false)
    @Column(name = "s_county")
    private String sCounty;
    @Basic(optional = false)
    @Column(name = "s_state")
    private String sState;
    @Basic(optional = false)
    @Column(name = "s_country")
    private String sCountry;
    @Basic(optional = false)
    @Column(name = "s_zipcode")
    private String sZipcode;
    @Basic(optional = false)
    @Column(name = "s_phone")
    private String sPhone;
    @Basic(optional = false)
    @Column(name = "s_address_type")
    private String sAddressType;
    @Basic(optional = false)
    @Column(name = "profile_name")
    private String profileName;

    public UserProfiles() {
    }

    public UserProfiles(Integer profileId) {
        this.profileId = profileId;
    }

    public UserProfiles(Integer profileId, int userId, Character profileType, String bFirstname, String bLastname, String bAddress, String bAddress2, String bCity, String bCounty, String bState, String bCountry, String bZipcode, String bPhone, String sFirstname, String sLastname, String sAddress, String sAddress2, String sCity, String sCounty, String sState, String sCountry, String sZipcode, String sPhone, String sAddressType, String profileName) {
        this.profileId = profileId;
        this.userId = userId;
        this.profileType = profileType;
        this.bFirstname = bFirstname;
        this.bLastname = bLastname;
        this.bAddress = bAddress;
        this.bAddress2 = bAddress2;
        this.bCity = bCity;
        this.bCounty = bCounty;
        this.bState = bState;
        this.bCountry = bCountry;
        this.bZipcode = bZipcode;
        this.bPhone = bPhone;
        this.sFirstname = sFirstname;
        this.sLastname = sLastname;
        this.sAddress = sAddress;
        this.sAddress2 = sAddress2;
        this.sCity = sCity;
        this.sCounty = sCounty;
        this.sState = sState;
        this.sCountry = sCountry;
        this.sZipcode = sZipcode;
        this.sPhone = sPhone;
        this.sAddressType = sAddressType;
        this.profileName = profileName;
    }

    public Integer getProfileId() {
        return profileId;
    }

    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Character getProfileType() {
        return profileType;
    }

    public void setProfileType(Character profileType) {
        this.profileType = profileType;
    }

    public String getBFirstname() {
        return bFirstname;
    }

    public void setBFirstname(String bFirstname) {
        this.bFirstname = bFirstname;
    }

    public String getBLastname() {
        return bLastname;
    }

    public void setBLastname(String bLastname) {
        this.bLastname = bLastname;
    }

    public String getBAddress() {
        return bAddress;
    }

    public void setBAddress(String bAddress) {
        this.bAddress = bAddress;
    }

    public String getBAddress2() {
        return bAddress2;
    }

    public void setBAddress2(String bAddress2) {
        this.bAddress2 = bAddress2;
    }

    public String getBCity() {
        return bCity;
    }

    public void setBCity(String bCity) {
        this.bCity = bCity;
    }

    public String getBCounty() {
        return bCounty;
    }

    public void setBCounty(String bCounty) {
        this.bCounty = bCounty;
    }

    public String getBState() {
        return bState;
    }

    public void setBState(String bState) {
        this.bState = bState;
    }

    public String getBCountry() {
        return bCountry;
    }

    public void setBCountry(String bCountry) {
        this.bCountry = bCountry;
    }

    public String getBZipcode() {
        return bZipcode;
    }

    public void setBZipcode(String bZipcode) {
        this.bZipcode = bZipcode;
    }

    public String getBPhone() {
        return bPhone;
    }

    public void setBPhone(String bPhone) {
        this.bPhone = bPhone;
    }

    public String getSFirstname() {
        return sFirstname;
    }

    public void setSFirstname(String sFirstname) {
        this.sFirstname = sFirstname;
    }

    public String getSLastname() {
        return sLastname;
    }

    public void setSLastname(String sLastname) {
        this.sLastname = sLastname;
    }

    public String getSAddress() {
        return sAddress;
    }

    public void setSAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getSAddress2() {
        return sAddress2;
    }

    public void setSAddress2(String sAddress2) {
        this.sAddress2 = sAddress2;
    }

    public String getSCity() {
        return sCity;
    }

    public void setSCity(String sCity) {
        this.sCity = sCity;
    }

    public String getSCounty() {
        return sCounty;
    }

    public void setSCounty(String sCounty) {
        this.sCounty = sCounty;
    }

    public String getSState() {
        return sState;
    }

    public void setSState(String sState) {
        this.sState = sState;
    }

    public String getSCountry() {
        return sCountry;
    }

    public void setSCountry(String sCountry) {
        this.sCountry = sCountry;
    }

    public String getSZipcode() {
        return sZipcode;
    }

    public void setSZipcode(String sZipcode) {
        this.sZipcode = sZipcode;
    }

    public String getSPhone() {
        return sPhone;
    }

    public void setSPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public String getSAddressType() {
        return sAddressType;
    }

    public void setSAddressType(String sAddressType) {
        this.sAddressType = sAddressType;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (profileId != null ? profileId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserProfiles)) {
            return false;
        }
        UserProfiles other = (UserProfiles) object;
        if ((this.profileId == null && other.profileId != null) || (this.profileId != null && !this.profileId.equals(other.profileId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UserProfiles[ profileId=" + profileId + " ]";
    }
    
}
