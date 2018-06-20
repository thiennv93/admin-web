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
@Table(name = "data_feeds")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DataFeeds.findAll", query = "SELECT d FROM DataFeeds d")
    , @NamedQuery(name = "DataFeeds.findByDatafeedId", query = "SELECT d FROM DataFeeds d WHERE d.datafeedId = :datafeedId")
    , @NamedQuery(name = "DataFeeds.findByCompanyId", query = "SELECT d FROM DataFeeds d WHERE d.companyId = :companyId")
    , @NamedQuery(name = "DataFeeds.findByExportLocation", query = "SELECT d FROM DataFeeds d WHERE d.exportLocation = :exportLocation")
    , @NamedQuery(name = "DataFeeds.findByExportByCron", query = "SELECT d FROM DataFeeds d WHERE d.exportByCron = :exportByCron")
    , @NamedQuery(name = "DataFeeds.findByFtpUrl", query = "SELECT d FROM DataFeeds d WHERE d.ftpUrl = :ftpUrl")
    , @NamedQuery(name = "DataFeeds.findByFtpUser", query = "SELECT d FROM DataFeeds d WHERE d.ftpUser = :ftpUser")
    , @NamedQuery(name = "DataFeeds.findByFtpPass", query = "SELECT d FROM DataFeeds d WHERE d.ftpPass = :ftpPass")
    , @NamedQuery(name = "DataFeeds.findByFileName", query = "SELECT d FROM DataFeeds d WHERE d.fileName = :fileName")
    , @NamedQuery(name = "DataFeeds.findByEnclosure", query = "SELECT d FROM DataFeeds d WHERE d.enclosure = :enclosure")
    , @NamedQuery(name = "DataFeeds.findByCsvDelimiter", query = "SELECT d FROM DataFeeds d WHERE d.csvDelimiter = :csvDelimiter")
    , @NamedQuery(name = "DataFeeds.findByExcludeDisabledProducts", query = "SELECT d FROM DataFeeds d WHERE d.excludeDisabledProducts = :excludeDisabledProducts")
    , @NamedQuery(name = "DataFeeds.findByExcludeSharedProducts", query = "SELECT d FROM DataFeeds d WHERE d.excludeSharedProducts = :excludeSharedProducts")
    , @NamedQuery(name = "DataFeeds.findBySaveDir", query = "SELECT d FROM DataFeeds d WHERE d.saveDir = :saveDir")
    , @NamedQuery(name = "DataFeeds.findByStatus", query = "SELECT d FROM DataFeeds d WHERE d.status = :status")
    , @NamedQuery(name = "DataFeeds.findByLayoutId", query = "SELECT d FROM DataFeeds d WHERE d.layoutId = :layoutId")})
public class DataFeeds implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "datafeed_id")
    private Integer datafeedId;
    @Basic(optional = false)
    @Column(name = "company_id")
    private int companyId;
    @Lob
    @Column(name = "categories")
    private String categories;
    @Lob
    @Column(name = "products")
    private String products;
    @Lob
    @Column(name = "fields")
    private String fields;
    @Basic(optional = false)
    @Column(name = "export_location")
    private Character exportLocation;
    @Basic(optional = false)
    @Column(name = "export_by_cron")
    private Character exportByCron;
    @Basic(optional = false)
    @Column(name = "ftp_url")
    private String ftpUrl;
    @Basic(optional = false)
    @Column(name = "ftp_user")
    private String ftpUser;
    @Basic(optional = false)
    @Column(name = "ftp_pass")
    private String ftpPass;
    @Basic(optional = false)
    @Column(name = "file_name")
    private String fileName;
    @Basic(optional = false)
    @Column(name = "enclosure")
    private Character enclosure;
    @Basic(optional = false)
    @Column(name = "csv_delimiter")
    private Character csvDelimiter;
    @Basic(optional = false)
    @Column(name = "exclude_disabled_products")
    private Character excludeDisabledProducts;
    @Basic(optional = false)
    @Column(name = "exclude_shared_products")
    private Character excludeSharedProducts;
    @Lob
    @Column(name = "export_options")
    private String exportOptions;
    @Basic(optional = false)
    @Column(name = "save_dir")
    private String saveDir;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "layout_id")
    private int layoutId;

    public DataFeeds() {
    }

    public DataFeeds(Integer datafeedId) {
        this.datafeedId = datafeedId;
    }

    public DataFeeds(Integer datafeedId, int companyId, Character exportLocation, Character exportByCron, String ftpUrl, String ftpUser, String ftpPass, String fileName, Character enclosure, Character csvDelimiter, Character excludeDisabledProducts, Character excludeSharedProducts, String saveDir, Character status, int layoutId) {
        this.datafeedId = datafeedId;
        this.companyId = companyId;
        this.exportLocation = exportLocation;
        this.exportByCron = exportByCron;
        this.ftpUrl = ftpUrl;
        this.ftpUser = ftpUser;
        this.ftpPass = ftpPass;
        this.fileName = fileName;
        this.enclosure = enclosure;
        this.csvDelimiter = csvDelimiter;
        this.excludeDisabledProducts = excludeDisabledProducts;
        this.excludeSharedProducts = excludeSharedProducts;
        this.saveDir = saveDir;
        this.status = status;
        this.layoutId = layoutId;
    }

    public Integer getDatafeedId() {
        return datafeedId;
    }

    public void setDatafeedId(Integer datafeedId) {
        this.datafeedId = datafeedId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public Character getExportLocation() {
        return exportLocation;
    }

    public void setExportLocation(Character exportLocation) {
        this.exportLocation = exportLocation;
    }

    public Character getExportByCron() {
        return exportByCron;
    }

    public void setExportByCron(Character exportByCron) {
        this.exportByCron = exportByCron;
    }

    public String getFtpUrl() {
        return ftpUrl;
    }

    public void setFtpUrl(String ftpUrl) {
        this.ftpUrl = ftpUrl;
    }

    public String getFtpUser() {
        return ftpUser;
    }

    public void setFtpUser(String ftpUser) {
        this.ftpUser = ftpUser;
    }

    public String getFtpPass() {
        return ftpPass;
    }

    public void setFtpPass(String ftpPass) {
        this.ftpPass = ftpPass;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Character getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(Character enclosure) {
        this.enclosure = enclosure;
    }

    public Character getCsvDelimiter() {
        return csvDelimiter;
    }

    public void setCsvDelimiter(Character csvDelimiter) {
        this.csvDelimiter = csvDelimiter;
    }

    public Character getExcludeDisabledProducts() {
        return excludeDisabledProducts;
    }

    public void setExcludeDisabledProducts(Character excludeDisabledProducts) {
        this.excludeDisabledProducts = excludeDisabledProducts;
    }

    public Character getExcludeSharedProducts() {
        return excludeSharedProducts;
    }

    public void setExcludeSharedProducts(Character excludeSharedProducts) {
        this.excludeSharedProducts = excludeSharedProducts;
    }

    public String getExportOptions() {
        return exportOptions;
    }

    public void setExportOptions(String exportOptions) {
        this.exportOptions = exportOptions;
    }

    public String getSaveDir() {
        return saveDir;
    }

    public void setSaveDir(String saveDir) {
        this.saveDir = saveDir;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public int getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(int layoutId) {
        this.layoutId = layoutId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (datafeedId != null ? datafeedId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataFeeds)) {
            return false;
        }
        DataFeeds other = (DataFeeds) object;
        if ((this.datafeedId == null && other.datafeedId != null) || (this.datafeedId != null && !this.datafeedId.equals(other.datafeedId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DataFeeds[ datafeedId=" + datafeedId + " ]";
    }
    
}
