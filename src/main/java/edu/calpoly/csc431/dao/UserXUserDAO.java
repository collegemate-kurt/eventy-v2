package edu.calpoly.csc431.dao;

import edu.calpoly.csc431.model.UserXUser;

/**
 * @author Eric Jiang
 */
public interface UserXUserDAO {
    UserXUser createUserXUser(UserXUser userXUser);

    UserXUser updateUserXUser(UserXUser userXUser);

    UserXUser getUserXUser(String id);

    UserXUser deleteUserXUser(String id);
}
