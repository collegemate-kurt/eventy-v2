package edu.calpoly.csc431.service;

import edu.calpoly.csc431.dao.AuthUserDAO;
import edu.calpoly.csc431.model.AuthUser;
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
    private AuthUserDAO authUserDAO;

    @Override
    public AuthUser signUp(AuthUser user) {
        return authUserDAO.createAuthUser(user);
    }

    @Override
    public AuthUser login(String email, String password) {
        AuthUser existed = authUserDAO.getAuthUser(email);
        if (!Objects.equals(existed.getSaltedPassword(), password)) {
            return null;
        }
        return existed;
    }

}
