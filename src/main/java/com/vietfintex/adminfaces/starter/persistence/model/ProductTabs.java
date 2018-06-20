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
@Table(name = "product_tabs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductTabs.findAll", query = "SELECT p FROM ProductTabs p")
    , @NamedQuery(name = "ProductTabs.findByTabId", query = "SELECT p FROM ProductTabs p WHERE p.tabId = :tabId")
    , @NamedQuery(name = "ProductTabs.findByTabType", query = "SELECT p FROM ProductTabs p WHERE p.tabType = :tabType")
    , @NamedQuery(name = "ProductTabs.findByBlockId", query = "SELECT p FROM ProductTabs p WHERE p.blockId = :blockId")
    , @NamedQuery(name = "ProductTabs.findByTemplate", query = "SELECT p FROM ProductTabs p WHERE p.template = :template")
    , @NamedQuery(name = "ProductTabs.findByAddon", query = "SELECT p FROM ProductTabs p WHERE p.addon = :addon")
    , @NamedQuery(name = "ProductTabs.findByPosition", query = "SELECT p FROM ProductTabs p WHERE p.position = :position")
    , @NamedQuery(name = "ProductTabs.findByStatus", query = "SELECT p FROM ProductTabs p WHERE p.status = :status")
    , @NamedQuery(name = "ProductTabs.findByIsPrimary", query = "SELECT p FROM ProductTabs p WHERE p.isPrimary = :isPrimary")
    , @NamedQuery(name = "ProductTabs.findByCompanyId", query = "SELECT p FROM ProductTabs p WHERE p.companyId = :companyId")
    , @NamedQuery(name = "ProductTabs.findByShowInPopup", query = "SELECT p FROM ProductTabs p WHERE p.showInPopup = :showInPopup")})
public class ProductTabs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tab_id")
    private Integer tabId;
    @Basic(optional = false)
    @Column(name = "tab_type")
    private Character tabType;
    @Basic(optional = false)
    @Column(name = "block_id")
    private int blockId;
    @Basic(optional = false)
    @Column(name = "template")
    private String template;
    @Basic(optional = false)
    @Column(name = "addon")
    private String addon;
    @Basic(optional = false)
    @Column(name = "position")
    private int position;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "is_primary")
    private Character isPrimary;
    @Lob
    @Column(name = "product_ids")
    private String productIds;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Basic(optional = false)
    @Column(name = "show_in_popup")
    private Character showInPopup;

    public ProductTabs() {
    }

    public ProductTabs(Integer tabId) {
        this.tabId = tabId;
    }

    public ProductTabs(Integer tabId, Character tabType, int blockId, String template, String addon, int position, Character status, Character isPrimary, int companyId, Character showInPopup) {
        this.tabId = tabId;
        this.tabType = tabType;
        this.blockId = blockId;
        this.template = template;
        this.addon = addon;
        this.position = position;
        this.status = status;
        this.isPrimary = isPrimary;
        this.companyId = companyId;
        this.showInPopup = showInPopup;
    }

    public Integer getTabId() {
        return tabId;
    }

    public void setTabId(Integer tabId) {
        this.tabId = tabId;
    }

    public Character getTabType() {
        return tabType;
    }

    public void setTabType(Character tabType) {
        this.tabType = tabType;
    }

    public int getBlockId() {
        return blockId;
    }

    public void setBlockId(int blockId) {
        this.blockId = blockId;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getAddon() {
        return addon;
    }

    public void setAddon(String addon) {
        this.addon = addon;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Character getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(Character isPrimary) {
        this.isPrimary = isPrimary;
    }

    public String getProductIds() {
        return productIds;
    }

    public void setProductIds(String productIds) {
        this.productIds = productIds;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public Character getShowInPopup() {
        return showInPopup;
    }

    public void setShowInPopup(Character showInPopup) {
        this.showInPopup = showInPopup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tabId != null ? tabId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductTabs)) {
            return false;
        }
        ProductTabs other = (ProductTabs) object;
        if ((this.tabId == null && other.tabId != null) || (this.tabId != null && !this.tabId.equals(other.tabId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductTabs[ tabId=" + tabId + " ]";
    }
    
}
