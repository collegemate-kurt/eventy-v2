package edu.calpoly.csc431.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Eric Jiang
 */
@Entity
@Table(name = "User")
public class User implements Serializable  {
    private static final long serialVersionUID = -4036038806071197703L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String photoUrl;

    @Column
    private String region;

    @Column
    private String email;

    @Column
    private String locationGeo; // TODO: change to geometry

    @Column
    private String dob; // TODO: change to date

    @Column
    private String gender; // TODO: change to enum

    @Column
    private String description;


    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLocationGeo(String locationGeo) {
        this.locationGeo = locationGeo;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
