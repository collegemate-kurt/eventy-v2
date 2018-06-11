package edu.calpoly.csc431.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Eric Jiang
 */
@Entity
@Table(name = "UserXEvent")
public class UserXEvent implements Serializable {
    private static final long serialVersionUID = -8209429971406939627L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private int userId;

    @Column
    private int eventId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }
}
