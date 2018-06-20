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
@Table(name = "product_files")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductFiles.findAll", query = "SELECT p FROM ProductFiles p")
    , @NamedQuery(name = "ProductFiles.findByFileId", query = "SELECT p FROM ProductFiles p WHERE p.fileId = :fileId")
    , @NamedQuery(name = "ProductFiles.findByFolderId", query = "SELECT p FROM ProductFiles p WHERE p.folderId = :folderId")
    , @NamedQuery(name = "ProductFiles.findByProductId", query = "SELECT p FROM ProductFiles p WHERE p.productId = :productId")
    , @NamedQuery(name = "ProductFiles.findByFilePath", query = "SELECT p FROM ProductFiles p WHERE p.filePath = :filePath")
    , @NamedQuery(name = "ProductFiles.findByPreviewPath", query = "SELECT p FROM ProductFiles p WHERE p.previewPath = :previewPath")
    , @NamedQuery(name = "ProductFiles.findByFileSize", query = "SELECT p FROM ProductFiles p WHERE p.fileSize = :fileSize")
    , @NamedQuery(name = "ProductFiles.findByPreviewSize", query = "SELECT p FROM ProductFiles p WHERE p.previewSize = :previewSize")
    , @NamedQuery(name = "ProductFiles.findByAgreement", query = "SELECT p FROM ProductFiles p WHERE p.agreement = :agreement")
    , @NamedQuery(name = "ProductFiles.findByMaxDownloads", query = "SELECT p FROM ProductFiles p WHERE p.maxDownloads = :maxDownloads")
    , @NamedQuery(name = "ProductFiles.findByTotalDownloads", query = "SELECT p FROM ProductFiles p WHERE p.totalDownloads = :totalDownloads")
    , @NamedQuery(name = "ProductFiles.findByActivationType", query = "SELECT p FROM ProductFiles p WHERE p.activationType = :activationType")
    , @NamedQuery(name = "ProductFiles.findByPosition", query = "SELECT p FROM ProductFiles p WHERE p.position = :position")
    , @NamedQuery(name = "ProductFiles.findByStatus", query = "SELECT p FROM ProductFiles p WHERE p.status = :status")})
public class ProductFiles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "file_id")
    private Integer fileId;
    @Column(name = "folder_id")
    private Integer folderId;
    @Basic(optional = false)
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @Column(name = "file_path")
    private String filePath;
    @Basic(optional = false)
    @Column(name = "preview_path")
    private String previewPath;
    @Basic(optional = false)
    @Column(name = "file_size")
    private long fileSize;
    @Basic(optional = false)
    @Column(name = "preview_size")
    private int previewSize;
    @Basic(optional = false)
    @Column(name = "agreement")
    private Character agreement;
    @Basic(optional = false)
    @Column(name = "max_downloads")
    private short maxDownloads;
    @Basic(optional = false)
    @Column(name = "total_downloads")
    private short totalDownloads;
    @Basic(optional = false)
    @Column(name = "activation_type")
    private Character activationType;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;

    public ProductFiles() {
    }

    public ProductFiles(Integer fileId) {
        this.fileId = fileId;
    }

    public ProductFiles(Integer fileId, int productId, String filePath, String previewPath, long fileSize, int previewSize, Character agreement, short maxDownloads, short totalDownloads, Character activationType, short position, Character status) {
        this.fileId = fileId;
        this.productId = productId;
        this.filePath = filePath;
        this.previewPath = previewPath;
        this.fileSize = fileSize;
        this.previewSize = previewSize;
        this.agreement = agreement;
        this.maxDownloads = maxDownloads;
        this.totalDownloads = totalDownloads;
        this.activationType = activationType;
        this.position = position;
        this.status = status;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Integer getFolderId() {
        return folderId;
    }

    public void setFolderId(Integer folderId) {
        this.folderId = folderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getPreviewPath() {
        return previewPath;
    }

    public void setPreviewPath(String previewPath) {
        this.previewPath = previewPath;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public int getPreviewSize() {
        return previewSize;
    }

    public void setPreviewSize(int previewSize) {
        this.previewSize = previewSize;
    }

    public Character getAgreement() {
        return agreement;
    }

    public void setAgreement(Character agreement) {
        this.agreement = agreement;
    }

    public short getMaxDownloads() {
        return maxDownloads;
    }

    public void setMaxDownloads(short maxDownloads) {
        this.maxDownloads = maxDownloads;
    }

    public short getTotalDownloads() {
        return totalDownloads;
    }

    public void setTotalDownloads(short totalDownloads) {
        this.totalDownloads = totalDownloads;
    }

    public Character getActivationType() {
        return activationType;
    }

    public void setActivationType(Character activationType) {
        this.activationType = activationType;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fileId != null ? fileId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFiles)) {
            return false;
        }
        ProductFiles other = (ProductFiles) object;
        if ((this.fileId == null && other.fileId != null) || (this.fileId != null && !this.fileId.equals(other.fileId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductFiles[ fileId=" + fileId + " ]";
    }
    
}
