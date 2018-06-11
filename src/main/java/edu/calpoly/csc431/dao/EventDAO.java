package edu.calpoly.csc431.dao;

import edu.calpoly.csc431.model.Event;

import java.util.List;

/**
 * @author Eric Jiang
 */
public interface EventDAO {
    Event createEvent(Event event);

    Event updateEvent(Event event);

    Event getEvent(String eventId);

    Event deleteEvent(String eventId);

    List<Event> getEvents();
}
