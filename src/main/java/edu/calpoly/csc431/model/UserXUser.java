package edu.calpoly.csc431.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Eric Jiang
 */
@Entity
@Table(name = "UserXUser")
public class UserXUser {
    @Column
    private String userId;

    @Column
    private String followerId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFollowerId() {
        return followerId;
    }

    public void setFollowerId(String followerId) {
        this.followerId = followerId;
    }
}
