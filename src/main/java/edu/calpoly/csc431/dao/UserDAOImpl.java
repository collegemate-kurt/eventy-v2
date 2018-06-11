package edu.calpoly.csc431.dao;

import edu.calpoly.csc431.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Eric Jiang
 */
@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User createUser(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
        return user;
    }

    @Override
    public User updateUser(User user) {
        sessionFactory.getCurrentSession().update(user);
        return user;
    }

    @Override
    public User getUser(String userId) {
        return (User) sessionFactory.getCurrentSession().get(User.class, userId);
    }

    @Override
    public User deleteUser(String userId) {
        User user = (User) sessionFactory.getCurrentSession().load(User.class, userId);
        if (user != null) {
            this.sessionFactory.getCurrentSession().delete(user);
        }
        return user;
    }

}