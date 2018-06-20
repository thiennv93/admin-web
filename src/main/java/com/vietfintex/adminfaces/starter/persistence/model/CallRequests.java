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
@Table(name = "call_requests")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CallRequests.findAll", query = "SELECT c FROM CallRequests c")
    , @NamedQuery(name = "CallRequests.findByRequestId", query = "SELECT c FROM CallRequests c WHERE c.requestId = :requestId")
    , @NamedQuery(name = "CallRequests.findByCompanyId", query = "SELECT c FROM CallRequests c WHERE c.companyId = :companyId")
    , @NamedQuery(name = "CallRequests.findByOrderId", query = "SELECT c FROM CallRequests c WHERE c.orderId = :orderId")
    , @NamedQuery(name = "CallRequests.findByUserId", query = "SELECT c FROM CallRequests c WHERE c.userId = :userId")
    , @NamedQuery(name = "CallRequests.findByProductId", query = "SELECT c FROM CallRequests c WHERE c.productId = :productId")
    , @NamedQuery(name = "CallRequests.findByTimestamp", query = "SELECT c FROM CallRequests c WHERE c.timestamp = :timestamp")
    , @NamedQuery(name = "CallRequests.findByStatus", query = "SELECT c FROM CallRequests c WHERE c.status = :status")
    , @NamedQuery(name = "CallRequests.findByName", query = "SELECT c FROM CallRequests c WHERE c.name = :name")
    , @NamedQuery(name = "CallRequests.findByPhone", query = "SELECT c FROM CallRequests c WHERE c.phone = :phone")
    , @NamedQuery(name = "CallRequests.findByTimeFrom", query = "SELECT c FROM CallRequests c WHERE c.timeFrom = :timeFrom")
    , @NamedQuery(name = "CallRequests.findByTimeTo", query = "SELECT c FROM CallRequests c WHERE c.timeTo = :timeTo")})
public class CallRequests implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "request_id")
    private Integer requestId;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Basic(optional = false)
    @Column(name = "order_id")
    private int orderId;
    @Basic(optional = false)
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @Column(name = "time_from")
    private String timeFrom;
    @Basic(optional = false)
    @Column(name = "time_to")
    private String timeTo;
    @Lob
    @Column(name = "notes")
    private String notes;
    @Basic(optional = false)
    @Lob
    @Column(name = "cart_products")
    private String cartProducts;

    public CallRequests() {
    }

    public CallRequests(Integer requestId) {
        this.requestId = requestId;
    }

    public CallRequests(Integer requestId, int companyId, int orderId, int userId, int productId, int timestamp, String status, String name, String phone, String timeFrom, String timeTo, String cartProducts) {
        this.requestId = requestId;
        this.companyId = companyId;
        this.orderId = orderId;
        this.userId = userId;
        this.productId = productId;
        this.timestamp = timestamp;
        this.status = status;
        this.name = name;
        this.phone = phone;
        this.timeFrom = timeFrom;
        this.timeTo = timeTo;
        this.cartProducts = cartProducts;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
    }

    public String getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(String timeTo) {
        this.timeTo = timeTo;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getCartProducts() {
        return cartProducts;
    }

    public void setCartProducts(String cartProducts) {
        this.cartProducts = cartProducts;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (requestId != null ? requestId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CallRequests)) {
            return false;
        }
        CallRequests other = (CallRequests) object;
        if ((this.requestId == null && other.requestId != null) || (this.requestId != null && !this.requestId.equals(other.requestId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CallRequests[ requestId=" + requestId + " ]";
    }
    
}
