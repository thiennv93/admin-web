/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.adminfaces.starter.persistence.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Dell
 */
@Embeddable
public class DataFeedDescriptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "datafeed_id")
    private int datafeedId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public DataFeedDescriptionsPK() {
    }

    public DataFeedDescriptionsPK(int datafeedId, String langCode) {
        this.datafeedId = datafeedId;
        this.langCode = langCode;
    }

    public int getDatafeedId() {
        return datafeedId;
    }

    public void setDatafeedId(int datafeedId) {
        this.datafeedId = datafeedId;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) datafeedId;
        hash += (langCode != null ? langCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataFeedDescriptionsPK)) {
            return false;
        }
        DataFeedDescriptionsPK other = (DataFeedDescriptionsPK) object;
        if (this.datafeedId != other.datafeedId) {
            return false;
        }
        if ((this.langCode == null && other.langCode != null) || (this.langCode != null && !this.langCode.equals(other.langCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DataFeedDescriptionsPK[ datafeedId=" + datafeedId + ", langCode=" + langCode + " ]";
    }
    
}
