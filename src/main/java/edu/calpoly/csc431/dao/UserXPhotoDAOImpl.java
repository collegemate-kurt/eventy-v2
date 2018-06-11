package edu.calpoly.csc431.dao;

import edu.calpoly.csc431.model.UserXPhoto;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author Eric Jiang
 */
@Repository
public class UserXPhotoDAOImpl implements UserXPhotoDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addPhoto(Integer userId, String photoUrl) {
        UserXPhoto userXPhoto = new UserXPhoto();
        userXPhoto.setUserId(userId);
        userXPhoto.setPhotoUrl(photoUrl);
        sessionFactory.getCurrentSession().saveOrUpdate(userXPhoto);
    }

    @Override
    public void deletePhoto(Integer userId, String photoUrl) {
        UserXPhoto userXPhoto = new UserXPhoto();
        userXPhoto.setUserId(userId);
        userXPhoto.setPhotoUrl(photoUrl);
        sessionFactory.getCurrentSession().delete(userXPhoto);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<String> getPhotos(Integer userId) {
        String sql = "select photoUrl\n" +
                "from UserXPhoto\n" +
                "where userId = :userId";
        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        query.setParameter("userId", userId);
        return query.list();
    }

}
