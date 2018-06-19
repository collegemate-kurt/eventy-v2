package edu.calpoly.csc431.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Eric Jiang
 */
@Entity
@Table(name = "UserXUser")
public class UserXUser implements Serializable {
    private static final long serialVersionUID = -2191213659394281840L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private int userId;

    @Column
    private int followerId;


    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public int getFollowerId() {
        return followerId;
    }

    public void setFollowerId(Integer followerId) {
        this.followerId = followerId;
    }

}
