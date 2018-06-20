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
@Table(name = "ebay_product_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EbayProductLog.findAll", query = "SELECT e FROM EbayProductLog e")
    , @NamedQuery(name = "EbayProductLog.findById", query = "SELECT e FROM EbayProductLog e WHERE e.id = :id")
    , @NamedQuery(name = "EbayProductLog.findByProductId", query = "SELECT e FROM EbayProductLog e WHERE e.productId = :productId")
    , @NamedQuery(name = "EbayProductLog.findByTemplateId", query = "SELECT e FROM EbayProductLog e WHERE e.templateId = :templateId")
    , @NamedQuery(name = "EbayProductLog.findByProductName", query = "SELECT e FROM EbayProductLog e WHERE e.productName = :productName")
    , @NamedQuery(name = "EbayProductLog.findByTemplateName", query = "SELECT e FROM EbayProductLog e WHERE e.templateName = :templateName")
    , @NamedQuery(name = "EbayProductLog.findByCode", query = "SELECT e FROM EbayProductLog e WHERE e.code = :code")
    , @NamedQuery(name = "EbayProductLog.findByAction", query = "SELECT e FROM EbayProductLog e WHERE e.action = :action")
    , @NamedQuery(name = "EbayProductLog.findByType", query = "SELECT e FROM EbayProductLog e WHERE e.type = :type")
    , @NamedQuery(name = "EbayProductLog.findByDatetime", query = "SELECT e FROM EbayProductLog e WHERE e.datetime = :datetime")})
public class EbayProductLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @Column(name = "template_id")
    private int templateId;
    @Basic(optional = false)
    @Column(name = "product_name")
    private String productName;
    @Basic(optional = false)
    @Column(name = "template_name")
    private String templateName;
    @Basic(optional = false)
    @Lob
    @Column(name = "message")
    private String message;
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @Column(name = "action")
    private short action;
    @Basic(optional = false)
    @Column(name = "type")
    private short type;
    @Column(name = "datetime")
    private Integer datetime;

    public EbayProductLog() {
    }

    public EbayProductLog(Integer id) {
        this.id = id;
    }

    public EbayProductLog(Integer id, int productId, int templateId, String productName, String templateName, String message, short action, short type) {
        this.id = id;
        this.productId = productId;
        this.templateId = templateId;
        this.productName = productName;
        this.templateName = templateName;
        this.message = message;
        this.action = action;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public short getAction() {
        return action;
    }

    public void setAction(short action) {
        this.action = action;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public Integer getDatetime() {
        return datetime;
    }

    public void setDatetime(Integer datetime) {
        this.datetime = datetime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EbayProductLog)) {
            return false;
        }
        EbayProductLog other = (EbayProductLog) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EbayProductLog[ id=" + id + " ]";
    }
    
}
