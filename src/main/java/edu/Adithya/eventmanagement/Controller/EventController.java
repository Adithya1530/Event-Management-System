package edu.jeevith.eventmanagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import edu.jeevith.eventmanagement.Model.EventEntity;
import edu.jeevith.eventmanagement.Service.EventService;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EventController {
	
	@Autowired
	private EventService eventService ;
	
	@RequestMapping(value = "createEvent", method = RequestMethod.GET)
	public ModelAndView createEvent(ModelAndView mav, EventEntity event) {
		
		mav.addObject("event", event) ;
		
		mav.setViewName("createEvent.jsp") ;
		
		System.out.println(System.nanoTime()+"Going createEvent.jsp");
		
		return mav ;
		
	}
	
	@RequestMapping(value = "saveEvent", method = RequestMethod.POST)
	public ModelAndView saveEvent(@ModelAttribute EventEntity event, ModelAndView mav) {
		
		System.out.println(System.nanoTime()+"Event Obj from saveEvent() : "+event);
		
		boolean result = eventService.saveEvent(event);
		
		if(result) {
			mav.setViewName("index.jsp");
			mav.addObject("msg", "Data Saved in the Database") ;
		}
		else {
			mav.setViewName("index.jsp");
			mav.addObject("msg", "Unabel to save the Data please check the Attributes.") ;
		}
		
		return mav ;
	}
	
	@RequestMapping(value = "deleteEvent", method = RequestMethod.GET)
	public ModelAndView deletEvent(ModelAndView mav) {
		
		mav.setViewName("deleteEvent.jsp");
		
		return mav ;
	}
	
	@RequestMapping(value = "findEvent", method = RequestMethod.POST)
	public ModelAndView findEvent(HttpServletRequest request, ModelAndView mav) {
		
		int id = Integer.parseInt(request.getParameter("id")) ;
		
		EventEntity event = eventService.findEvent(id) ;
		
		mav.addObject("event", event) ;
		
		mav.setViewName("showEvent.jsp");
		
		return mav ;
	}
	
	@RequestMapping(value = "findEventUpdate", method = RequestMethod.POST)
	public ModelAndView findEventUpdate(HttpServletRequest request, ModelAndView mav) {
		
		int id = Integer.parseInt(request.getParameter("id")) ;
		
		EventEntity event = eventService.findEvent(id) ;
		
		System.out.println(event);
		
		mav.addObject("event", event) ;
		
		mav.setViewName("updateEvent.jsp");
		
		return mav ;
	}
	
	
	@RequestMapping(value = "saveEventUpdate", method = RequestMethod.POST)
	public ModelAndView saveUpdateEvent(@ModelAttribute EventEntity event, ModelAndView mav) {
		
		System.out.println(System.nanoTime()+"Event Obj from saveEvent() : "+event);
		
		boolean result = eventService.updateEvent(event);
		
		mav.setViewName("index.jsp");
		
		return mav ;
	}
		
	
	@RequestMapping(value = "deleteEventId", method = RequestMethod.POST)
	public ModelAndView deletEvent(ModelAndView mav, HttpServletRequest request) {
		
		int id = Integer.parseInt(request.getParameter("id")) ;
		
		eventService.deletEvent(id);
		
		mav.setViewName("index.jsp");
		
		return mav ;
	}
}
