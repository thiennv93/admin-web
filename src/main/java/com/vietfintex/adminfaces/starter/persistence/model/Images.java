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
@Table(name = "images")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Images.findAll", query = "SELECT i FROM Images i")
    , @NamedQuery(name = "Images.findByImageId", query = "SELECT i FROM Images i WHERE i.imageId = :imageId")
    , @NamedQuery(name = "Images.findByImagePath", query = "SELECT i FROM Images i WHERE i.imagePath = :imagePath")
    , @NamedQuery(name = "Images.findByImageX", query = "SELECT i FROM Images i WHERE i.imageX = :imageX")
    , @NamedQuery(name = "Images.findByImageY", query = "SELECT i FROM Images i WHERE i.imageY = :imageY")})
public class Images implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "image_id")
    private Integer imageId;
    @Basic(optional = false)
    @Column(name = "image_path")
    private String imagePath;
    @Basic(optional = false)
    @Column(name = "image_x")
    private int imageX;
    @Basic(optional = false)
    @Column(name = "image_y")
    private int imageY;

    public Images() {
    }

    public Images(Integer imageId) {
        this.imageId = imageId;
    }

    public Images(Integer imageId, String imagePath, int imageX, int imageY) {
        this.imageId = imageId;
        this.imagePath = imagePath;
        this.imageX = imageX;
        this.imageY = imageY;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getImageX() {
        return imageX;
    }

    public void setImageX(int imageX) {
        this.imageX = imageX;
    }

    public int getImageY() {
        return imageY;
    }

    public void setImageY(int imageY) {
        this.imageY = imageY;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imageId != null ? imageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Images)) {
            return false;
        }
        Images other = (Images) object;
        if ((this.imageId == null && other.imageId != null) || (this.imageId != null && !this.imageId.equals(other.imageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Images[ imageId=" + imageId + " ]";
    }
    
}
