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
@Table(name = "static_data")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StaticData.findAll", query = "SELECT s FROM StaticData s")
    , @NamedQuery(name = "StaticData.findByParamId", query = "SELECT s FROM StaticData s WHERE s.paramId = :paramId")
    , @NamedQuery(name = "StaticData.findByParam", query = "SELECT s FROM StaticData s WHERE s.param = :param")
    , @NamedQuery(name = "StaticData.findByParam2", query = "SELECT s FROM StaticData s WHERE s.param2 = :param2")
    , @NamedQuery(name = "StaticData.findByParam3", query = "SELECT s FROM StaticData s WHERE s.param3 = :param3")
    , @NamedQuery(name = "StaticData.findByParam4", query = "SELECT s FROM StaticData s WHERE s.param4 = :param4")
    , @NamedQuery(name = "StaticData.findByParam5", query = "SELECT s FROM StaticData s WHERE s.param5 = :param5")
    , @NamedQuery(name = "StaticData.findByClass1", query = "SELECT s FROM StaticData s WHERE s.class1 = :class1")
    , @NamedQuery(name = "StaticData.findBySection", query = "SELECT s FROM StaticData s WHERE s.section = :section")
    , @NamedQuery(name = "StaticData.findByStatus", query = "SELECT s FROM StaticData s WHERE s.status = :status")
    , @NamedQuery(name = "StaticData.findByPosition", query = "SELECT s FROM StaticData s WHERE s.position = :position")
    , @NamedQuery(name = "StaticData.findByParentId", query = "SELECT s FROM StaticData s WHERE s.parentId = :parentId")
    , @NamedQuery(name = "StaticData.findByIdPath", query = "SELECT s FROM StaticData s WHERE s.idPath = :idPath")
    , @NamedQuery(name = "StaticData.findByLocalization", query = "SELECT s FROM StaticData s WHERE s.localization = :localization")
    , @NamedQuery(name = "StaticData.findByCompanyId", query = "SELECT s FROM StaticData s WHERE s.companyId = :companyId")})
public class StaticData implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "param_id")
    private Integer paramId;
    @Basic(optional = false)
    @Column(name = "param")
    private String param;
    @Basic(optional = false)
    @Column(name = "param_2")
    private String param2;
    @Basic(optional = false)
    @Column(name = "param_3")
    private String param3;
    @Basic(optional = false)
    @Column(name = "param_4")
    private String param4;
    @Basic(optional = false)
    @Column(name = "param_5")
    private String param5;
    @Basic(optional = false)
    @Column(name = "class")
    private String class1;
    @Basic(optional = false)
    @Column(name = "section")
    private Character section;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "parent_id")
    private int parentId;
    @Basic(optional = false)
    @Column(name = "id_path")
    private String idPath;
    @Basic(optional = false)
    @Column(name = "localization")
    private String localization;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;

    public StaticData() {
    }

    public StaticData(Integer paramId) {
        this.paramId = paramId;
    }

    public StaticData(Integer paramId, String param, String param2, String param3, String param4, String param5, String class1, Character section, Character status, short position, int parentId, String idPath, String localization, int companyId) {
        this.paramId = paramId;
        this.param = param;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
        this.param5 = param5;
        this.class1 = class1;
        this.section = section;
        this.status = status;
        this.position = position;
        this.parentId = parentId;
        this.idPath = idPath;
        this.localization = localization;
        this.companyId = companyId;
    }

    public Integer getParamId() {
        return paramId;
    }

    public void setParamId(Integer paramId) {
        this.paramId = paramId;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    public String getParam3() {
        return param3;
    }

    public void setParam3(String param3) {
        this.param3 = param3;
    }

    public String getParam4() {
        return param4;
    }

    public void setParam4(String param4) {
        this.param4 = param4;
    }

    public String getParam5() {
        return param5;
    }

    public void setParam5(String param5) {
        this.param5 = param5;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public Character getSection() {
        return section;
    }

    public void setSection(Character section) {
        this.section = section;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getIdPath() {
        return idPath;
    }

    public void setIdPath(String idPath) {
        this.idPath = idPath;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paramId != null ? paramId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StaticData)) {
            return false;
        }
        StaticData other = (StaticData) object;
        if ((this.paramId == null && other.paramId != null) || (this.paramId != null && !this.paramId.equals(other.paramId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StaticData[ paramId=" + paramId + " ]";
    }
    
}
