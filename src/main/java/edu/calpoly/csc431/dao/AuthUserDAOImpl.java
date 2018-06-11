package edu.calpoly.csc431.dao;

import edu.calpoly.csc431.model.AuthUser;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Eric Jiang
 */
@Repository
public class AuthUserDAOImpl implements AuthUserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public AuthUser createAuthUser(AuthUser authUser) {
        sessionFactory.getCurrentSession().saveOrUpdate(authUser);
        return authUser;
    }

    @Override
    public AuthUser getAuthUser(String userId) {
        return (AuthUser) sessionFactory.getCurrentSession().get(AuthUser.class, userId);
    }

    @Override
    public AuthUser updateAuthUser(AuthUser authUser) {
        sessionFactory.getCurrentSession().update(authUser);
        return authUser;
    }

    @Override
    public AuthUser deleteAuthUser(String userId) {
        AuthUser user = (AuthUser) sessionFactory.getCurrentSession().get(AuthUser.class, userId);
        if (user != null) {
            sessionFactory.getCurrentSession().delete(user);
        }
        return user;
    }
}
