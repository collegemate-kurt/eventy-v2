package edu.calpoly.csc431.dao;

import edu.calpoly.csc431.model.EventRequest;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Eric Jiang
 */
@Repository
public class EventRequestDAOImpl implements EventRequestDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public EventRequest addRequest(EventRequest request) {
        sessionFactory.getCurrentSession().saveOrUpdate(request);
        return request;
    }

    @Override
    public EventRequest getRequest(Integer requestId) {
        return (EventRequest) sessionFactory.getCurrentSession().get(EventRequest.class, requestId);
    }

    @Override
    public EventRequest updateRequest(EventRequest request) {
        sessionFactory.getCurrentSession().update(request);
        return request;
    }

    @Override
    public EventRequest deleteRequest(Integer requestId) {
        EventRequest request = (EventRequest) sessionFactory.getCurrentSession().get(EventRequest.class, requestId);
        if (request != null) {
            sessionFactory.getCurrentSession().delete(request);
        }
        return request;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<EventRequest> getRequests(Integer eventId) {
        String sql = "select *\n" +
                "from EventRequest\n" +
                "where eventId = :eventId";
        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        query.setParameter("eventId", eventId);
        return query.list();
    }

}
