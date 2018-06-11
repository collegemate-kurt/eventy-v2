package edu.calpoly.csc431.dao;

/**
 * @author Eric Jiang
 */
public interface User {
    User createUser(User user);

    User updateUser(User user);

    User getUser(String userId);

    User deleteUser(String userId);
}
