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
@Table(name = "data_feed_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DataFeedDescriptions.findAll", query = "SELECT d FROM DataFeedDescriptions d")
    , @NamedQuery(name = "DataFeedDescriptions.findByDatafeedId", query = "SELECT d FROM DataFeedDescriptions d WHERE d.dataFeedDescriptionsPK.datafeedId = :datafeedId")
    , @NamedQuery(name = "DataFeedDescriptions.findByDatafeedName", query = "SELECT d FROM DataFeedDescriptions d WHERE d.datafeedName = :datafeedName")
    , @NamedQuery(name = "DataFeedDescriptions.findByLangCode", query = "SELECT d FROM DataFeedDescriptions d WHERE d.dataFeedDescriptionsPK.langCode = :langCode")})
public class DataFeedDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DataFeedDescriptionsPK dataFeedDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "datafeed_name")
    private String datafeedName;

    public DataFeedDescriptions() {
    }

    public DataFeedDescriptions(DataFeedDescriptionsPK dataFeedDescriptionsPK) {
        this.dataFeedDescriptionsPK = dataFeedDescriptionsPK;
    }

    public DataFeedDescriptions(DataFeedDescriptionsPK dataFeedDescriptionsPK, String datafeedName) {
        this.dataFeedDescriptionsPK = dataFeedDescriptionsPK;
        this.datafeedName = datafeedName;
    }

    public DataFeedDescriptions(int datafeedId, String langCode) {
        this.dataFeedDescriptionsPK = new DataFeedDescriptionsPK(datafeedId, langCode);
    }

    public DataFeedDescriptionsPK getDataFeedDescriptionsPK() {
        return dataFeedDescriptionsPK;
    }

    public void setDataFeedDescriptionsPK(DataFeedDescriptionsPK dataFeedDescriptionsPK) {
        this.dataFeedDescriptionsPK = dataFeedDescriptionsPK;
    }

    public String getDatafeedName() {
        return datafeedName;
    }

    public void setDatafeedName(String datafeedName) {
        this.datafeedName = datafeedName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataFeedDescriptionsPK != null ? dataFeedDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataFeedDescriptions)) {
            return false;
        }
        DataFeedDescriptions other = (DataFeedDescriptions) object;
        if ((this.dataFeedDescriptionsPK == null && other.dataFeedDescriptionsPK != null) || (this.dataFeedDescriptionsPK != null && !this.dataFeedDescriptionsPK.equals(other.dataFeedDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DataFeedDescriptions[ dataFeedDescriptionsPK=" + dataFeedDescriptionsPK + " ]";
    }
    
}
