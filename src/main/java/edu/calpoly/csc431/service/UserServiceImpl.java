package edu.calpoly.csc431.service;

import edu.calpoly.csc431.dao.UserDAO;
import edu.calpoly.csc431.dao.UserXEventDAO;
import edu.calpoly.csc431.dao.UserXPhotoDAO;
import edu.calpoly.csc431.dao.UserXUserDAO;
import edu.calpoly.csc431.model.Event;
import edu.calpoly.csc431.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Eric Jiang
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private UserXUserDAO userXUserDAO;
    @Autowired
    private UserXEventDAO userXEventDAO;
    @Autowired
    private UserXPhotoDAO userXPhoto;

    @Override
    @Transactional
    public User addUser(User user) {
        return userDAO.createUser(user);
    }

    @Override
    @Transactional
    public User updateUser(User user) {
        return userDAO.updateUser(user);
    }

    @Override
    @Transactional
    public User getUser(int userId) {
        return userDAO.getUser(userId);
    }

    @Override
    @Transactional
    public User deleteUser(int userId) {
        return userDAO.deleteUser(userId);
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    @Transactional
    public User addFollower(int userId, int followerId) {
        userXUserDAO.addFollower(userId, followerId);
        return userDAO.getUser(userId);
    }

    @Override
    @Transactional
    public User deleteFollower(int userId, int followerId) {
        userXUserDAO.deleteFollower(userId, followerId);
        return userDAO.getUser(userId);
    }

    @Override
    @Transactional
    public List<User> getFollowers(int userId) {
        return userXUserDAO.getFollowers(userId);
    }

    @Override
    @Transactional
    public List<User> getFollowing(int userId) {
        return userXUserDAO.getFollowings(userId);
    }

    @Override
    @Transactional
    public List<Event> getEvents(int userId) {
        return userXEventDAO.getEvents(userId);
    }

    @Override
    @Transactional
    public List<String> getPhotos(int userId) {
        return userXPhoto.getPhotos(userId);
    }

    @Override
    @Transactional
    public User addPhoto(int userId, String photoUrl) {
        userXPhoto.addPhoto(userId, photoUrl);
        return userDAO.getUser(userId);
    }

    @Override
    @Transactional
    public User deletePhoto(int userId, String photoUrl) {
        userXPhoto.deletePhoto(userId, photoUrl);
        return userDAO.getUser(userId);
    }

}
