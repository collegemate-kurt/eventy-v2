package edu.calpoly.csc431.dao;

import edu.calpoly.csc431.model.Event;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Eric Jiang
 */
@Repository
public class EventDAOImpl implements EventDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Event createEvent(Event event) {
        sessionFactory.getCurrentSession().saveOrUpdate(event);
        return event;
    }

    @Override
    public Event updateEvent(Event event) {
        sessionFactory.getCurrentSession().update(event);
        return event;
    }

    @Override
    public Event getEvent(Integer eventId) {
        return (Event) sessionFactory.getCurrentSession().get(Event.class, eventId);
    }

    @Override
    public Event deleteEvent(Integer eventId) {
        Event event = (Event) sessionFactory.getCurrentSession().get(Event.class, eventId);
        if (event != null) {
            sessionFactory.getCurrentSession().delete(event);
        }
        return event;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Event> getEvents() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Event")
                .list();
    }

}
