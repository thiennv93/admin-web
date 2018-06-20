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
@Table(name = "pages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pages.findAll", query = "SELECT p FROM Pages p")
    , @NamedQuery(name = "Pages.findByPageId", query = "SELECT p FROM Pages p WHERE p.pageId = :pageId")
    , @NamedQuery(name = "Pages.findByCompanyId", query = "SELECT p FROM Pages p WHERE p.companyId = :companyId")
    , @NamedQuery(name = "Pages.findByParentId", query = "SELECT p FROM Pages p WHERE p.parentId = :parentId")
    , @NamedQuery(name = "Pages.findByIdPath", query = "SELECT p FROM Pages p WHERE p.idPath = :idPath")
    , @NamedQuery(name = "Pages.findByStatus", query = "SELECT p FROM Pages p WHERE p.status = :status")
    , @NamedQuery(name = "Pages.findByPageType", query = "SELECT p FROM Pages p WHERE p.pageType = :pageType")
    , @NamedQuery(name = "Pages.findByPosition", query = "SELECT p FROM Pages p WHERE p.position = :position")
    , @NamedQuery(name = "Pages.findByTimestamp", query = "SELECT p FROM Pages p WHERE p.timestamp = :timestamp")
    , @NamedQuery(name = "Pages.findByUsergroupIds", query = "SELECT p FROM Pages p WHERE p.usergroupIds = :usergroupIds")
    , @NamedQuery(name = "Pages.findByLocalization", query = "SELECT p FROM Pages p WHERE p.localization = :localization")
    , @NamedQuery(name = "Pages.findByNewWindow", query = "SELECT p FROM Pages p WHERE p.newWindow = :newWindow")
    , @NamedQuery(name = "Pages.findByUseAvailPeriod", query = "SELECT p FROM Pages p WHERE p.useAvailPeriod = :useAvailPeriod")
    , @NamedQuery(name = "Pages.findByAvailFromTimestamp", query = "SELECT p FROM Pages p WHERE p.availFromTimestamp = :availFromTimestamp")
    , @NamedQuery(name = "Pages.findByAvailTillTimestamp", query = "SELECT p FROM Pages p WHERE p.availTillTimestamp = :availTillTimestamp")
    , @NamedQuery(name = "Pages.findByFacebookObjType", query = "SELECT p FROM Pages p WHERE p.facebookObjType = :facebookObjType")})
public class Pages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "page_id")
    private Integer pageId;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Basic(optional = false)
    @Column(name = "parent_id")
    private int parentId;
    @Basic(optional = false)
    @Column(name = "id_path")
    private String idPath;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "page_type")
    private Character pageType;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    @Basic(optional = false)
    @Column(name = "usergroup_ids")
    private String usergroupIds;
    @Basic(optional = false)
    @Column(name = "localization")
    private String localization;
    @Basic(optional = false)
    @Column(name = "new_window")
    private short newWindow;
    @Basic(optional = false)
    @Column(name = "use_avail_period")
    private Character useAvailPeriod;
    @Basic(optional = false)
    @Column(name = "avail_from_timestamp")
    private int availFromTimestamp;
    @Basic(optional = false)
    @Column(name = "avail_till_timestamp")
    private int availTillTimestamp;
    @Basic(optional = false)
    @Column(name = "facebook_obj_type")
    private String facebookObjType;

    public Pages() {
    }

    public Pages(Integer pageId) {
        this.pageId = pageId;
    }

    public Pages(Integer pageId, int companyId, int parentId, String idPath, Character status, Character pageType, short position, int timestamp, String usergroupIds, String localization, short newWindow, Character useAvailPeriod, int availFromTimestamp, int availTillTimestamp, String facebookObjType) {
        this.pageId = pageId;
        this.companyId = companyId;
        this.parentId = parentId;
        this.idPath = idPath;
        this.status = status;
        this.pageType = pageType;
        this.position = position;
        this.timestamp = timestamp;
        this.usergroupIds = usergroupIds;
        this.localization = localization;
        this.newWindow = newWindow;
        this.useAvailPeriod = useAvailPeriod;
        this.availFromTimestamp = availFromTimestamp;
        this.availTillTimestamp = availTillTimestamp;
        this.facebookObjType = facebookObjType;
    }

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getIdPath() {
        return idPath;
    }

    public void setIdPath(String idPath) {
        this.idPath = idPath;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Character getPageType() {
        return pageType;
    }

    public void setPageType(Character pageType) {
        this.pageType = pageType;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getUsergroupIds() {
        return usergroupIds;
    }

    public void setUsergroupIds(String usergroupIds) {
        this.usergroupIds = usergroupIds;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public short getNewWindow() {
        return newWindow;
    }

    public void setNewWindow(short newWindow) {
        this.newWindow = newWindow;
    }

    public Character getUseAvailPeriod() {
        return useAvailPeriod;
    }

    public void setUseAvailPeriod(Character useAvailPeriod) {
        this.useAvailPeriod = useAvailPeriod;
    }

    public int getAvailFromTimestamp() {
        return availFromTimestamp;
    }

    public void setAvailFromTimestamp(int availFromTimestamp) {
        this.availFromTimestamp = availFromTimestamp;
    }

    public int getAvailTillTimestamp() {
        return availTillTimestamp;
    }

    public void setAvailTillTimestamp(int availTillTimestamp) {
        this.availTillTimestamp = availTillTimestamp;
    }

    public String getFacebookObjType() {
        return facebookObjType;
    }

    public void setFacebookObjType(String facebookObjType) {
        this.facebookObjType = facebookObjType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pageId != null ? pageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pages)) {
            return false;
        }
        Pages other = (Pages) object;
        if ((this.pageId == null && other.pageId != null) || (this.pageId != null && !this.pageId.equals(other.pageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pages[ pageId=" + pageId + " ]";
    }
    
}
