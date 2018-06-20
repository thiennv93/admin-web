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
@Table(name = "ebay_categories")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EbayCategories.findAll", query = "SELECT e FROM EbayCategories e")
    , @NamedQuery(name = "EbayCategories.findByCategoryId", query = "SELECT e FROM EbayCategories e WHERE e.ebayCategoriesPK.categoryId = :categoryId")
    , @NamedQuery(name = "EbayCategories.findBySiteId", query = "SELECT e FROM EbayCategories e WHERE e.ebayCategoriesPK.siteId = :siteId")
    , @NamedQuery(name = "EbayCategories.findByParentId", query = "SELECT e FROM EbayCategories e WHERE e.parentId = :parentId")
    , @NamedQuery(name = "EbayCategories.findByLevel", query = "SELECT e FROM EbayCategories e WHERE e.level = :level")
    , @NamedQuery(name = "EbayCategories.findByName", query = "SELECT e FROM EbayCategories e WHERE e.name = :name")
    , @NamedQuery(name = "EbayCategories.findByLeaf", query = "SELECT e FROM EbayCategories e WHERE e.leaf = :leaf")
    , @NamedQuery(name = "EbayCategories.findByIdPath", query = "SELECT e FROM EbayCategories e WHERE e.idPath = :idPath")
    , @NamedQuery(name = "EbayCategories.findByFeatureUpdateTime", query = "SELECT e FROM EbayCategories e WHERE e.featureUpdateTime = :featureUpdateTime")})
public class EbayCategories implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EbayCategoriesPK ebayCategoriesPK;
    @Basic(optional = false)
    @Column(name = "parent_id")
    private int parentId;
    @Basic(optional = false)
    @Column(name = "level")
    private short level;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "leaf")
    private Character leaf;
    @Basic(optional = false)
    @Column(name = "id_path")
    private String idPath;
    @Lob
    @Column(name = "full_name")
    private String fullName;
    @Lob
    @Column(name = "features")
    private String features;
    @Basic(optional = false)
    @Column(name = "feature_update_time")
    private int featureUpdateTime;

    public EbayCategories() {
    }

    public EbayCategories(EbayCategoriesPK ebayCategoriesPK) {
        this.ebayCategoriesPK = ebayCategoriesPK;
    }

    public EbayCategories(EbayCategoriesPK ebayCategoriesPK, int parentId, short level, String name, Character leaf, String idPath, int featureUpdateTime) {
        this.ebayCategoriesPK = ebayCategoriesPK;
        this.parentId = parentId;
        this.level = level;
        this.name = name;
        this.leaf = leaf;
        this.idPath = idPath;
        this.featureUpdateTime = featureUpdateTime;
    }

    public EbayCategories(int categoryId, int siteId) {
        this.ebayCategoriesPK = new EbayCategoriesPK(categoryId, siteId);
    }

    public EbayCategoriesPK getEbayCategoriesPK() {
        return ebayCategoriesPK;
    }

    public void setEbayCategoriesPK(EbayCategoriesPK ebayCategoriesPK) {
        this.ebayCategoriesPK = ebayCategoriesPK;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public short getLevel() {
        return level;
    }

    public void setLevel(short level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getLeaf() {
        return leaf;
    }

    public void setLeaf(Character leaf) {
        this.leaf = leaf;
    }

    public String getIdPath() {
        return idPath;
    }

    public void setIdPath(String idPath) {
        this.idPath = idPath;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public int getFeatureUpdateTime() {
        return featureUpdateTime;
    }

    public void setFeatureUpdateTime(int featureUpdateTime) {
        this.featureUpdateTime = featureUpdateTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ebayCategoriesPK != null ? ebayCategoriesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EbayCategories)) {
            return false;
        }
        EbayCategories other = (EbayCategories) object;
        if ((this.ebayCategoriesPK == null && other.ebayCategoriesPK != null) || (this.ebayCategoriesPK != null && !this.ebayCategoriesPK.equals(other.ebayCategoriesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EbayCategories[ ebayCategoriesPK=" + ebayCategoriesPK + " ]";
    }
    
}
