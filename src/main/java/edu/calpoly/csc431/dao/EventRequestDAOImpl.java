package edu.calpoly.csc431.dao;

import edu.calpoly.csc431.model.EventRequest;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Eric Jiang
 */
@Repository
public class EventRequestDAOImpl implements EventRequestDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public EventRequest createRequest(EventRequest request) {
        sessionFactory.getCurrentSession().saveOrUpdate(request);
        return request;
    }

    @Override
    public EventRequest updateRequest(EventRequest request) {
        sessionFactory.getCurrentSession().update(request);
        return request;
    }

    @Override
    public EventRequest getRequest(String requestId) {
        return (EventRequest) sessionFactory.getCurrentSession().get(EventRequest.class, requestId);
    }

    @Override
    public EventRequest deleteRequest(String requestId) {
        EventRequest request = (EventRequest) sessionFactory.getCurrentSession().get(EventRequest.class, requestId);
        if (request != null) {
            sessionFactory.getCurrentSession().delete(request);
        }
        return request;
    }

}
