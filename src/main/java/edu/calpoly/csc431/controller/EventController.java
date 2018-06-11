package edu.calpoly.csc431.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Eric Jiang
 */
@Controller
public class EventController {

    @RequestMapping(value = "event", method = RequestMethod.POST)
    public ModelAndView addEvent(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "event", method = RequestMethod.PUT)
    public ModelAndView updateEvent(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "event/{eventId}", method = RequestMethod.GET)
    public ModelAndView getEvent(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "event/{eventId}", method = RequestMethod.DELETE)
    public ModelAndView deleteEvent(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "event/{eventId}/members", method = RequestMethod.GET)
    public ModelAndView getMembers(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "event/{eventId}/members/{memberId}", method = RequestMethod.POST)
    public ModelAndView addMember(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "event/{eventId}/members/{memberId}", method = RequestMethod.DELETE)
    public ModelAndView deleteMember(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "event/{eventId}/photos", method = RequestMethod.GET)
    public ModelAndView getPhotos(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "event/{eventId}/photos/{photoUrl}", method = RequestMethod.POST)
    public ModelAndView addPhoto(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "event/{eventId}/photos/{photoUrl}", method = RequestMethod.DELETE)
    public ModelAndView deletePhoto(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "event/{eventId}/requests", method = RequestMethod.GET)
    public ModelAndView getRequests(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "event/{eventId}/requests", method = RequestMethod.POST)
    public ModelAndView addRequest(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "event/{eventId}/requests/{requestId}", method = RequestMethod.PUT)
    public ModelAndView updateRequest(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "event/{eventId}/requests/{requestId}", method = RequestMethod.DELETE)
    public ModelAndView deleteRequest(ModelAndView model) {
        return null;
    }

    @RequestMapping(value = "events", method = RequestMethod.GET)
    public ModelAndView getEvents(ModelAndView model) {
        return null;
    }

}
