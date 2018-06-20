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
@Table(name = "categories")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categories.findAll", query = "SELECT c FROM Categories c")
    , @NamedQuery(name = "Categories.findByCategoryId", query = "SELECT c FROM Categories c WHERE c.categoryId = :categoryId")
    , @NamedQuery(name = "Categories.findByParentId", query = "SELECT c FROM Categories c WHERE c.parentId = :parentId")
    , @NamedQuery(name = "Categories.findByIdPath", query = "SELECT c FROM Categories c WHERE c.idPath = :idPath")
    , @NamedQuery(name = "Categories.findByLevel", query = "SELECT c FROM Categories c WHERE c.level = :level")
    , @NamedQuery(name = "Categories.findByCompanyId", query = "SELECT c FROM Categories c WHERE c.companyId = :companyId")
    , @NamedQuery(name = "Categories.findByUsergroupIds", query = "SELECT c FROM Categories c WHERE c.usergroupIds = :usergroupIds")
    , @NamedQuery(name = "Categories.findByStatus", query = "SELECT c FROM Categories c WHERE c.status = :status")
    , @NamedQuery(name = "Categories.findByProductCount", query = "SELECT c FROM Categories c WHERE c.productCount = :productCount")
    , @NamedQuery(name = "Categories.findByPosition", query = "SELECT c FROM Categories c WHERE c.position = :position")
    , @NamedQuery(name = "Categories.findByTimestamp", query = "SELECT c FROM Categories c WHERE c.timestamp = :timestamp")
    , @NamedQuery(name = "Categories.findByIsOp", query = "SELECT c FROM Categories c WHERE c.isOp = :isOp")
    , @NamedQuery(name = "Categories.findByLocalization", query = "SELECT c FROM Categories c WHERE c.localization = :localization")
    , @NamedQuery(name = "Categories.findByAgeVerification", query = "SELECT c FROM Categories c WHERE c.ageVerification = :ageVerification")
    , @NamedQuery(name = "Categories.findByAgeLimit", query = "SELECT c FROM Categories c WHERE c.ageLimit = :ageLimit")
    , @NamedQuery(name = "Categories.findByParentAgeVerification", query = "SELECT c FROM Categories c WHERE c.parentAgeVerification = :parentAgeVerification")
    , @NamedQuery(name = "Categories.findByParentAgeLimit", query = "SELECT c FROM Categories c WHERE c.parentAgeLimit = :parentAgeLimit")
    , @NamedQuery(name = "Categories.findByDefaultView", query = "SELECT c FROM Categories c WHERE c.defaultView = :defaultView")
    , @NamedQuery(name = "Categories.findByProductDetailsView", query = "SELECT c FROM Categories c WHERE c.productDetailsView = :productDetailsView")
    , @NamedQuery(name = "Categories.findByProductColumns", query = "SELECT c FROM Categories c WHERE c.productColumns = :productColumns")
    , @NamedQuery(name = "Categories.findByIsTrash", query = "SELECT c FROM Categories c WHERE c.isTrash = :isTrash")
    , @NamedQuery(name = "Categories.findByEbayCategory", query = "SELECT c FROM Categories c WHERE c.ebayCategory = :ebayCategory")})
