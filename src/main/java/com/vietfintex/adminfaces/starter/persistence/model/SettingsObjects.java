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
@Table(name = "settings_objects")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SettingsObjects.findAll", query = "SELECT s FROM SettingsObjects s")
    , @NamedQuery(name = "SettingsObjects.findByObjectId", query = "SELECT s FROM SettingsObjects s WHERE s.objectId = :objectId")
    , @NamedQuery(name = "SettingsObjects.findByEditionType", query = "SELECT s FROM SettingsObjects s WHERE s.editionType = :editionType")
    , @NamedQuery(name = "SettingsObjects.findByName", query = "SELECT s FROM SettingsObjects s WHERE s.name = :name")
    , @NamedQuery(name = "SettingsObjects.findBySectionId", query = "SELECT s FROM SettingsObjects s WHERE s.sectionId = :sectionId")
    , @NamedQuery(name = "SettingsObjects.findBySectionTabId", query = "SELECT s FROM SettingsObjects s WHERE s.sectionTabId = :sectionTabId")
    , @NamedQuery(name = "SettingsObjects.findByType", query = "SELECT s FROM SettingsObjects s WHERE s.type = :type")
    , @NamedQuery(name = "SettingsObjects.findByPosition", query = "SELECT s FROM SettingsObjects s WHERE s.position = :position")
    , @NamedQuery(name = "SettingsObjects.findByIsGlobal", query = "SELECT s FROM SettingsObjects s WHERE s.isGlobal = :isGlobal")
    , @NamedQuery(name = "SettingsObjects.findByHandler", query = "SELECT s FROM SettingsObjects s WHERE s.handler = :handler")
    , @NamedQuery(name = "SettingsObjects.findByParentId", query = "SELECT s FROM SettingsObjects s WHERE s.parentId = :parentId")})
public class SettingsObjects implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "object_id")
    private Integer objectId;
    @Basic(optional = false)
    @Column(name = "edition_type")
    private String editionType;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "section_id")
    private int sectionId;
    @Basic(optional = false)
    @Column(name = "section_tab_id")
    private int sectionTabId;
    @Basic(optional = false)
    @Column(name = "type")
    private Character type;
    @Basic(optional = false)
    @Lob
    @Column(name = "value")
    private String value;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "is_global")
    private Character isGlobal;
    @Basic(optional = false)
    @Column(name = "handler")
    private String handler;
    @Basic(optional = false)
    @Column(name = "parent_id")
    private int parentId;

    public SettingsObjects() {
    }

    public SettingsObjects(Integer objectId) {
        this.objectId = objectId;
    }

    public SettingsObjects(Integer objectId, String editionType, String name, int sectionId, int sectionTabId, Character type, String value, short position, Character isGlobal, String handler, int parentId) {
        this.objectId = objectId;
        this.editionType = editionType;
        this.name = name;
        this.sectionId = sectionId;
        this.sectionTabId = sectionTabId;
        this.type = type;
        this.value = value;
        this.position = position;
        this.isGlobal = isGlobal;
        this.handler = handler;
        this.parentId = parentId;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
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

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    public int getSectionTabId() {
        return sectionTabId;
    }

    public void setSectionTabId(int sectionTabId) {
        this.sectionTabId = sectionTabId;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public Character getIsGlobal() {
        return isGlobal;
    }

    public void setIsGlobal(Character isGlobal) {
        this.isGlobal = isGlobal;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (objectId != null ? objectId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SettingsObjects)) {
            return false;
        }
        SettingsObjects other = (SettingsObjects) object;
        if ((this.objectId == null && other.objectId != null) || (this.objectId != null && !this.objectId.equals(other.objectId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SettingsObjects[ objectId=" + objectId + " ]";
    }
    
}
