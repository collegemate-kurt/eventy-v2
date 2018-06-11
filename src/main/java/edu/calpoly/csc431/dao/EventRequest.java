package edu.calpoly.csc431.dao;

/**
 * @author Eric Jiang
 */
public interface EventRequest {
    EventRequest createRequest(EventRequest request);

    EventRequest updateRequest(EventRequest request);

    EventRequest getRequest(String requestId);

    EventRequest deleteRequest(String requestId);
}