public class Categories implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "category_id")
    private Integer categoryId;
    @Basic(optional = false)
    @Column(name = "parent_id")
    private int parentId;
    @Basic(optional = false)
    @Column(name = "id_path")
    private String idPath;
    @Basic(optional = false)
    @Column(name = "level")
    private int level;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Basic(optional = false)
    @Column(name = "usergroup_ids")
    private String usergroupIds;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "product_count")
    private int productCount;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    @Basic(optional = false)
    @Column(name = "is_op")
    private Character isOp;
    @Basic(optional = false)
    @Column(name = "localization")
    private String localization;
    @Basic(optional = false)
    @Column(name = "age_verification")
    private Character ageVerification;
    @Basic(optional = false)
    @Column(name = "age_limit")
    private short ageLimit;
    @Basic(optional = false)
    @Column(name = "parent_age_verification")
    private Character parentAgeVerification;
    @Basic(optional = false)
    @Column(name = "parent_age_limit")
    private short parentAgeLimit;
    @Lob
    @Column(name = "selected_views")
    private String selectedViews;
    @Basic(optional = false)
    @Column(name = "default_view")
    private String defaultView;
    @Basic(optional = false)
    @Column(name = "product_details_view")
    private String productDetailsView;
    @Basic(optional = false)
    @Column(name = "product_columns")
    private short productColumns;
    @Basic(optional = false)
    @Column(name = "is_trash")
    private Character isTrash;
    @Column(name = "ebay_category")
    private String ebayCategory;

    public Categories() {
    }

    public Categories(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Categories(Integer categoryId, int parentId, String idPath, int level, int companyId, String usergroupIds, Character status, int productCount, short position, int timestamp, Character isOp, String localization, Character ageVerification, short ageLimit, Character parentAgeVerification, short parentAgeLimit, String defaultView, String productDetailsView, short productColumns, Character isTrash) {
        this.categoryId = categoryId;
        this.parentId = parentId;
        this.idPath = idPath;
        this.level = level;
        this.companyId = companyId;
        this.usergroupIds = usergroupIds;
        this.status = status;
        this.productCount = productCount;
        this.position = position;
        this.timestamp = timestamp;
        this.isOp = isOp;
        this.localization = localization;
        this.ageVerification = ageVerification;
        this.ageLimit = ageLimit;
        this.parentAgeVerification = parentAgeVerification;
        this.parentAgeLimit = parentAgeLimit;
        this.defaultView = defaultView;
        this.productDetailsView = productDetailsView;
        this.productColumns = productColumns;
        this.isTrash = isTrash;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getUsergroupIds() {
        return usergroupIds;
    }

    public void setUsergroupIds(String usergroupIds) {
        this.usergroupIds = usergroupIds;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
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

    public Character getIsOp() {
        return isOp;
    }

    public void setIsOp(Character isOp) {
        this.isOp = isOp;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public Character getAgeVerification() {
        return ageVerification;
    }

    public void setAgeVerification(Character ageVerification) {
        this.ageVerification = ageVerification;
    }

    public short getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(short ageLimit) {
        this.ageLimit = ageLimit;
    }

    public Character getParentAgeVerification() {
        return parentAgeVerification;
    }

    public void setParentAgeVerification(Character parentAgeVerification) {
        this.parentAgeVerification = parentAgeVerification;
    }

    public short getParentAgeLimit() {
        return parentAgeLimit;
    }

    public void setParentAgeLimit(short parentAgeLimit) {
        this.parentAgeLimit = parentAgeLimit;
    }

    public String getSelectedViews() {
        return selectedViews;
    }

    public void setSelectedViews(String selectedViews) {
        this.selectedViews = selectedViews;
    }

    public String getDefaultView() {
        return defaultView;
    }

    public void setDefaultView(String defaultView) {
        this.defaultView = defaultView;
    }

    public String getProductDetailsView() {
        return productDetailsView;
    }

    public void setProductDetailsView(String productDetailsView) {
        this.productDetailsView = productDetailsView;
    }

    public short getProductColumns() {
        return productColumns;
    }

    public void setProductColumns(short productColumns) {
        this.productColumns = productColumns;
    }

    public Character getIsTrash() {
        return isTrash;
    }

    public void setIsTrash(Character isTrash) {
        this.isTrash = isTrash;
    }

    public String getEbayCategory() {
        return ebayCategory;
    }

    public void setEbayCategory(String ebayCategory) {
        this.ebayCategory = ebayCategory;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoryId != null ? categoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categories)) {
            return false;
        }
        Categories other = (Categories) object;
        if ((this.categoryId == null && other.categoryId != null) || (this.categoryId != null && !this.categoryId.equals(other.categoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Categories[ categoryId=" + categoryId + " ]";
    }
    
}
