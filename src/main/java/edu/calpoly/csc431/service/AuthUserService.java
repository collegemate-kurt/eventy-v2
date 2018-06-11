package edu.calpoly.csc431.service;

import edu.calpoly.csc431.model.AuthUser;

/**
 * @author Eric Jiang
 */
public interface AuthUserService {
    AuthUser signUp(AuthUser user);

    AuthUser login(String email, String password);
}
