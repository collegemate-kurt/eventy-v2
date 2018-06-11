package edu.calpoly.csc431.dao;

import edu.calpoly.csc431.model.EventXPhoto;

/**
 * @author Eric Jiang
 */
public interface EventXPhotoDAO {
    EventXPhoto createEventXPhoto(EventXPhoto eventXPhoto);

    EventXPhoto updateEventXPhoto(EventXPhoto eventXPhoto);

    EventXPhoto getEventXPhoto(String id);

    EventXPhoto deleteEventXPhoto(String id);
}
