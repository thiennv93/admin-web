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
@Table(name = "bm_layouts")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BmLayouts.findAll", query = "SELECT b FROM BmLayouts b")
    , @NamedQuery(name = "BmLayouts.findByLayoutId", query = "SELECT b FROM BmLayouts b WHERE b.layoutId = :layoutId")
    , @NamedQuery(name = "BmLayouts.findByName", query = "SELECT b FROM BmLayouts b WHERE b.name = :name")
    , @NamedQuery(name = "BmLayouts.findByIsDefault", query = "SELECT b FROM BmLayouts b WHERE b.isDefault = :isDefault")
    , @NamedQuery(name = "BmLayouts.findByWidth", query = "SELECT b FROM BmLayouts b WHERE b.width = :width")
    , @NamedQuery(name = "BmLayouts.findByLayoutWidth", query = "SELECT b FROM BmLayouts b WHERE b.layoutWidth = :layoutWidth")
    , @NamedQuery(name = "BmLayouts.findByMinWidth", query = "SELECT b FROM BmLayouts b WHERE b.minWidth = :minWidth")
    , @NamedQuery(name = "BmLayouts.findByMaxWidth", query = "SELECT b FROM BmLayouts b WHERE b.maxWidth = :maxWidth")
    , @NamedQuery(name = "BmLayouts.findByThemeName", query = "SELECT b FROM BmLayouts b WHERE b.themeName = :themeName")
    , @NamedQuery(name = "BmLayouts.findByStyleId", query = "SELECT b FROM BmLayouts b WHERE b.styleId = :styleId")})
public class BmLayouts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "layout_id")
    private Integer layoutId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "is_default")
    private short isDefault;
    @Basic(optional = false)
    @Column(name = "width")
    private short width;
    @Basic(optional = false)
    @Column(name = "layout_width")
    private String layoutWidth;
    @Basic(optional = false)
    @Column(name = "min_width")
    private int minWidth;
    @Basic(optional = false)
    @Column(name = "max_width")
    private int maxWidth;
    @Basic(optional = false)
    @Column(name = "theme_name")
    private String themeName;
    @Basic(optional = false)
    @Column(name = "style_id")
    private String styleId;

    public BmLayouts() {
    }

    public BmLayouts(Integer layoutId) {
        this.layoutId = layoutId;
    }

    public BmLayouts(Integer layoutId, String name, short isDefault, short width, String layoutWidth, int minWidth, int maxWidth, String themeName, String styleId) {
        this.layoutId = layoutId;
        this.name = name;
        this.isDefault = isDefault;
        this.width = width;
        this.layoutWidth = layoutWidth;
        this.minWidth = minWidth;
        this.maxWidth = maxWidth;
        this.themeName = themeName;
        this.styleId = styleId;
    }

    public Integer getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(Integer layoutId) {
        this.layoutId = layoutId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(short isDefault) {
        this.isDefault = isDefault;
    }

    public short getWidth() {
        return width;
    }

    public void setWidth(short width) {
        this.width = width;
    }

    public String getLayoutWidth() {
        return layoutWidth;
    }

    public void setLayoutWidth(String layoutWidth) {
        this.layoutWidth = layoutWidth;
    }

    public int getMinWidth() {
        return minWidth;
    }

    public void setMinWidth(int minWidth) {
        this.minWidth = minWidth;
    }

    public int getMaxWidth() {
        return maxWidth;
    }

    public void setMaxWidth(int maxWidth) {
        this.maxWidth = maxWidth;
    }

    public String getThemeName() {
        return themeName;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }

    public String getStyleId() {
        return styleId;
    }

    public void setStyleId(String styleId) {
        this.styleId = styleId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (layoutId != null ? layoutId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BmLayouts)) {
            return false;
        }
        BmLayouts other = (BmLayouts) object;
        if ((this.layoutId == null && other.layoutId != null) || (this.layoutId != null && !this.layoutId.equals(other.layoutId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BmLayouts[ layoutId=" + layoutId + " ]";
    }
    
}
