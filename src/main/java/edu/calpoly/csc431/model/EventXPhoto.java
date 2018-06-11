package edu.calpoly.csc431.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Eric Jiang
 */
@Entity
@Table(name = "EventXPhotoDAO")
public class EventXPhoto implements Serializable {
    private static final long serialVersionUID = -9043848662765656483L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private int eventId;

    @Column
    private String photoUrl;

    public int getEventId() {
        return eventId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(table = "Event", name = "id")
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

}
