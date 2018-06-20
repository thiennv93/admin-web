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
@Table(name = "settings_sections")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SettingsSections.findAll", query = "SELECT s FROM SettingsSections s")
    , @NamedQuery(name = "SettingsSections.findBySectionId", query = "SELECT s FROM SettingsSections s WHERE s.sectionId = :sectionId")
    , @NamedQuery(name = "SettingsSections.findByParentId", query = "SELECT s FROM SettingsSections s WHERE s.parentId = :parentId")
    , @NamedQuery(name = "SettingsSections.findByEditionType", query = "SELECT s FROM SettingsSections s WHERE s.editionType = :editionType")
    , @NamedQuery(name = "SettingsSections.findByName", query = "SELECT s FROM SettingsSections s WHERE s.name = :name")
    , @NamedQuery(name = "SettingsSections.findByPosition", query = "SELECT s FROM SettingsSections s WHERE s.position = :position")
    , @NamedQuery(name = "SettingsSections.findByType", query = "SELECT s FROM SettingsSections s WHERE s.type = :type")})
public class SettingsSections implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "section_id")
    private Integer sectionId;
    @Basic(optional = false)
    @Column(name = "parent_id")
    private int parentId;
    @Basic(optional = false)
    @Column(name = "edition_type")
    private String editionType;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;

    public SettingsSections() {
    }

    public SettingsSections(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public SettingsSections(Integer sectionId, int parentId, String editionType, String name, short position, String type) {
        this.sectionId = sectionId;
        this.parentId = parentId;
        this.editionType = editionType;
        this.name = name;
        this.position = position;
        this.type = type;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getEditionType() {
        return editionType;
    }

    public void setEditionType(String editionType) {
        this.editionType = editionType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sectionId != null ? sectionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SettingsSections)) {
            return false;
        }
        SettingsSections other = (SettingsSections) object;
        if ((this.sectionId == null && other.sectionId != null) || (this.sectionId != null && !this.sectionId.equals(other.sectionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SettingsSections[ sectionId=" + sectionId + " ]";
    }
    
}
