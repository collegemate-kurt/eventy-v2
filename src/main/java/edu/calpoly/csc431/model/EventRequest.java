package edu.calpoly.csc431.model;

import javax.persistence.*;

/**
 * @author Eric Jiang
 */
@Entity
@Table(name = "EventRequest")
public class EventRequest {
    // TODO: change serialVersion
    private static final long serialVersionUID = -3465813074586302847L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String eventId;

    @Column
    private String userId;

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

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public void setUserId(String userId) {
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
