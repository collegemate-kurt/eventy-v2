package edu.calpoly.csc431.dao;

/**
 * @author Eric Jiang
 */
public interface UserXEvent {
    UserXEvent createUserXEvent(UserXEvent userXEvent);

    UserXEvent updateUserXEvent(UserXEvent userXEvent);

    UserXEvent getUserXEvent(UserXEvent userXEvent);

    UserXEvent deleteUserEvent(UserXEvent userXEvent);
}
