package edu.calpoly.csc431.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Eric Jiang
 */
@Entity
@Table(name = "UserXEvent")
public class UserXEvent {
    @Column
    private String userId;

    @Column
    private String eventId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
}
