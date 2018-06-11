package edu.calpoly.csc431.dao;

import edu.calpoly.csc431.model.UserXEvent;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Eric Jiang
 */
@Repository
public class UserXEventDAOImpl implements UserXEventDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public UserXEvent createUserXEvent(UserXEvent userXEvent) {
        sessionFactory.getCurrentSession().saveOrUpdate(userXEvent);
        return userXEvent;
    }

    @Override
    public UserXEvent updateUserXEvent(UserXEvent userXEvent) {
        sessionFactory.getCurrentSession().update(userXEvent);
        return userXEvent;
    }

    @Override
    public UserXEvent getUserXEvent(String id) {
        return (UserXEvent) sessionFactory.getCurrentSession().get(UserXEvent.class, id);
    }

    @Override
    public UserXEvent deleteUserEvent(String id) {
        UserXEvent event = (UserXEvent) sessionFactory.getCurrentSession().get(UserXEvent.class, id);
        if (event != null) {
            sessionFactory.getCurrentSession().delete(event);
        }
        return event;
    }

}
