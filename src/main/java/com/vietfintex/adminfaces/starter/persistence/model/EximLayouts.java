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
@Table(name = "exim_layouts")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EximLayouts.findAll", query = "SELECT e FROM EximLayouts e")
    , @NamedQuery(name = "EximLayouts.findByLayoutId", query = "SELECT e FROM EximLayouts e WHERE e.layoutId = :layoutId")
    , @NamedQuery(name = "EximLayouts.findByName", query = "SELECT e FROM EximLayouts e WHERE e.name = :name")
    , @NamedQuery(name = "EximLayouts.findByPatternId", query = "SELECT e FROM EximLayouts e WHERE e.patternId = :patternId")
    , @NamedQuery(name = "EximLayouts.findByActive", query = "SELECT e FROM EximLayouts e WHERE e.active = :active")})
public class EximLayouts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "layout_id")
    private Integer layoutId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Lob
    @Column(name = "cols")
    private String cols;
    @Lob
    @Column(name = "options")
    private String options;
    @Basic(optional = false)
    @Column(name = "pattern_id")
    private String patternId;
    @Basic(optional = false)
    @Column(name = "active")
    private Character active;

    public EximLayouts() {
    }

    public EximLayouts(Integer layoutId) {
        this.layoutId = layoutId;
    }

    public EximLayouts(Integer layoutId, String name, String patternId, Character active) {
        this.layoutId = layoutId;
        this.name = name;
        this.patternId = patternId;
        this.active = active;
    }

    public Integer getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(Integer layoutId) {
        this.layoutId = layoutId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCols() {
        return cols;
    }

    public void setCols(String cols) {
        this.cols = cols;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getPatternId() {
        return patternId;
    }

    public void setPatternId(String patternId) {
        this.patternId = patternId;
    }

    public Character getActive() {
        return active;
    }

    public void setActive(Character active) {
        this.active = active;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (layoutId != null ? layoutId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EximLayouts)) {
            return false;
        }
        EximLayouts other = (EximLayouts) object;
        if ((this.layoutId == null && other.layoutId != null) || (this.layoutId != null && !this.layoutId.equals(other.layoutId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EximLayouts[ layoutId=" + layoutId + " ]";
    }
    
}
