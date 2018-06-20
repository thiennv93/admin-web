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
public class OrderDocsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "doc_id")
    private int docId;
    @Basic(optional = false)
    @Column(name = "type")
    private Character type;

    public OrderDocsPK() {
    }

    public OrderDocsPK(int docId, Character type) {
        this.docId = docId;
        this.type = type;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) docId;
        hash += (type != null ? type.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderDocsPK)) {
            return false;
        }
        OrderDocsPK other = (OrderDocsPK) object;
        if (this.docId != other.docId) {
            return false;
        }
        if ((this.type == null && other.type != null) || (this.type != null && !this.type.equals(other.type))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OrderDocsPK[ docId=" + docId + ", type=" + type + " ]";
    }
    
}
