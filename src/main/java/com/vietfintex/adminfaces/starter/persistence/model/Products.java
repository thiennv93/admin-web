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
@Table(name = "products")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Products.findAll", query = "SELECT p FROM Products p")
    , @NamedQuery(name = "Products.findByProductId", query = "SELECT p FROM Products p WHERE p.productId = :productId")
    , @NamedQuery(name = "Products.findByProductCode", query = "SELECT p FROM Products p WHERE p.productCode = :productCode")
    , @NamedQuery(name = "Products.findByProductType", query = "SELECT p FROM Products p WHERE p.productType = :productType")
    , @NamedQuery(name = "Products.findByStatus", query = "SELECT p FROM Products p WHERE p.status = :status")
    , @NamedQuery(name = "Products.findByCompanyId", query = "SELECT p FROM Products p WHERE p.companyId = :companyId")
    , @NamedQuery(name = "Products.findByApproved", query = "SELECT p FROM Products p WHERE p.approved = :approved")
    , @NamedQuery(name = "Products.findByListPrice", query = "SELECT p FROM Products p WHERE p.listPrice = :listPrice")
    , @NamedQuery(name = "Products.findByAmount", query = "SELECT p FROM Products p WHERE p.amount = :amount")
    , @NamedQuery(name = "Products.findByWeight", query = "SELECT p FROM Products p WHERE p.weight = :weight")
    , @NamedQuery(name = "Products.findByLength", query = "SELECT p FROM Products p WHERE p.length = :length")
    , @NamedQuery(name = "Products.findByWidth", query = "SELECT p FROM Products p WHERE p.width = :width")
    , @NamedQuery(name = "Products.findByHeight", query = "SELECT p FROM Products p WHERE p.height = :height")
    , @NamedQuery(name = "Products.findByShippingFreight", query = "SELECT p FROM Products p WHERE p.shippingFreight = :shippingFreight")
    , @NamedQuery(name = "Products.findByLowAvailLimit", query = "SELECT p FROM Products p WHERE p.lowAvailLimit = :lowAvailLimit")
    , @NamedQuery(name = "Products.findByTimestamp", query = "SELECT p FROM Products p WHERE p.timestamp = :timestamp")
    , @NamedQuery(name = "Products.findByUpdatedTimestamp", query = "SELECT p FROM Products p WHERE p.updatedTimestamp = :updatedTimestamp")
    , @NamedQuery(name = "Products.findByUsergroupIds", query = "SELECT p FROM Products p WHERE p.usergroupIds = :usergroupIds")
    , @NamedQuery(name = "Products.findByIsEdp", query = "SELECT p FROM Products p WHERE p.isEdp = :isEdp")
    , @NamedQuery(name = "Products.findByEdpShipping", query = "SELECT p FROM Products p WHERE p.edpShipping = :edpShipping")
    , @NamedQuery(name = "Products.findByUnlimitedDownload", query = "SELECT p FROM Products p WHERE p.unlimitedDownload = :unlimitedDownload")
    , @NamedQuery(name = "Products.findByTracking", query = "SELECT p FROM Products p WHERE p.tracking = :tracking")
    , @NamedQuery(name = "Products.findByFreeShipping", query = "SELECT p FROM Products p WHERE p.freeShipping = :freeShipping")
    , @NamedQuery(name = "Products.findByZeroPriceAction", query = "SELECT p FROM Products p WHERE p.zeroPriceAction = :zeroPriceAction")
    , @NamedQuery(name = "Products.findByIsPbp", query = "SELECT p FROM Products p WHERE p.isPbp = :isPbp")
    , @NamedQuery(name = "Products.findByIsOp", query = "SELECT p FROM Products p WHERE p.isOp = :isOp")
    , @NamedQuery(name = "Products.findByIsOper", query = "SELECT p FROM Products p WHERE p.isOper = :isOper")
    , @NamedQuery(name = "Products.findByIsReturnable", query = "SELECT p FROM Products p WHERE p.isReturnable = :isReturnable")
    , @NamedQuery(name = "Products.findByReturnPeriod", query = "SELECT p FROM Products p WHERE p.returnPeriod = :returnPeriod")
    , @NamedQuery(name = "Products.findByAvailSince", query = "SELECT p FROM Products p WHERE p.availSince = :availSince")
    , @NamedQuery(name = "Products.findByOutOfStockActions", query = "SELECT p FROM Products p WHERE p.outOfStockActions = :outOfStockActions")
    , @NamedQuery(name = "Products.findByLocalization", query = "SELECT p FROM Products p WHERE p.localization = :localization")
    , @NamedQuery(name = "Products.findByMinQty", query = "SELECT p FROM Products p WHERE p.minQty = :minQty")
    , @NamedQuery(name = "Products.findByMaxQty", query = "SELECT p FROM Products p WHERE p.maxQty = :maxQty")
    , @NamedQuery(name = "Products.findByQtyStep", query = "SELECT p FROM Products p WHERE p.qtyStep = :qtyStep")
    , @NamedQuery(name = "Products.findByListQtyCount", query = "SELECT p FROM Products p WHERE p.listQtyCount = :listQtyCount")
    , @NamedQuery(name = "Products.findByTaxIds", query = "SELECT p FROM Products p WHERE p.taxIds = :taxIds")
    , @NamedQuery(name = "Products.findByAgeVerification", query = "SELECT p FROM Products p WHERE p.ageVerification = :ageVerification")
    , @NamedQuery(name = "Products.findByAgeLimit", query = "SELECT p FROM Products p WHERE p.ageLimit = :ageLimit")
    , @NamedQuery(name = "Products.findByOptionsType", query = "SELECT p FROM Products p WHERE p.optionsType = :optionsType")
    , @NamedQuery(name = "Products.findByExceptionsType", query = "SELECT p FROM Products p WHERE p.exceptionsType = :exceptionsType")
    , @NamedQuery(name = "Products.findByDetailsLayout", query = "SELECT p FROM Products p WHERE p.detailsLayout = :detailsLayout")
    , @NamedQuery(name = "Products.findByShippingParams", query = "SELECT p FROM Products p WHERE p.shippingParams = :shippingParams")
    , @NamedQuery(name = "Products.findByFacebookObjType", query = "SELECT p FROM Products p WHERE p.facebookObjType = :facebookObjType")
    , @NamedQuery(name = "Products.findByParentProductId", query = "SELECT p FROM Products p WHERE p.parentProductId = :parentProductId")
    , @NamedQuery(name = "Products.findByVariationCode", query = "SELECT p FROM Products p WHERE p.variationCode = :variationCode")
    , @NamedQuery(name = "Products.findByVariationOptions", query = "SELECT p FROM Products p WHERE p.variationOptions = :variationOptions")
    , @NamedQuery(name = "Products.findByBuyNowUrl", query = "SELECT p FROM Products p WHERE p.buyNowUrl = :buyNowUrl")
    , @NamedQuery(name = "Products.findByEbayTemplateId", query = "SELECT p FROM Products p WHERE p.ebayTemplateId = :ebayTemplateId")
    , @NamedQuery(name = "Products.findByProductHash", query = "SELECT p FROM Products p WHERE p.productHash = :productHash")
    , @NamedQuery(name = "Products.findByEbayPrice", query = "SELECT p FROM Products p WHERE p.ebayPrice = :ebayPrice")
    , @NamedQuery(name = "Products.findByPackageType", query = "SELECT p FROM Products p WHERE p.packageType = :packageType")
    , @NamedQuery(name = "Products.findByEbayStatus", query = "SELECT p FROM Products p WHERE p.ebayStatus = :ebayStatus")
    , @NamedQuery(name = "Products.findByEbayOverridePrice", query = "SELECT p FROM Products p WHERE p.ebayOverridePrice = :ebayOverridePrice")})
