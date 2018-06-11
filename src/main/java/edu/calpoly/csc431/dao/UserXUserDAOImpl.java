package edu.calpoly.csc431.dao;

import edu.calpoly.csc431.model.UserXUser;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Eric Jiang
 */
@Repository
public class UserXUserDAOImpl implements UserXUserDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public UserXUser createUserXUser(UserXUser userXUser) {
        sessionFactory.getCurrentSession().saveOrUpdate(userXUser);
        return userXUser;
    }

    @Override
    public UserXUser updateUserXUser(UserXUser userXUser) {
        sessionFactory.getCurrentSession().update(userXUser);
        return userXUser;
    }

    @Override
    public UserXUser getUserXUser(String id) {
        return (UserXUser) sessionFactory.getCurrentSession().get(UserXUser.class, id);
    }

    @Override
    public UserXUser deleteUserXUser(String id) {
        UserXUser userXUser = (UserXUser) sessionFactory.getCurrentSession().get(UserXUser.class, id);
        if (userXUser != null) {
            sessionFactory.getCurrentSession().delete(userXUser);
        }
        return userXUser;
    }
}
