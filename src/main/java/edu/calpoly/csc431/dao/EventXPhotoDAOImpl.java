package edu.calpoly.csc431.dao;

import edu.calpoly.csc431.model.EventXPhoto;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Eric Jiang
 */
@Repository
public class EventXPhotoDAOImpl implements EventXPhotoDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public EventXPhoto createEventXPhoto(EventXPhoto eventXPhoto) {
        sessionFactory.getCurrentSession().saveOrUpdate(eventXPhoto);
        return eventXPhoto;
    }

    @Override
    public EventXPhoto updateEventXPhoto(EventXPhoto eventXPhoto) {
        sessionFactory.getCurrentSession().update(eventXPhoto);
        return eventXPhoto;
    }

    @Override
    public EventXPhoto getEventXPhoto(String id) {
        return (EventXPhoto) sessionFactory.getCurrentSession().get(EventXPhoto.class, id);
    }

    @Override
    public EventXPhoto deleteEventXPhoto(String id) {
        EventXPhoto xx = (EventXPhoto) sessionFactory.getCurrentSession().get(EventXPhoto.class, id);
        if (xx != null) {
            sessionFactory.getCurrentSession().delete(xx);
        }
        return xx;
    }
}
