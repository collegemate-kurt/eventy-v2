package edu.calpoly.csc431.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Eric Jiang
 */
@Entity
@Table(name = "EventRequestDAO")
public class EventRequest implements Serializable {

    private static final long serialVersionUID = -3529545552547437595L;

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private int eventId;

    @Column
    private int userId;

    @Column
    private String comment;

    @Column
    private String response;

    @Column
    private String createTime;

    @Column
    private String type;


    public void setId(int id) {
        this.id = id;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setType(String type) {
        this.type = type;
    }
}
