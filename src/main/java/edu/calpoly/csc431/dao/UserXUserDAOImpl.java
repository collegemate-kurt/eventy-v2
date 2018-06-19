package edu.calpoly.csc431.dao;

import edu.calpoly.csc431.model.User;
import edu.calpoly.csc431.model.UserXUser;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Eric Jiang
 */
@Repository
public class UserXUserDAOImpl implements UserXUserDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addFollower(Integer userId, Integer followerId) {
        UserXUser userXUser = new UserXUser();
        userXUser.setUserId(userId);
        userXUser.setFollowerId(followerId);
        sessionFactory.getCurrentSession().saveOrUpdate(userXUser);
    }

    @Override
    public void deleteFollower(Integer userId, Integer followerId) {
        UserXUser userXUser = new UserXUser();
        userXUser.setUserId(userId);
        userXUser.setFollowerId(followerId);
        userXUser = (UserXUser) sessionFactory.getCurrentSession().get(UserXUser.class, userXUser);
        if (userXUser != null) {
            sessionFactory.getCurrentSession().delete(userXUser);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getFollowers(Integer userId) {
        String sql = "select *\n" +
                "from User\n" +
                "where id in (\n" +
                "  select followerId\n" +
                "  from UserXUser\n" +
                "  where userId = '" + userId + "'\n" +
                ")";
        Query query = sessionFactory.getCurrentSession().createSQLQuery(sql);
        return query.list();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getFollowings(Integer userId) {
        String sql = "select *\n" +
                "from User\n" +
                "where id in (\n" +
                "  select userId\n" +
                "  from UserXUser\n" +
                "  where followerId = '" + userId + "'\n" +
                ")";
        Query query = sessionFactory.getCurrentSession().createSQLQuery(sql);
        return query.list();
    }

}
