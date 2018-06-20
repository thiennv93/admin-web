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
@Table(name = "template_table_column_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TemplateTableColumnDescriptions.findAll", query = "SELECT t FROM TemplateTableColumnDescriptions t")
    , @NamedQuery(name = "TemplateTableColumnDescriptions.findByColumnId", query = "SELECT t FROM TemplateTableColumnDescriptions t WHERE t.templateTableColumnDescriptionsPK.columnId = :columnId")
    , @NamedQuery(name = "TemplateTableColumnDescriptions.findByLangCode", query = "SELECT t FROM TemplateTableColumnDescriptions t WHERE t.templateTableColumnDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "TemplateTableColumnDescriptions.findByName", query = "SELECT t FROM TemplateTableColumnDescriptions t WHERE t.name = :name")})
public class TemplateTableColumnDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TemplateTableColumnDescriptionsPK templateTableColumnDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    public TemplateTableColumnDescriptions() {
    }

    public TemplateTableColumnDescriptions(TemplateTableColumnDescriptionsPK templateTableColumnDescriptionsPK) {
        this.templateTableColumnDescriptionsPK = templateTableColumnDescriptionsPK;
    }

    public TemplateTableColumnDescriptions(TemplateTableColumnDescriptionsPK templateTableColumnDescriptionsPK, String name) {
        this.templateTableColumnDescriptionsPK = templateTableColumnDescriptionsPK;
        this.name = name;
    }

    public TemplateTableColumnDescriptions(int columnId, String langCode) {
        this.templateTableColumnDescriptionsPK = new TemplateTableColumnDescriptionsPK(columnId, langCode);
    }

    public TemplateTableColumnDescriptionsPK getTemplateTableColumnDescriptionsPK() {
        return templateTableColumnDescriptionsPK;
    }

    public void setTemplateTableColumnDescriptionsPK(TemplateTableColumnDescriptionsPK templateTableColumnDescriptionsPK) {
        this.templateTableColumnDescriptionsPK = templateTableColumnDescriptionsPK;
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
        hash += (templateTableColumnDescriptionsPK != null ? templateTableColumnDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TemplateTableColumnDescriptions)) {
            return false;
        }
        TemplateTableColumnDescriptions other = (TemplateTableColumnDescriptions) object;
        if ((this.templateTableColumnDescriptionsPK == null && other.templateTableColumnDescriptionsPK != null) || (this.templateTableColumnDescriptionsPK != null && !this.templateTableColumnDescriptionsPK.equals(other.templateTableColumnDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TemplateTableColumnDescriptions[ templateTableColumnDescriptionsPK=" + templateTableColumnDescriptionsPK + " ]";
    }
    
}
