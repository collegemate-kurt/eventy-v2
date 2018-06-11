package edu.calpoly.csc431.dao;

import edu.calpoly.csc431.model.Event;
import edu.calpoly.csc431.model.User;

import java.util.List;

/**
 * @author Eric Jiang
 */
public interface UserXEventDAO {
    List<Event> getEvents(Integer userId);

    List<User> getMembers(Integer eventId);

    void add(Integer userId, Integer eventId);

    void delete(Integer userId, Integer eventId);

}
