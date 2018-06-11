package edu.calpoly.csc431.dao;

import java.util.List;

/**
 * @author Eric Jiang
 */
public interface UserXPhotoDAO {
    void addPhoto(Integer userId, String photoUrl);

    void deletePhoto(Integer userId, String photoUrl);

    List<String> getPhotos(Integer userId);
}
