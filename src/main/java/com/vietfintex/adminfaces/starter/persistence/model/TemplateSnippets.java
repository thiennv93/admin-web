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
@Table(name = "template_snippets")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TemplateSnippets.findAll", query = "SELECT t FROM TemplateSnippets t")
    , @NamedQuery(name = "TemplateSnippets.findBySnippetId", query = "SELECT t FROM TemplateSnippets t WHERE t.snippetId = :snippetId")
    , @NamedQuery(name = "TemplateSnippets.findByCode", query = "SELECT t FROM TemplateSnippets t WHERE t.code = :code")
    , @NamedQuery(name = "TemplateSnippets.findByType", query = "SELECT t FROM TemplateSnippets t WHERE t.type = :type")
    , @NamedQuery(name = "TemplateSnippets.findByStatus", query = "SELECT t FROM TemplateSnippets t WHERE t.status = :status")
    , @NamedQuery(name = "TemplateSnippets.findByAddon", query = "SELECT t FROM TemplateSnippets t WHERE t.addon = :addon")
    , @NamedQuery(name = "TemplateSnippets.findByUpdated", query = "SELECT t FROM TemplateSnippets t WHERE t.updated = :updated")
    , @NamedQuery(name = "TemplateSnippets.findByCreated", query = "SELECT t FROM TemplateSnippets t WHERE t.created = :created")})
public class TemplateSnippets implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "snippet_id")
    private Integer snippetId;
    @Basic(optional = false)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Lob
    @Column(name = "template")
    private String template;
    @Lob
    @Column(name = "default_template")
    private String defaultTemplate;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Lob
    @Column(name = "params")
    private String params;
    @Lob
    @Column(name = "handler")
    private String handler;
    @Basic(optional = false)
    @Column(name = "addon")
    private String addon;
    @Basic(optional = false)
    @Column(name = "updated")
    private int updated;
    @Basic(optional = false)
    @Column(name = "created")
    private int created;

    public TemplateSnippets() {
    }

    public TemplateSnippets(Integer snippetId) {
        this.snippetId = snippetId;
    }

    public TemplateSnippets(Integer snippetId, String code, String type, Character status, String addon, int updated, int created) {
        this.snippetId = snippetId;
        this.code = code;
        this.type = type;
        this.status = status;
        this.addon = addon;
        this.updated = updated;
        this.created = created;
    }

    public Integer getSnippetId() {
        return snippetId;
    }

    public void setSnippetId(Integer snippetId) {
        this.snippetId = snippetId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
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
        hash += (snippetId != null ? snippetId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TemplateSnippets)) {
            return false;
        }
        TemplateSnippets other = (TemplateSnippets) object;
        if ((this.snippetId == null && other.snippetId != null) || (this.snippetId != null && !this.snippetId.equals(other.snippetId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TemplateSnippets[ snippetId=" + snippetId + " ]";
    }
    
}