public class Products implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_id")
    private Integer productId;
    @Basic(optional = false)
    @Column(name = "product_code")
    private String productCode;
    @Basic(optional = false)
    @Column(name = "product_type")
    private Character productType;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Basic(optional = false)
    @Column(name = "approved")
    private Character approved;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "list_price")
    private BigDecimal listPrice;
    @Basic(optional = false)
    @Column(name = "amount")
    private int amount;
    @Basic(optional = false)
    @Column(name = "weight")
    private BigDecimal weight;
    @Basic(optional = false)
    @Column(name = "length")
    private int length;
    @Basic(optional = false)
    @Column(name = "width")
    private int width;
    @Basic(optional = false)
    @Column(name = "height")
    private int height;
    @Basic(optional = false)
    @Column(name = "shipping_freight")
    private BigDecimal shippingFreight;
    @Basic(optional = false)
    @Column(name = "low_avail_limit")
    private int lowAvailLimit;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    @Basic(optional = false)
    @Column(name = "updated_timestamp")
    private int updatedTimestamp;
    @Basic(optional = false)
    @Column(name = "usergroup_ids")
    private String usergroupIds;
    @Basic(optional = false)
    @Column(name = "is_edp")
    private Character isEdp;
    @Basic(optional = false)
    @Column(name = "edp_shipping")
    private Character edpShipping;
    @Basic(optional = false)
    @Column(name = "unlimited_download")
    private Character unlimitedDownload;
    @Basic(optional = false)
    @Column(name = "tracking")
    private Character tracking;
    @Basic(optional = false)
    @Column(name = "free_shipping")
    private Character freeShipping;
    @Basic(optional = false)
    @Column(name = "zero_price_action")
    private Character zeroPriceAction;
    @Basic(optional = false)
    @Column(name = "is_pbp")
    private Character isPbp;
    @Basic(optional = false)
    @Column(name = "is_op")
    private Character isOp;
    @Basic(optional = false)
    @Column(name = "is_oper")
    private Character isOper;
    @Basic(optional = false)
    @Column(name = "is_returnable")
    private Character isReturnable;
    @Basic(optional = false)
    @Column(name = "return_period")
    private int returnPeriod;
    @Basic(optional = false)
    @Column(name = "avail_since")
    private int availSince;
    @Basic(optional = false)
    @Column(name = "out_of_stock_actions")
    private Character outOfStockActions;
    @Basic(optional = false)
    @Column(name = "localization")
    private String localization;
    @Basic(optional = false)
    @Column(name = "min_qty")
    private short minQty;
    @Basic(optional = false)
    @Column(name = "max_qty")
    private short maxQty;
    @Basic(optional = false)
    @Column(name = "qty_step")
    private short qtyStep;
    @Basic(optional = false)
    @Column(name = "list_qty_count")
    private short listQtyCount;
    @Basic(optional = false)
    @Column(name = "tax_ids")
    private String taxIds;
    @Basic(optional = false)
    @Column(name = "age_verification")
    private Character ageVerification;
    @Basic(optional = false)
    @Column(name = "age_limit")
    private short ageLimit;
    @Basic(optional = false)
    @Column(name = "options_type")
    private Character optionsType;
    @Basic(optional = false)
    @Column(name = "exceptions_type")
    private Character exceptionsType;
    @Basic(optional = false)
    @Column(name = "details_layout")
    private String detailsLayout;
    @Basic(optional = false)
    @Column(name = "shipping_params")
    private String shippingParams;
    @Basic(optional = false)
    @Column(name = "facebook_obj_type")
    private String facebookObjType;
    @Basic(optional = false)
    @Column(name = "parent_product_id")
    private int parentProductId;
    @Column(name = "variation_code")
    private String variationCode;
    @Column(name = "variation_options")
    private String variationOptions;
    @Basic(optional = false)
    @Column(name = "buy_now_url")
    private String buyNowUrl;
    @Basic(optional = false)
    @Column(name = "ebay_template_id")
    private int ebayTemplateId;
    @Basic(optional = false)
    @Column(name = "product_hash")
    private String productHash;
    @Column(name = "ebay_price")
    private BigDecimal ebayPrice;
    @Column(name = "package_type")
    private String packageType;
    @Column(name = "ebay_status")
    private Short ebayStatus;
    @Basic(optional = false)
    @Column(name = "ebay_override_price")
    private Character ebayOverridePrice;

    public Products() {
    }

    public Products(Integer productId) {
        this.productId = productId;
    }

    public Products(Integer productId, String productCode, Character productType, Character status, int companyId, Character approved, BigDecimal listPrice, int amount, BigDecimal weight, int length, int width, int height, BigDecimal shippingFreight, int lowAvailLimit, int timestamp, int updatedTimestamp, String usergroupIds, Character isEdp, Character edpShipping, Character unlimitedDownload, Character tracking, Character freeShipping, Character zeroPriceAction, Character isPbp, Character isOp, Character isOper, Character isReturnable, int returnPeriod, int availSince, Character outOfStockActions, String localization, short minQty, short maxQty, short qtyStep, short listQtyCount, String taxIds, Character ageVerification, short ageLimit, Character optionsType, Character exceptionsType, String detailsLayout, String shippingParams, String facebookObjType, int parentProductId, String buyNowUrl, int ebayTemplateId, String productHash, Character ebayOverridePrice) {
        this.productId = productId;
        this.productCode = productCode;
        this.productType = productType;
        this.status = status;
        this.companyId = companyId;
        this.approved = approved;
        this.listPrice = listPrice;
        this.amount = amount;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        this.shippingFreight = shippingFreight;
        this.lowAvailLimit = lowAvailLimit;
        this.timestamp = timestamp;
        this.updatedTimestamp = updatedTimestamp;
        this.usergroupIds = usergroupIds;
        this.isEdp = isEdp;
        this.edpShipping = edpShipping;
        this.unlimitedDownload = unlimitedDownload;
        this.tracking = tracking;
        this.freeShipping = freeShipping;
        this.zeroPriceAction = zeroPriceAction;
        this.isPbp = isPbp;
        this.isOp = isOp;
        this.isOper = isOper;
        this.isReturnable = isReturnable;
        this.returnPeriod = returnPeriod;
        this.availSince = availSince;
        this.outOfStockActions = outOfStockActions;
        this.localization = localization;
        this.minQty = minQty;
        this.maxQty = maxQty;
        this.qtyStep = qtyStep;
        this.listQtyCount = listQtyCount;
        this.taxIds = taxIds;
        this.ageVerification = ageVerification;
        this.ageLimit = ageLimit;
        this.optionsType = optionsType;
        this.exceptionsType = exceptionsType;
        this.detailsLayout = detailsLayout;
        this.shippingParams = shippingParams;
        this.facebookObjType = facebookObjType;
        this.parentProductId = parentProductId;
        this.buyNowUrl = buyNowUrl;
        this.ebayTemplateId = ebayTemplateId;
        this.productHash = productHash;
        this.ebayOverridePrice = ebayOverridePrice;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Character getProductType() {
        return productType;
    }

    public void setProductType(Character productType) {
        this.productType = productType;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public Character getApproved() {
        return approved;
    }

    public void setApproved(Character approved) {
        this.approved = approved;
    }

    public BigDecimal getListPrice() {
        return listPrice;
    }

    public void setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public BigDecimal getShippingFreight() {
        return shippingFreight;
    }

    public void setShippingFreight(BigDecimal shippingFreight) {
        this.shippingFreight = shippingFreight;
    }

    public int getLowAvailLimit() {
        return lowAvailLimit;
    }

    public void setLowAvailLimit(int lowAvailLimit) {
        this.lowAvailLimit = lowAvailLimit;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public int getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    public void setUpdatedTimestamp(int updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    public String getUsergroupIds() {
        return usergroupIds;
    }

    public void setUsergroupIds(String usergroupIds) {
        this.usergroupIds = usergroupIds;
    }

    public Character getIsEdp() {
        return isEdp;
    }

    public void setIsEdp(Character isEdp) {
        this.isEdp = isEdp;
    }

    public Character getEdpShipping() {
        return edpShipping;
    }

    public void setEdpShipping(Character edpShipping) {
        this.edpShipping = edpShipping;
    }

    public Character getUnlimitedDownload() {
        return unlimitedDownload;
    }

    public void setUnlimitedDownload(Character unlimitedDownload) {
        this.unlimitedDownload = unlimitedDownload;
    }

    public Character getTracking() {
        return tracking;
    }

    public void setTracking(Character tracking) {
        this.tracking = tracking;
    }

    public Character getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(Character freeShipping) {
        this.freeShipping = freeShipping;
    }

    public Character getZeroPriceAction() {
        return zeroPriceAction;
    }

    public void setZeroPriceAction(Character zeroPriceAction) {
        this.zeroPriceAction = zeroPriceAction;
    }

    public Character getIsPbp() {
        return isPbp;
    }

    public void setIsPbp(Character isPbp) {
        this.isPbp = isPbp;
    }

    public Character getIsOp() {
        return isOp;
    }

    public void setIsOp(Character isOp) {
        this.isOp = isOp;
    }

    public Character getIsOper() {
        return isOper;
    }

    public void setIsOper(Character isOper) {
        this.isOper = isOper;
    }

    public Character getIsReturnable() {
        return isReturnable;
    }

    public void setIsReturnable(Character isReturnable) {
        this.isReturnable = isReturnable;
    }

    public int getReturnPeriod() {
        return returnPeriod;
    }

    public void setReturnPeriod(int returnPeriod) {
        this.returnPeriod = returnPeriod;
    }

    public int getAvailSince() {
        return availSince;
    }

    public void setAvailSince(int availSince) {
        this.availSince = availSince;
    }

    public Character getOutOfStockActions() {
        return outOfStockActions;
    }

    public void setOutOfStockActions(Character outOfStockActions) {
        this.outOfStockActions = outOfStockActions;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public short getMinQty() {
        return minQty;
    }

    public void setMinQty(short minQty) {
        this.minQty = minQty;
    }

    public short getMaxQty() {
        return maxQty;
    }

    public void setMaxQty(short maxQty) {
        this.maxQty = maxQty;
    }

    public short getQtyStep() {
        return qtyStep;
    }

    public void setQtyStep(short qtyStep) {
        this.qtyStep = qtyStep;
    }

    public short getListQtyCount() {
        return listQtyCount;
    }

    public void setListQtyCount(short listQtyCount) {
        this.listQtyCount = listQtyCount;
    }

    public String getTaxIds() {
        return taxIds;
    }

    public void setTaxIds(String taxIds) {
        this.taxIds = taxIds;
    }

    public Character getAgeVerification() {
        return ageVerification;
    }

    public void setAgeVerification(Character ageVerification) {
        this.ageVerification = ageVerification;
    }

    public short getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(short ageLimit) {
        this.ageLimit = ageLimit;
    }

    public Character getOptionsType() {
        return optionsType;
    }

    public void setOptionsType(Character optionsType) {
        this.optionsType = optionsType;
    }

    public Character getExceptionsType() {
        return exceptionsType;
    }

    public void setExceptionsType(Character exceptionsType) {
        this.exceptionsType = exceptionsType;
    }

    public String getDetailsLayout() {
        return detailsLayout;
    }

    public void setDetailsLayout(String detailsLayout) {
        this.detailsLayout = detailsLayout;
    }

    public String getShippingParams() {
        return shippingParams;
    }

    public void setShippingParams(String shippingParams) {
        this.shippingParams = shippingParams;
    }

    public String getFacebookObjType() {
        return facebookObjType;
    }

    public void setFacebookObjType(String facebookObjType) {
        this.facebookObjType = facebookObjType;
    }

    public int getParentProductId() {
        return parentProductId;
    }

    public void setParentProductId(int parentProductId) {
        this.parentProductId = parentProductId;
    }

    public String getVariationCode() {
        return variationCode;
    }

    public void setVariationCode(String variationCode) {
        this.variationCode = variationCode;
    }

    public String getVariationOptions() {
        return variationOptions;
    }

    public void setVariationOptions(String variationOptions) {
        this.variationOptions = variationOptions;
    }

    public String getBuyNowUrl() {
        return buyNowUrl;
    }

    public void setBuyNowUrl(String buyNowUrl) {
        this.buyNowUrl = buyNowUrl;
    }

    public int getEbayTemplateId() {
        return ebayTemplateId;
    }

    public void setEbayTemplateId(int ebayTemplateId) {
        this.ebayTemplateId = ebayTemplateId;
    }

    public String getProductHash() {
        return productHash;
    }

    public void setProductHash(String productHash) {
        this.productHash = productHash;
    }

    public BigDecimal getEbayPrice() {
        return ebayPrice;
    }

    public void setEbayPrice(BigDecimal ebayPrice) {
        this.ebayPrice = ebayPrice;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public Short getEbayStatus() {
        return ebayStatus;
    }

    public void setEbayStatus(Short ebayStatus) {
        this.ebayStatus = ebayStatus;
    }

    public Character getEbayOverridePrice() {
        return ebayOverridePrice;
    }

    public void setEbayOverridePrice(Character ebayOverridePrice) {
        this.ebayOverridePrice = ebayOverridePrice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Products)) {
            return false;
        }
        Products other = (Products) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Products[ productId=" + productId + " ]";
    }
    
}
