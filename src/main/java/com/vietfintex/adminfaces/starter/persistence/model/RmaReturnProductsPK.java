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
public class RmaReturnProductsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "return_id")
    private int returnId;
    @Basic(optional = false)
    @Column(name = "item_id")
    private int itemId;
    @Basic(optional = false)
    @Column(name = "type")
    private Character type;

    public RmaReturnProductsPK() {
    }

    public RmaReturnProductsPK(int returnId, int itemId, Character type) {
        this.returnId = returnId;
        this.itemId = itemId;
        this.type = type;
    }

    public int getReturnId() {
        return returnId;
    }

    public void setReturnId(int returnId) {
        this.returnId = returnId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
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
        hash += (int) returnId;
        hash += (int) itemId;
        hash += (type != null ? type.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RmaReturnProductsPK)) {
            return false;
        }
        RmaReturnProductsPK other = (RmaReturnProductsPK) object;
        if (this.returnId != other.returnId) {
            return false;
        }
        if (this.itemId != other.itemId) {
            return false;
        }
        if ((this.type == null && other.type != null) || (this.type != null && !this.type.equals(other.type))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RmaReturnProductsPK[ returnId=" + returnId + ", itemId=" + itemId + ", type=" + type + " ]";
    }
    
}
