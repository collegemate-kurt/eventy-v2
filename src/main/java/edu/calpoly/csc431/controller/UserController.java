package edu.calpoly.csc431.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Eric Jiang
 */
@Controller
public class UserController {

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ModelAndView addUser(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public ModelAndView updateUser(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ModelAndView getUser(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public ModelAndView deleteUser(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "/user/{userId}/{followerId}", method = RequestMethod.POST)
    public ModelAndView addFollower(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "/user/{userId}/{followerId}", method = RequestMethod.DELETE)
    public ModelAndView deleteFollower(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "/user/{userId}/followers", method = RequestMethod.GET)
    public ModelAndView getFollowers(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "/user/{userId}/following", method = RequestMethod.GET)
    public ModelAndView getFollowing(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "/user/{userId}/events", method = RequestMethod.GET)
    public ModelAndView getEvents(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "/user/{userId}/photos", method = RequestMethod.GET)
    public ModelAndView getPhotos(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "/user/{userId}/photos/{photoUrl}", method = RequestMethod.POST)
    public ModelAndView addPhoto(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "/user/{userId}/photos/{photoUrl}", method = RequestMethod.DELETE)
    public ModelAndView deletePhoto(ModelAndView model) {
        return null;
    }

}
