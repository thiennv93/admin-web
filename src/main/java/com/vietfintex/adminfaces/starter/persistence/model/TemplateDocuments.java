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
@Table(name = "template_documents")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TemplateDocuments.findAll", query = "SELECT t FROM TemplateDocuments t")
    , @NamedQuery(name = "TemplateDocuments.findByDocumentId", query = "SELECT t FROM TemplateDocuments t WHERE t.documentId = :documentId")
    , @NamedQuery(name = "TemplateDocuments.findByType", query = "SELECT t FROM TemplateDocuments t WHERE t.type = :type")
    , @NamedQuery(name = "TemplateDocuments.findByCode", query = "SELECT t FROM TemplateDocuments t WHERE t.code = :code")
    , @NamedQuery(name = "TemplateDocuments.findByAddon", query = "SELECT t FROM TemplateDocuments t WHERE t.addon = :addon")
    , @NamedQuery(name = "TemplateDocuments.findByUpdated", query = "SELECT t FROM TemplateDocuments t WHERE t.updated = :updated")
    , @NamedQuery(name = "TemplateDocuments.findByCreated", query = "SELECT t FROM TemplateDocuments t WHERE t.created = :created")})
public class TemplateDocuments implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "document_id")
    private Integer documentId;
    @Lob
    @Column(name = "template")
    private String template;
    @Lob
    @Column(name = "default_template")
    private String defaultTemplate;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @Column(name = "addon")
    private String addon;
    @Basic(optional = false)
    @Column(name = "updated")
    private int updated;
    @Basic(optional = false)
    @Column(name = "created")
    private int created;

    public TemplateDocuments() {
    }

    public TemplateDocuments(Integer documentId) {
        this.documentId = documentId;
    }

    public TemplateDocuments(Integer documentId, String type, String code, String addon, int updated, int created) {
        this.documentId = documentId;
        this.type = type;
        this.code = code;
        this.addon = addon;
        this.updated = updated;
        this.created = created;
    }

    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddon() {
        return addon;
    }

    public void setAddon(String addon) {
        this.addon = addon;
    }

    public int getUpdated() {
        return updated;
    }

    public void setUpdated(int updated) {
        this.updated = updated;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (documentId != null ? documentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TemplateDocuments)) {
            return false;
        }
        TemplateDocuments other = (TemplateDocuments) object;
        if ((this.documentId == null && other.documentId != null) || (this.documentId != null && !this.documentId.equals(other.documentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TemplateDocuments[ documentId=" + documentId + " ]";
    }
    
}
