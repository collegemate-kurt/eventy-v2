package edu.calpoly.csc431.controller;

import edu.calpoly.csc431.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @author Eric Jiang
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home(HttpSession session, ModelAndView model) {
        User user = (User) session.getAttribute("user");
        model.setViewName("home");
        model.addObject("user", user);
        return model;
    }

}
