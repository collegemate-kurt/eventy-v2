package edu.calpoly.csc431.dao;

import edu.calpoly.csc431.model.User;

/**
 * @author Eric Jiang
 */
public interface UserDAO {
    User createUser(User userDAO);

    User updateUser(User
                               userDAO);

    User getUser(String userId);

    User deleteUser(String userId);
}
