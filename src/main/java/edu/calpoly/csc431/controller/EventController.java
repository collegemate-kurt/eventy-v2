package edu.calpoly.csc431.controller;

import edu.calpoly.csc431.model.Event;
import edu.calpoly.csc431.model.User;
import edu.calpoly.csc431.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author Eric Jiang
 */
@Controller
public class EventController {
    @Autowired
    private EventService eventService;

    @RequestMapping(value = "/event/{eventId}", method = RequestMethod.GET)
    public ModelAndView getEvent(HttpSession session, ModelAndView model, @PathVariable(value = "eventId") int eventId) {
        Event event = eventService.getEvent(eventId);
        User user = (User) session.getAttribute("user");
        List<User> listUser = eventService.getMembers(eventId);
        model.addObject("event", event);
        model.addObject("user", user);
        model.addObject("listUser", listUser);
        model.setViewName("event");
        return model;
    }

    @RequestMapping(value = "/event", method = RequestMethod.PUT)
    public ModelAndView updateEvent(ModelAndView view, @ModelAttribute Event event) {
        eventService.updateEvent(event);
        return new ModelAndView("redirect:/event/" + event.getId());
    }

    @RequestMapping(value = "/event/{eventId}/delete", method = RequestMethod.GET)
    public ModelAndView deleteEvent(ModelAndView model, @PathVariable(value = "eventId") int eventId) {
        eventService.deleteEvent(eventId);
        return new ModelAndView("redirect:/events");
    }

    @RequestMapping(value = "/event/{eventId}/members/{memberId}", method = RequestMethod.GET)
    public ModelAndView addMember(ModelAndView model, @PathVariable(value = "eventId") int eventId, @PathVariable(value = "memberId") int memberId) {
        eventService.addMember(eventId, memberId);
        return new ModelAndView("redirect:/event/" + eventId);
    }

    @RequestMapping(value = "/event/{eventId}/members/{memberId}", method = RequestMethod.DELETE)
    public ModelAndView deleteMember(ModelAndView model, @PathVariable(value = "eventId") int eventId, @PathVariable(value = "memberId") int memberId) {
        eventService.deleteMember(eventId, memberId);
        return new ModelAndView("redirect:/event/" + eventId);
    }

    @RequestMapping(value = "/event/{eventId}/updateEventForm", method = RequestMethod.GET)
    public ModelAndView showUpdateEventForm(ModelAndView view, @PathVariable(value = "eventId") int eventId) {
        Event event = eventService.getEvent(eventId);
        view.addObject("event", event);
        view.setViewName("update_event_form");
        return view;
    }

    @RequestMapping(value = "/event/{eventId}/members", method = RequestMethod.GET)
    public ModelAndView getMembers(ModelAndView model, @PathVariable(value = "eventId") int eventId) {
        List<User> userList = eventService.getMembers(eventId);
        model.addObject("userList", userList);
        model.setViewName("user_list");
        return model;
    }

    @RequestMapping(value = "/event/{eventId}/photos", method = RequestMethod.GET)
    public ModelAndView getPhotos(ModelAndView model) {
        return model;
    }

    @RequestMapping(value = "/event/{eventId}/photos/{photoUrl}", method = RequestMethod.POST)
    public ModelAndView addPhoto(ModelAndView model) {
        return model;
    }

    @RequestMapping(value = "/event/{eventId}/photos/{photoUrl}", method = RequestMethod.DELETE)
    public ModelAndView deletePhoto(ModelAndView model) {
        return model;
    }

    @RequestMapping(value = "/event/{eventId}/requests", method = RequestMethod.GET)
    public ModelAndView getRequests(ModelAndView model) {
        return model;
    }

    @RequestMapping(value = "/event/{eventId}/requests", method = RequestMethod.POST)
    public ModelAndView addRequest(ModelAndView model) {
        return model;
    }

    @RequestMapping(value = "/event/{eventId}/requests/{requestId}", method = RequestMethod.PUT)
    public ModelAndView updateRequest(ModelAndView model) {
        return model;
    }

    @RequestMapping(value = "/event/{eventId}/requests/{requestId}", method = RequestMethod.DELETE)
    public ModelAndView deleteRequest(ModelAndView model) {
        return model;
    }


}
