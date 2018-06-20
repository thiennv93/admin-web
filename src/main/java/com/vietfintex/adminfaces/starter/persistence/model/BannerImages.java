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
@Table(name = "banner_images")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BannerImages.findAll", query = "SELECT b FROM BannerImages b")
    , @NamedQuery(name = "BannerImages.findByBannerImageId", query = "SELECT b FROM BannerImages b WHERE b.bannerImageId = :bannerImageId")
    , @NamedQuery(name = "BannerImages.findByBannerId", query = "SELECT b FROM BannerImages b WHERE b.bannerId = :bannerId")
    , @NamedQuery(name = "BannerImages.findByLangCode", query = "SELECT b FROM BannerImages b WHERE b.langCode = :langCode")})
public class BannerImages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "banner_image_id")
    private Integer bannerImageId;
    @Basic(optional = false)
    @Column(name = "banner_id")
    private int bannerId;
    @Basic(optional = false)
    @Column(name = "lang_code")
    private String langCode;

    public BannerImages() {
    }

    public BannerImages(Integer bannerImageId) {
        this.bannerImageId = bannerImageId;
    }

    public BannerImages(Integer bannerImageId, int bannerId, String langCode) {
        this.bannerImageId = bannerImageId;
        this.bannerId = bannerId;
        this.langCode = langCode;
    }

    public Integer getBannerImageId() {
        return bannerImageId;
    }

    public void setBannerImageId(Integer bannerImageId) {
        this.bannerImageId = bannerImageId;
    }

    public int getBannerId() {
        return bannerId;
    }

    public void setBannerId(int bannerId) {
        this.bannerId = bannerId;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bannerImageId != null ? bannerImageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BannerImages)) {
            return false;
        }
        BannerImages other = (BannerImages) object;
        if ((this.bannerImageId == null && other.bannerImageId != null) || (this.bannerImageId != null && !this.bannerImageId.equals(other.bannerImageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BannerImages[ bannerImageId=" + bannerImageId + " ]";
    }
    
}
