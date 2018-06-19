package edu.calpoly.csc431.controller;

import edu.calpoly.csc431.model.User;
import edu.calpoly.csc431.service.AuthUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @author Eric Jiang
 */
@Controller
public class AuthUserController {

    @Autowired
    private AuthUserService authService;

    @RequestMapping(value = "/auth/signUpForm", method = RequestMethod.GET)
    public ModelAndView openSignUpForm(ModelAndView model) {
        User user = new User();
        model.addObject("user", user);
        model.setViewName("sign_up_form");
        return model;
    }

    @RequestMapping(value = "/auth/signup", method = RequestMethod.POST)
    public ModelAndView signUp(HttpSession session, @ModelAttribute User user) {
        user = authService.signUp(user);
        ModelAndView view = new ModelAndView("redirect:/");
        view.addObject("user", user);
        session.setAttribute("user", user);
        return view;
    }

    @RequestMapping(value = "/auth/loginForm", method = RequestMethod.GET)
    public ModelAndView openLoginForm(ModelAndView model) {
        User user = new User();
        model.addObject("user", user);
        model.setViewName("login_form");
        return model;
    }

    @RequestMapping(value = "/auth/login", method = RequestMethod.POST)
    public ModelAndView login(HttpSession session, @ModelAttribute User user) {
        user = authService.login(user.getEmail(), user.getPassword());
        ModelAndView view = new ModelAndView("redirect:/");
        view.addObject("user", user);
        session.setAttribute("user", user);
        return view;
    }

}
