package edu.calpoly.csc431.dao;

import edu.calpoly.csc431.model.UserXEvent;

/**
 * @author Eric Jiang
 */
public interface UserXEventDAO {
    UserXEvent createUserXEvent(UserXEvent userXEvent);

    UserXEvent updateUserXEvent(UserXEvent userXEvent);

    UserXEvent getUserXEvent(String id);

    UserXEvent deleteUserEvent(String id);
}
