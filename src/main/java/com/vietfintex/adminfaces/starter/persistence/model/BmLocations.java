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
@Table(name = "bm_locations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BmLocations.findAll", query = "SELECT b FROM BmLocations b")
    , @NamedQuery(name = "BmLocations.findByLocationId", query = "SELECT b FROM BmLocations b WHERE b.locationId = :locationId")
    , @NamedQuery(name = "BmLocations.findByDispatch", query = "SELECT b FROM BmLocations b WHERE b.dispatch = :dispatch")
    , @NamedQuery(name = "BmLocations.findByIsDefault", query = "SELECT b FROM BmLocations b WHERE b.isDefault = :isDefault")
    , @NamedQuery(name = "BmLocations.findByLayoutId", query = "SELECT b FROM BmLocations b WHERE b.layoutId = :layoutId")
    , @NamedQuery(name = "BmLocations.findByPosition", query = "SELECT b FROM BmLocations b WHERE b.position = :position")})
public class BmLocations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "location_id")
    private Integer locationId;
    @Basic(optional = false)
    @Column(name = "dispatch")
    private String dispatch;
    @Basic(optional = false)
    @Column(name = "is_default")
    private boolean isDefault;
    @Basic(optional = false)
    @Column(name = "layout_id")
    private int layoutId;
    @Lob
    @Column(name = "object_ids")
    private String objectIds;
    @Lob
    @Column(name = "custom_html")
    private String customHtml;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;

    public BmLocations() {
    }

    public BmLocations(Integer locationId) {
        this.locationId = locationId;
    }

    public BmLocations(Integer locationId, String dispatch, boolean isDefault, int layoutId, short position) {
        this.locationId = locationId;
        this.dispatch = dispatch;
        this.isDefault = isDefault;
        this.layoutId = layoutId;
        this.position = position;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getDispatch() {
        return dispatch;
    }

    public void setDispatch(String dispatch) {
        this.dispatch = dispatch;
    }

    public boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public int getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(int layoutId) {
        this.layoutId = layoutId;
    }

    public String getObjectIds() {
        return objectIds;
    }

    public void setObjectIds(String objectIds) {
        this.objectIds = objectIds;
    }

    public String getCustomHtml() {
        return customHtml;
    }

    public void setCustomHtml(String customHtml) {
        this.customHtml = customHtml;
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
        hash += (locationId != null ? locationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BmLocations)) {
            return false;
        }
        BmLocations other = (BmLocations) object;
        if ((this.locationId == null && other.locationId != null) || (this.locationId != null && !this.locationId.equals(other.locationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BmLocations[ locationId=" + locationId + " ]";
    }
    
}
