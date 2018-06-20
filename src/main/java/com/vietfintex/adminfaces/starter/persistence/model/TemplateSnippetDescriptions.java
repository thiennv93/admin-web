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
@Table(name = "template_snippet_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TemplateSnippetDescriptions.findAll", query = "SELECT t FROM TemplateSnippetDescriptions t")
    , @NamedQuery(name = "TemplateSnippetDescriptions.findBySnippetId", query = "SELECT t FROM TemplateSnippetDescriptions t WHERE t.templateSnippetDescriptionsPK.snippetId = :snippetId")
    , @NamedQuery(name = "TemplateSnippetDescriptions.findByLangCode", query = "SELECT t FROM TemplateSnippetDescriptions t WHERE t.templateSnippetDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "TemplateSnippetDescriptions.findByName", query = "SELECT t FROM TemplateSnippetDescriptions t WHERE t.name = :name")})
public class TemplateSnippetDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TemplateSnippetDescriptionsPK templateSnippetDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    public TemplateSnippetDescriptions() {
    }

    public TemplateSnippetDescriptions(TemplateSnippetDescriptionsPK templateSnippetDescriptionsPK) {
        this.templateSnippetDescriptionsPK = templateSnippetDescriptionsPK;
    }

    public TemplateSnippetDescriptions(TemplateSnippetDescriptionsPK templateSnippetDescriptionsPK, String name) {
        this.templateSnippetDescriptionsPK = templateSnippetDescriptionsPK;
        this.name = name;
    }

    public TemplateSnippetDescriptions(int snippetId, String langCode) {
        this.templateSnippetDescriptionsPK = new TemplateSnippetDescriptionsPK(snippetId, langCode);
    }

    public TemplateSnippetDescriptionsPK getTemplateSnippetDescriptionsPK() {
        return templateSnippetDescriptionsPK;
    }

    public void setTemplateSnippetDescriptionsPK(TemplateSnippetDescriptionsPK templateSnippetDescriptionsPK) {
        this.templateSnippetDescriptionsPK = templateSnippetDescriptionsPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (templateSnippetDescriptionsPK != null ? templateSnippetDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TemplateSnippetDescriptions)) {
            return false;
        }
        TemplateSnippetDescriptions other = (TemplateSnippetDescriptions) object;
        if ((this.templateSnippetDescriptionsPK == null && other.templateSnippetDescriptionsPK != null) || (this.templateSnippetDescriptionsPK != null && !this.templateSnippetDescriptionsPK.equals(other.templateSnippetDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TemplateSnippetDescriptions[ templateSnippetDescriptionsPK=" + templateSnippetDescriptionsPK + " ]";
    }
    
}
