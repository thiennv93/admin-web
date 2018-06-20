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
@Table(name = "template_table_columns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TemplateTableColumns.findAll", query = "SELECT t FROM TemplateTableColumns t")
    , @NamedQuery(name = "TemplateTableColumns.findByColumnId", query = "SELECT t FROM TemplateTableColumns t WHERE t.columnId = :columnId")
    , @NamedQuery(name = "TemplateTableColumns.findByCode", query = "SELECT t FROM TemplateTableColumns t WHERE t.code = :code")
    , @NamedQuery(name = "TemplateTableColumns.findBySnippetCode", query = "SELECT t FROM TemplateTableColumns t WHERE t.snippetCode = :snippetCode")
    , @NamedQuery(name = "TemplateTableColumns.findBySnippetType", query = "SELECT t FROM TemplateTableColumns t WHERE t.snippetType = :snippetType")
    , @NamedQuery(name = "TemplateTableColumns.findByStatus", query = "SELECT t FROM TemplateTableColumns t WHERE t.status = :status")
    , @NamedQuery(name = "TemplateTableColumns.findByPosition", query = "SELECT t FROM TemplateTableColumns t WHERE t.position = :position")
    , @NamedQuery(name = "TemplateTableColumns.findByAddon", query = "SELECT t FROM TemplateTableColumns t WHERE t.addon = :addon")})
public class TemplateTableColumns implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "column_id")
    private Integer columnId;
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @Column(name = "snippet_code")
    private String snippetCode;
    @Basic(optional = false)
    @Column(name = "snippet_type")
    private String snippetType;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Lob
    @Column(name = "template")
    private String template;
    @Lob
    @Column(name = "default_template")
    private String defaultTemplate;
    @Basic(optional = false)
    @Column(name = "addon")
    private String addon;

    public TemplateTableColumns() {
    }

    public TemplateTableColumns(Integer columnId) {
        this.columnId = columnId;
    }

    public TemplateTableColumns(Integer columnId, String snippetCode, String snippetType, Character status, short position, String addon) {
        this.columnId = columnId;
        this.snippetCode = snippetCode;
        this.snippetType = snippetType;
        this.status = status;
        this.position = position;
        this.addon = addon;
    }

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSnippetCode() {
        return snippetCode;
    }

    public void setSnippetCode(String snippetCode) {
        this.snippetCode = snippetCode;
    }

    public String getSnippetType() {
        return snippetType;
    }

    public void setSnippetType(String snippetType) {
        this.snippetType = snippetType;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getDefaultTemplate() {
        return defaultTemplate;
    }

    public void setDefaultTemplate(String defaultTemplate) {
        this.defaultTemplate = defaultTemplate;
    }

    public String getAddon() {
        return addon;
    }

    public void setAddon(String addon) {
        this.addon = addon;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (columnId != null ? columnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TemplateTableColumns)) {
            return false;
        }
        TemplateTableColumns other = (TemplateTableColumns) object;
        if ((this.columnId == null && other.columnId != null) || (this.columnId != null && !this.columnId.equals(other.columnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TemplateTableColumns[ columnId=" + columnId + " ]";
    }
    
}
