package edu.calpoly.csc431.dao;

import edu.calpoly.csc431.model.Event;
import edu.calpoly.csc431.model.User;
import edu.calpoly.csc431.model.UserXEvent;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Eric Jiang
 */
@Repository
public class UserXEventDAOImpl implements UserXEventDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("unchecked")
    public List<Event> getEvents(Integer userId) {
        String sql = "from Event\n" +
                "where id in (\n" +
                "  select eventId\n" +
                "  from UserXEvent\n" +
                "  where userId = " + userId + "\n" +
                ")";
        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        return query.list();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getMembers(Integer eventId) {
        String sql = "from User\n" +
                "where id in (\n" +
                "  select userId\n" +
                "  from UserXEvent\n" +
                "  where eventId = " + eventId + "\n" +
                ")";
        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        return query.list();
    }

    @Override
    public void add(Integer userId, Integer eventId) {
        UserXEvent userXEvent = new UserXEvent();
        userXEvent.setUserId(userId);
        userXEvent.setEventId(eventId);
        sessionFactory.getCurrentSession().saveOrUpdate(userXEvent);
    }

    @Override
    public void delete(Integer userId, Integer eventId) {
        UserXEvent userXEvent = new UserXEvent();
        userXEvent.setUserId(userId);
        userXEvent.setEventId(eventId);
        sessionFactory.getCurrentSession().delete(userXEvent);
    }

}
