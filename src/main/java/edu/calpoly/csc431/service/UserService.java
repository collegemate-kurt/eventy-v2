package edu.calpoly.csc431.service;

import edu.calpoly.csc431.model.Event;
import edu.calpoly.csc431.model.User;

import java.util.List;

/**
 * @author Eric Jiang
 */
public interface UserService {
    User addUser(String email, String firstName, String lastName);

    User updateUser(User user);

    User getUser(int userId);

    User deleteUser(int userId);

    List<User> getAllUsers();

    User addFollower(int userId, int followerId);

    User deleteFollower(int userId, int followerId);

    List<User> getFollowers(int userId);

    List<User> getFollowing(int userId);

    List<Event> getEvents(int userId);

    List<String> getPhotos(int userId);

    User addPhoto(int userId, String photoUrl);

    User deletePhoto(int userId, String photoUrl);
}
