package edu.calpoly.csc431.dao;

import edu.calpoly.csc431.model.UserXPhoto;

/**
 * @author Eric Jiang
 */
public interface UserXPhotoDAO {
    UserXPhoto createUserXPhoto(UserXPhoto userXPhoto);

    UserXPhoto updateUserXPhoto(UserXPhoto userXPhoto);

    UserXPhoto getUserXPhoto(String id);

    UserXPhoto deleteUserXPhoto(String id);
}
