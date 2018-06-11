package edu.calpoly.csc431.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Eric Jiang
 */
@Entity
@Table(name = "UserXPhoto")
public class UserXPhoto {
    @Column
    private String userId;

    @Column
    private String photoUrl;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

}
