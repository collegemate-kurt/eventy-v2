package edu.calpoly.csc431.dao;

import edu.calpoly.csc431.model.EventRequest;

import java.util.List;

/**
 * @author Eric Jiang
 */
public interface EventRequestDAO {
    EventRequest addRequest(EventRequest request);

    EventRequest getRequest(Integer requestId);

    EventRequest updateRequest(EventRequest request);

    EventRequest deleteRequest(Integer requestId);

    List<EventRequest> getRequests(Integer eventId);
}
