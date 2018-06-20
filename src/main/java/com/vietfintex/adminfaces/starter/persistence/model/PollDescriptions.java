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
@Table(name = "poll_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PollDescriptions.findAll", query = "SELECT p FROM PollDescriptions p")
    , @NamedQuery(name = "PollDescriptions.findByObjectId", query = "SELECT p FROM PollDescriptions p WHERE p.pollDescriptionsPK.objectId = :objectId")
    , @NamedQuery(name = "PollDescriptions.findByPageId", query = "SELECT p FROM PollDescriptions p WHERE p.pageId = :pageId")
    , @NamedQuery(name = "PollDescriptions.findByLangCode", query = "SELECT p FROM PollDescriptions p WHERE p.pollDescriptionsPK.langCode = :langCode")
    , @NamedQuery(name = "PollDescriptions.findByType", query = "SELECT p FROM PollDescriptions p WHERE p.pollDescriptionsPK.type = :type")})
public class PollDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PollDescriptionsPK pollDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "page_id")
    private int pageId;
    @Lob
    @Column(name = "description")
    private String description;

    public PollDescriptions() {
    }

    public PollDescriptions(PollDescriptionsPK pollDescriptionsPK) {
        this.pollDescriptionsPK = pollDescriptionsPK;
    }

    public PollDescriptions(PollDescriptionsPK pollDescriptionsPK, int pageId) {
        this.pollDescriptionsPK = pollDescriptionsPK;
        this.pageId = pageId;
    }

    public PollDescriptions(int objectId, String langCode, Character type) {
        this.pollDescriptionsPK = new PollDescriptionsPK(objectId, langCode, type);
    }

    public PollDescriptionsPK getPollDescriptionsPK() {
        return pollDescriptionsPK;
    }

    public void setPollDescriptionsPK(PollDescriptionsPK pollDescriptionsPK) {
        this.pollDescriptionsPK = pollDescriptionsPK;
    }

    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
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
        hash += (pollDescriptionsPK != null ? pollDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PollDescriptions)) {
            return false;
        }
        PollDescriptions other = (PollDescriptions) object;
        if ((this.pollDescriptionsPK == null && other.pollDescriptionsPK != null) || (this.pollDescriptionsPK != null && !this.pollDescriptionsPK.equals(other.pollDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PollDescriptions[ pollDescriptionsPK=" + pollDescriptionsPK + " ]";
    }
    
}
