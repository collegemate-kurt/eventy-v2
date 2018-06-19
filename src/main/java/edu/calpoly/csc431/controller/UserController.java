package edu.calpoly.csc431.controller;

import edu.calpoly.csc431.model.Event;
import edu.calpoly.csc431.model.User;
import edu.calpoly.csc431.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author Eric Jiang
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ModelAndView addUser(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public ModelAndView updateUser(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ModelAndView getUser(ModelAndView model, @PathVariable(value = "id") int id) {
        User user = userService.getUser(id);
        List<Event> eventList = userService.getEvents(id);
        model.addObject("user", user);
        model.addObject("eventList", eventList);
        model.setViewName("user");
        return model;
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
    public ModelAndView getEvents(ModelAndView model, @PathVariable(value = "userId") int userId) {
        List<Event> eventList = userService.getEvents(userId);
        ModelAndView view = new ModelAndView("redirect:/events");
        model.addObject("eventList", eventList);
        return view;
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

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ModelAndView listUsers(ModelAndView model) {
        List<User> listUser = userService.getAllUsers();
        model.addObject("listUser", listUser);
        model.setViewName("user_list");
        return model;
    }
}
