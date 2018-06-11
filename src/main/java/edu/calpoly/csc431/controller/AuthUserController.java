package edu.calpoly.csc431.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Eric Jiang
 */
@Controller
public class AuthUserController {

    @RequestMapping(value = "/auth/signup", method = RequestMethod.POST)
    public ModelAndView signUp(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "/auth/login", method = RequestMethod.POST)
    public ModelAndView login(ModelAndView model) {
        return null;
    }

}
