package edu.calpoly.csc431.dao;

import edu.calpoly.csc431.model.EventRequest;

/**
 * @author Eric Jiang
 */
public interface EventRequestDAO {
    EventRequest createRequest(EventRequest request);

    EventRequest updateRequest(EventRequest request);

    EventRequest getRequest(String requestId);

    EventRequest deleteRequest(String requestId);
}
