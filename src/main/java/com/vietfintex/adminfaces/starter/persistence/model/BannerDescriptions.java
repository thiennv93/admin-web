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
@Table(name = "banner_descriptions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BannerDescriptions.findAll", query = "SELECT b FROM BannerDescriptions b")
    , @NamedQuery(name = "BannerDescriptions.findByBannerId", query = "SELECT b FROM BannerDescriptions b WHERE b.bannerDescriptionsPK.bannerId = :bannerId")
    , @NamedQuery(name = "BannerDescriptions.findByBanner", query = "SELECT b FROM BannerDescriptions b WHERE b.banner = :banner")
    , @NamedQuery(name = "BannerDescriptions.findByUrl", query = "SELECT b FROM BannerDescriptions b WHERE b.url = :url")
    , @NamedQuery(name = "BannerDescriptions.findByLangCode", query = "SELECT b FROM BannerDescriptions b WHERE b.bannerDescriptionsPK.langCode = :langCode")})
public class BannerDescriptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BannerDescriptionsPK bannerDescriptionsPK;
    @Basic(optional = false)
    @Column(name = "banner")
    private String banner;
    @Basic(optional = false)
    @Column(name = "url")
    private String url;
    @Lob
    @Column(name = "description")
    private String description;

    public BannerDescriptions() {
    }

    public BannerDescriptions(BannerDescriptionsPK bannerDescriptionsPK) {
        this.bannerDescriptionsPK = bannerDescriptionsPK;
    }

    public BannerDescriptions(BannerDescriptionsPK bannerDescriptionsPK, String banner, String url) {
        this.bannerDescriptionsPK = bannerDescriptionsPK;
        this.banner = banner;
        this.url = url;
    }

    public BannerDescriptions(int bannerId, String langCode) {
        this.bannerDescriptionsPK = new BannerDescriptionsPK(bannerId, langCode);
    }

    public BannerDescriptionsPK getBannerDescriptionsPK() {
        return bannerDescriptionsPK;
    }

    public void setBannerDescriptionsPK(BannerDescriptionsPK bannerDescriptionsPK) {
        this.bannerDescriptionsPK = bannerDescriptionsPK;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bannerDescriptionsPK != null ? bannerDescriptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BannerDescriptions)) {
            return false;
        }
        BannerDescriptions other = (BannerDescriptions) object;
        if ((this.bannerDescriptionsPK == null && other.bannerDescriptionsPK != null) || (this.bannerDescriptionsPK != null && !this.bannerDescriptionsPK.equals(other.bannerDescriptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BannerDescriptions[ bannerDescriptionsPK=" + bannerDescriptionsPK + " ]";
    }
    
}
