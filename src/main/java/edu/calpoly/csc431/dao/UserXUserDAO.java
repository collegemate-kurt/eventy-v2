package edu.calpoly.csc431.dao;

import edu.calpoly.csc431.model.User;

import java.util.List;

/**
 * @author Eric Jiang
 */
public interface UserXUserDAO {
    void addFollower(Integer userId, Integer followerId);

    void deleteFollower(Integer userId, Integer followerId);

    List<User> getFollowers(Integer userId);

    List<User> getFollowings(Integer userId);
}
