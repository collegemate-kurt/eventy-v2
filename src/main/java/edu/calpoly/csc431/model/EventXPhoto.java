package edu.calpoly.csc431.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Eric Jiang
 */
@Entity
@Table(name = "EventXPhoto")
public class EventXPhoto {

    @Column
    private String eventId;

    @Column
    private String photoUrl;

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
