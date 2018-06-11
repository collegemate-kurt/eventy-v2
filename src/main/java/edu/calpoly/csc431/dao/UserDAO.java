package edu.calpoly.csc431.dao;

import edu.calpoly.csc431.model.User;

import java.util.List;

/**
 * @author Eric Jiang
 */
public interface UserDAO {
    User createUser(User user);

    User updateUser(User user);

    User getUser(Integer userId);

    User deleteUser(Integer userId);

    List<User> getAllUsers();
}
