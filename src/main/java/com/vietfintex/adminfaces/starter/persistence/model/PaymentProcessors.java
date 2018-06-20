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
@Table(name = "payment_processors")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PaymentProcessors.findAll", query = "SELECT p FROM PaymentProcessors p")
    , @NamedQuery(name = "PaymentProcessors.findByProcessorId", query = "SELECT p FROM PaymentProcessors p WHERE p.processorId = :processorId")
    , @NamedQuery(name = "PaymentProcessors.findByProcessor", query = "SELECT p FROM PaymentProcessors p WHERE p.processor = :processor")
    , @NamedQuery(name = "PaymentProcessors.findByProcessorScript", query = "SELECT p FROM PaymentProcessors p WHERE p.processorScript = :processorScript")
    , @NamedQuery(name = "PaymentProcessors.findByProcessorTemplate", query = "SELECT p FROM PaymentProcessors p WHERE p.processorTemplate = :processorTemplate")
    , @NamedQuery(name = "PaymentProcessors.findByAdminTemplate", query = "SELECT p FROM PaymentProcessors p WHERE p.adminTemplate = :adminTemplate")
    , @NamedQuery(name = "PaymentProcessors.findByCallback", query = "SELECT p FROM PaymentProcessors p WHERE p.callback = :callback")
    , @NamedQuery(name = "PaymentProcessors.findByType", query = "SELECT p FROM PaymentProcessors p WHERE p.type = :type")
    , @NamedQuery(name = "PaymentProcessors.findByAddon", query = "SELECT p FROM PaymentProcessors p WHERE p.addon = :addon")})
public class PaymentProcessors implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "processor_id")
    private Integer processorId;
    @Basic(optional = false)
    @Column(name = "processor")
    private String processor;
    @Basic(optional = false)
    @Column(name = "processor_script")
    private String processorScript;
    @Basic(optional = false)
    @Column(name = "processor_template")
    private String processorTemplate;
    @Basic(optional = false)
    @Column(name = "admin_template")
    private String adminTemplate;
    @Basic(optional = false)
    @Column(name = "callback")
    private Character callback;
    @Basic(optional = false)
    @Column(name = "type")
    private Character type;
    @Basic(optional = false)
    @Column(name = "addon")
    private String addon;

    public PaymentProcessors() {
    }

    public PaymentProcessors(Integer processorId) {
        this.processorId = processorId;
    }

    public PaymentProcessors(Integer processorId, String processor, String processorScript, String processorTemplate, String adminTemplate, Character callback, Character type, String addon) {
        this.processorId = processorId;
        this.processor = processor;
        this.processorScript = processorScript;
        this.processorTemplate = processorTemplate;
        this.adminTemplate = adminTemplate;
        this.callback = callback;
        this.type = type;
        this.addon = addon;
    }

    public Integer getProcessorId() {
        return processorId;
    }

    public void setProcessorId(Integer processorId) {
        this.processorId = processorId;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getProcessorScript() {
        return processorScript;
    }

    public void setProcessorScript(String processorScript) {
        this.processorScript = processorScript;
    }

    public String getProcessorTemplate() {
        return processorTemplate;
    }

    public void setProcessorTemplate(String processorTemplate) {
        this.processorTemplate = processorTemplate;
    }

    public String getAdminTemplate() {
        return adminTemplate;
    }

    public void setAdminTemplate(String adminTemplate) {
        this.adminTemplate = adminTemplate;
    }

    public Character getCallback() {
        return callback;
    }

    public void setCallback(Character callback) {
        this.callback = callback;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public String getAddon() {
        return addon;
    }

    public void setAddon(String addon) {
        this.addon = addon;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (processorId != null ? processorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentProcessors)) {
            return false;
        }
        PaymentProcessors other = (PaymentProcessors) object;
        if ((this.processorId == null && other.processorId != null) || (this.processorId != null && !this.processorId.equals(other.processorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PaymentProcessors[ processorId=" + processorId + " ]";
    }
    
}
