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
@Table(name = "template_emails")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TemplateEmails.findAll", query = "SELECT t FROM TemplateEmails t")
    , @NamedQuery(name = "TemplateEmails.findByTemplateId", query = "SELECT t FROM TemplateEmails t WHERE t.templateId = :templateId")
    , @NamedQuery(name = "TemplateEmails.findByCode", query = "SELECT t FROM TemplateEmails t WHERE t.code = :code")
    , @NamedQuery(name = "TemplateEmails.findByArea", query = "SELECT t FROM TemplateEmails t WHERE t.area = :area")
    , @NamedQuery(name = "TemplateEmails.findByStatus", query = "SELECT t FROM TemplateEmails t WHERE t.status = :status")
    , @NamedQuery(name = "TemplateEmails.findByAddon", query = "SELECT t FROM TemplateEmails t WHERE t.addon = :addon")
    , @NamedQuery(name = "TemplateEmails.findByUpdated", query = "SELECT t FROM TemplateEmails t WHERE t.updated = :updated")
    , @NamedQuery(name = "TemplateEmails.findByCreated", query = "SELECT t FROM TemplateEmails t WHERE t.created = :created")})
public class TemplateEmails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "template_id")
    private Integer templateId;
    @Basic(optional = false)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @Column(name = "area")
    private Character area;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Lob
    @Column(name = "subject")
    private String subject;
    @Lob
    @Column(name = "template")
    private String template;
    @Lob
    @Column(name = "default_subject")
    private String defaultSubject;
    @Lob
    @Column(name = "default_template")
    private String defaultTemplate;
    @Lob
    @Column(name = "params_schema")
    private String paramsSchema;
    @Lob
    @Column(name = "params")
    private String params;
    @Basic(optional = false)
    @Column(name = "addon")
    private String addon;
    @Basic(optional = false)
    @Column(name = "updated")
    private int updated;
    @Basic(optional = false)
    @Column(name = "created")
    private int created;

    public TemplateEmails() {
    }

    public TemplateEmails(Integer templateId) {
        this.templateId = templateId;
    }

    public TemplateEmails(Integer templateId, String code, Character area, Character status, String addon, int updated, int created) {
        this.templateId = templateId;
        this.code = code;
        this.area = area;
        this.status = status;
        this.addon = addon;
        this.updated = updated;
        this.created = created;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Character getArea() {
        return area;
    }

    public void setArea(Character area) {
        this.area = area;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getDefaultSubject() {
        return defaultSubject;
    }

    public void setDefaultSubject(String defaultSubject) {
        this.defaultSubject = defaultSubject;
    }

    public String getDefaultTemplate() {
        return defaultTemplate;
    }

    public void setDefaultTemplate(String defaultTemplate) {
        this.defaultTemplate = defaultTemplate;
    }

    public String getParamsSchema() {
        return paramsSchema;
    }

    public void setParamsSchema(String paramsSchema) {
        this.paramsSchema = paramsSchema;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
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
        hash += (templateId != null ? templateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TemplateEmails)) {
            return false;
        }
        TemplateEmails other = (TemplateEmails) object;
        if ((this.templateId == null && other.templateId != null) || (this.templateId != null && !this.templateId.equals(other.templateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TemplateEmails[ templateId=" + templateId + " ]";
    }
    
}
