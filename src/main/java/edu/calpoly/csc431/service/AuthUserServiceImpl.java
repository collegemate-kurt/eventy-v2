package edu.calpoly.csc431.service;

import edu.calpoly.csc431.dao.UserDAO;
import edu.calpoly.csc431.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

/**
 * @author Eric Jiang
 */
@Service
@Transactional
public class AuthUserServiceImpl implements AuthUserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional
    public User signUp(User user) {
        user = userDAO.createUser(user);
        return user;
    }

    @Override
    @Transactional
    public User login(String email, String password) {
        User loggedInUser = userDAO.getUserByEmail(email);
        if (loggedInUser == null || !Objects.equals(loggedInUser.getPassword(), password)) {
            return null;
        }
        return loggedInUser;
    }

}
