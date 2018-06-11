package edu.calpoly.csc431.dao;

import edu.calpoly.csc431.model.AuthUser;

/**
 * @author Eric Jiang
 */
public interface AuthUserDAO {
    AuthUser createAuthUser(AuthUser authUser);

    AuthUser getAuthUser(String email);

    AuthUser updateAuthUser(AuthUser authUser);

    AuthUser deleteAuthUser(String userId);
}
