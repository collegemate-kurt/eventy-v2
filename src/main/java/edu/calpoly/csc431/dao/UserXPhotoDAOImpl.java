package edu.calpoly.csc431.dao;

import edu.calpoly.csc431.model.UserXPhoto;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Eric Jiang
 */
@Repository
public class UserXPhotoDAOImpl implements UserXPhotoDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public UserXPhoto createUserXPhoto(UserXPhoto userXPhoto) {
        sessionFactory.getCurrentSession().saveOrUpdate(userXPhoto);
        return userXPhoto;
    }

    @Override
    public UserXPhoto updateUserXPhoto(UserXPhoto userXPhoto) {
        sessionFactory.getCurrentSession().update(userXPhoto);
        return userXPhoto;
    }

    @Override
    public UserXPhoto getUserXPhoto(String id) {
        return (UserXPhoto) sessionFactory.getCurrentSession().get(UserXPhoto.class, id);
    }

    @Override
    public UserXPhoto deleteUserXPhoto(String id) {
        UserXPhoto photo = (UserXPhoto) sessionFactory.getCurrentSession().get(UserXPhoto.class, id);
        if (photo != null) {
            sessionFactory.getCurrentSession().delete(photo);
        }
        return photo;
    }

}
