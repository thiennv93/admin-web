/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.adminfaces.starter.persistence.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "vendor_payouts")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VendorPayouts.findAll", query = "SELECT v FROM VendorPayouts v")
    , @NamedQuery(name = "VendorPayouts.findByPayoutId", query = "SELECT v FROM VendorPayouts v WHERE v.payoutId = :payoutId")
    , @NamedQuery(name = "VendorPayouts.findByCompanyId", query = "SELECT v FROM VendorPayouts v WHERE v.companyId = :companyId")
    , @NamedQuery(name = "VendorPayouts.findByOrderId", query = "SELECT v FROM VendorPayouts v WHERE v.orderId = :orderId")
    , @NamedQuery(name = "VendorPayouts.findByPayoutDate", query = "SELECT v FROM VendorPayouts v WHERE v.payoutDate = :payoutDate")
    , @NamedQuery(name = "VendorPayouts.findByStartDate", query = "SELECT v FROM VendorPayouts v WHERE v.startDate = :startDate")
    , @NamedQuery(name = "VendorPayouts.findByEndDate", query = "SELECT v FROM VendorPayouts v WHERE v.endDate = :endDate")
    , @NamedQuery(name = "VendorPayouts.findByPayoutAmount", query = "SELECT v FROM VendorPayouts v WHERE v.payoutAmount = :payoutAmount")
    , @NamedQuery(name = "VendorPayouts.findByOrderAmount", query = "SELECT v FROM VendorPayouts v WHERE v.orderAmount = :orderAmount")
    , @NamedQuery(name = "VendorPayouts.findByPaymentMethod", query = "SELECT v FROM VendorPayouts v WHERE v.paymentMethod = :paymentMethod")
    , @NamedQuery(name = "VendorPayouts.findByPayoutType", query = "SELECT v FROM VendorPayouts v WHERE v.payoutType = :payoutType")
    , @NamedQuery(name = "VendorPayouts.findByApprovalStatus", query = "SELECT v FROM VendorPayouts v WHERE v.approvalStatus = :approvalStatus")
    , @NamedQuery(name = "VendorPayouts.findByPlanId", query = "SELECT v FROM VendorPayouts v WHERE v.planId = :planId")
    , @NamedQuery(name = "VendorPayouts.findByCommissionAmount", query = "SELECT v FROM VendorPayouts v WHERE v.commissionAmount = :commissionAmount")
    , @NamedQuery(name = "VendorPayouts.findByCommission", query = "SELECT v FROM VendorPayouts v WHERE v.commission = :commission")
    , @NamedQuery(name = "VendorPayouts.findByCommissionType", query = "SELECT v FROM VendorPayouts v WHERE v.commissionType = :commissionType")})
public class VendorPayouts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "payout_id")
    private Integer payoutId;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Basic(optional = false)
    @Column(name = "order_id")
    private int orderId;
    @Basic(optional = false)
    @Column(name = "payout_date")
    private int payoutDate;
    @Basic(optional = false)
    @Column(name = "start_date")
    private int startDate;
    @Basic(optional = false)
    @Column(name = "end_date")
    private int endDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "payout_amount")
    private BigDecimal payoutAmount;
    @Basic(optional = false)
    @Column(name = "order_amount")
    private BigDecimal orderAmount;
    @Basic(optional = false)
    @Column(name = "payment_method")
    private String paymentMethod;
    @Lob
    @Column(name = "comments")
    private String comments;
    @Basic(optional = false)
    @Column(name = "payout_type")
    private String payoutType;
    @Basic(optional = false)
    @Column(name = "approval_status")
    private Character approvalStatus;
    @Column(name = "plan_id")
    private Integer planId;
    @Basic(optional = false)
    @Column(name = "commission_amount")
    private BigDecimal commissionAmount;
    @Basic(optional = false)
    @Column(name = "commission")
    private BigDecimal commission;
    @Basic(optional = false)
    @Column(name = "commission_type")
    private Character commissionType;

    public VendorPayouts() {
    }

    public VendorPayouts(Integer payoutId) {
        this.payoutId = payoutId;
    }

    public VendorPayouts(Integer payoutId, int companyId, int orderId, int payoutDate, int startDate, int endDate, BigDecimal payoutAmount, BigDecimal orderAmount, String paymentMethod, String payoutType, Character approvalStatus, BigDecimal commissionAmount, BigDecimal commission, Character commissionType) {
        this.payoutId = payoutId;
        this.companyId = companyId;
        this.orderId = orderId;
        this.payoutDate = payoutDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.payoutAmount = payoutAmount;
        this.orderAmount = orderAmount;
        this.paymentMethod = paymentMethod;
        this.payoutType = payoutType;
        this.approvalStatus = approvalStatus;
        this.commissionAmount = commissionAmount;
        this.commission = commission;
        this.commissionType = commissionType;
    }

    public Integer getPayoutId() {
        return payoutId;
    }

    public void setPayoutId(Integer payoutId) {
        this.payoutId = payoutId;
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

    public int getPayoutDate() {
        return payoutDate;
    }

    public void setPayoutDate(int payoutDate) {
        this.payoutDate = payoutDate;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getPayoutAmount() {
        return payoutAmount;
    }

    public void setPayoutAmount(BigDecimal payoutAmount) {
        this.payoutAmount = payoutAmount;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getPayoutType() {
        return payoutType;
    }

    public void setPayoutType(String payoutType) {
        this.payoutType = payoutType;
    }

    public Character getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Character approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public BigDecimal getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(BigDecimal commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public Character getCommissionType() {
        return commissionType;
    }

    public void setCommissionType(Character commissionType) {
        this.commissionType = commissionType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (payoutId != null ? payoutId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VendorPayouts)) {
            return false;
        }
        VendorPayouts other = (VendorPayouts) object;
        if ((this.payoutId == null && other.payoutId != null) || (this.payoutId != null && !this.payoutId.equals(other.payoutId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "VendorPayouts[ payoutId=" + payoutId + " ]";
    }
    
}
