package edu.calpoly.csc431.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Eric Jiang
 */
@Entity
@Table(name = "Event")
public class Event implements Serializable {
    private static final long serialVersionUID = -2362311051806054479L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String title;

    @Column
    private String category; // enum: see

    @Column
    private int memberCount;

    @Column
    private String locationGeo; // geometry

    @Column
    private String locationText;

    @Column
    private String region;

    @Column
    private String startTime;

    @Column
    private String endTime;

    @Column
    private String day;

    @Column
    private String photoUrl;

    @Column
    private String description;

    @Column
    private String requirement;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocationGeo() {
        return locationGeo;
    }

    public void setLocationGeo(String locationGeo) {
        this.locationGeo = locationGeo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }

    public String getLocationText() {
        return locationText;
    }

    public void setLocationText(String locationText) {
        this.locationText = locationText;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
