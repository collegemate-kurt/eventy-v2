package edu.calpoly.csc431.service;

import edu.calpoly.csc431.dao.EventDAO;
import edu.calpoly.csc431.dao.EventRequestDAO;
import edu.calpoly.csc431.dao.EventXPhotoDAO;
import edu.calpoly.csc431.dao.UserXEventDAO;
import edu.calpoly.csc431.model.Event;
import edu.calpoly.csc431.model.EventRequest;
import edu.calpoly.csc431.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Eric Jiang
 */
@Service
@Transactional
public class EventServiceImpl implements EventService {
    @Autowired
    private EventDAO eventDAO;
    @Autowired
    private UserXEventDAO userXEventDAO;
    @Autowired
    private EventXPhotoDAO eventXPhotoDAO;
    @Autowired
    private EventRequestDAO eventRequestDAO;


    @Override
    @Transactional
    public Event addEvent(Event event) {
        return eventDAO.createEvent(event);
    }

    @Override
    @Transactional
    public Event getEvent(int eventId) {
        return eventDAO.getEvent(eventId);
    }

    @Override
    @Transactional
    public Event deleteEvent(int eventId) {
        return eventDAO.deleteEvent(eventId);
    }

    @Override
    @Transactional
    public List<User> getMembers(int eventId) {
        return userXEventDAO.getMembers(eventId);
    }

    @Override
    @Transactional
    public Event addMember(int eventId, int userId) {
        userXEventDAO.add(userId, eventId);
        return eventDAO.getEvent(eventId);
    }

    @Override
    @Transactional
    public Event deleteMember(int eventId, int userId) {
        userXEventDAO.delete(userId, eventId);
        return eventDAO.getEvent(eventId);
    }

    @Override
    @Transactional
    public List<String> getPhotos(int eventId) {
        return eventXPhotoDAO.getPhotos(eventId);
    }

    @Override
    @Transactional
    public Event addPhoto(int eventId, String photoUrl) {
        eventXPhotoDAO.addPhoto(eventId, photoUrl);
        return eventDAO.getEvent(eventId);
    }

    @Override
    @Transactional
    public Event deletePhoto(int eventId, String photoUrl) {
        eventXPhotoDAO.deletePhoto(eventId, photoUrl);
        return eventDAO.getEvent(eventId);
    }

    @Override
    @Transactional
    public List<EventRequest> getRequests(int eventId) {
        return eventRequestDAO.getRequests(eventId);
    }

    @Override
    @Transactional
    public EventRequest addRequest(EventRequest request) {
        return eventRequestDAO.addRequest(request);
    }

    @Override
    @Transactional
    public EventRequest updateRequest(EventRequest request) {
        return eventRequestDAO.updateRequest(request);
    }

    @Override
    @Transactional
    public EventRequest deleteRequest(int requestId) {
        return eventRequestDAO.deleteRequest(requestId);
    }

    @Override
    @Transactional
    public List<Event> queryEvents() {
        return null;
    }

}
