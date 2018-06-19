package edu.calpoly.csc431.service;

import edu.calpoly.csc431.model.User;

/**
 * @author Eric Jiang
 */
public interface AuthUserService {

    User signUp(User user);

    User login(String email, String password);
}
