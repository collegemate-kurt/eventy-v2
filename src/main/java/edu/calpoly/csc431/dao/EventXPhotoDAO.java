package edu.calpoly.csc431.dao;

import java.util.List;

/**
 * @author Eric Jiang
 */
public interface EventXPhotoDAO {
    List<String> getPhotos(Integer eventId);

    void addPhoto(Integer eventId, String photoUrl);

    void deletePhoto(Integer eventId, String photoUrl);
}
