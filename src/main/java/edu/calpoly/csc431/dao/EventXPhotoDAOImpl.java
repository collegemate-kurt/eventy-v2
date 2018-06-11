package edu.calpoly.csc431.dao;

import edu.calpoly.csc431.model.EventXPhoto;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Eric Jiang
 */
@Repository
public class EventXPhotoDAOImpl implements EventXPhotoDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("unchecked")
    public List<String> getPhotos(Integer eventId) {
        String sql = "select photoUrl\n" +
                "from EventXPhoto\n" +
                "where eventId = :eventId";
        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        query.setParameter("eventId", eventId);
        return query.list();
    }

    @Override
    public void addPhoto(Integer eventId, String photoUrl) {
        EventXPhoto eventXPhoto = new EventXPhoto();
        eventXPhoto.setEventId(eventId);
        eventXPhoto.setPhotoUrl(photoUrl);
        sessionFactory.getCurrentSession().saveOrUpdate(eventXPhoto);
    }

    @Override
    public void deletePhoto(Integer eventId, String photoUrl) {
        EventXPhoto eventXPhoto = new EventXPhoto();
        eventXPhoto.setEventId(eventId);
        eventXPhoto.setPhotoUrl(photoUrl);
        sessionFactory.getCurrentSession().delete(eventXPhoto);
    }

}
