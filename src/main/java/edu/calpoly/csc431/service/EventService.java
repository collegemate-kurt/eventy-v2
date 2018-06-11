package edu.calpoly.csc431.service;

import edu.calpoly.csc431.model.Event;
import edu.calpoly.csc431.model.EventRequest;
import edu.calpoly.csc431.model.User;

import java.util.List;


/**
 * @author Eric Jiang
 */
public interface EventService {
    Event addEvent(Event event);

    Event getEvent(int eventId);

    Event deleteEvent(int eventId);

    List<User> getMembers(int eventId);

    Event addMember(int eventId, int userId);

    Event deleteMember(int eventId, int userId);

    List<String> getPhotos(int eventId);

    Event addPhoto(int eventId, String photoUrl);

    Event deletePhoto(int eventId, String photoUrl);

    List<EventRequest> getRequests(int eventId);

    EventRequest addRequest(EventRequest request);

    EventRequest updateRequest(EventRequest request);

    EventRequest deleteRequest(int requestId);

    List<Event> queryEvents();
}
