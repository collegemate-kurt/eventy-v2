package edu.calpoly.csc431.controller;

import edu.calpoly.csc431.model.Event;
import edu.calpoly.csc431.model.User;
import edu.calpoly.csc431.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author Eric Jiang
 */
@Controller
public class EventListController {
    @Autowired
    private EventService eventService;

    @RequestMapping(value = "/event", method = RequestMethod.POST)
    public ModelAndView addEvent(@ModelAttribute Event event) {
        eventService.addEvent(event);
        return new ModelAndView("redirect:/events");
    }

    @RequestMapping(value = "/events", method = RequestMethod.GET)
    public ModelAndView getEvents(ModelAndView model) {
        List<Event> list = (List<Event>) model.getModel().get("eventList");
        if (list == null) {
            list = eventService.queryEvents();
        }
        User user = (User) model.getModel().get("user");
        model.addObject("eventList", list);
        model.addObject("user", user);
        model.setViewName("event_list");
        return model;
    }

    @RequestMapping(value = "/event/createEventForm", method = RequestMethod.GET)
    public ModelAndView showCreateEventForm(ModelAndView view) {
        Event event = new Event();
        view.addObject("event", event);
        view.setViewName("create_event_form");
        return view;
    }

}
