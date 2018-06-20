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
@Table(name = "form_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FormDescriptions.findAll", query = "SELECT f FROM FormDescriptions f")
    , @NamedQuery(name = "FormDescriptions.findByObjectId", query = "SELECT f FROM FormDescriptions f WHERE f.formDescriptionsPK.objectId = :objectId")
    , @NamedQuery(name = "FormDescriptions.findByLangCode", query = "SELECT f FROM FormDescriptions f WHERE f.formDescriptionsPK.langCode = :langCode")})
public class FormDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FormDescriptionsPK formDescriptionsPK;
    @Lob
    @Column(name = "description")
    private String description;

    public FormDescriptions() {
    }

    public FormDescriptions(FormDescriptionsPK formDescriptionsPK) {
        this.formDescriptionsPK = formDescriptionsPK;
    }

    public FormDescriptions(int objectId, String langCode) {
        this.formDescriptionsPK = new FormDescriptionsPK(objectId, langCode);
    }

    public FormDescriptionsPK getFormDescriptionsPK() {
        return formDescriptionsPK;
    }

    public void setFormDescriptionsPK(FormDescriptionsPK formDescriptionsPK) {
        this.formDescriptionsPK = formDescriptionsPK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (formDescriptionsPK != null ? formDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormDescriptions)) {
            return false;
        }
        FormDescriptions other = (FormDescriptions) object;
        if ((this.formDescriptionsPK == null && other.formDescriptionsPK != null) || (this.formDescriptionsPK != null && !this.formDescriptionsPK.equals(other.formDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FormDescriptions[ formDescriptionsPK=" + formDescriptionsPK + " ]";
    }
    
}
