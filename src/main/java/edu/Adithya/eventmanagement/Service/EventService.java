package edu.jeevith.eventmanagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jeevith.eventmanagement.Dao.EventDao;
import edu.jeevith.eventmanagement.Model.EventEntity;

@Service
public class EventService {

	@Autowired
	private EventDao dao;

	public boolean saveEvent(EventEntity event) {

		if (event.getId() > 0 && event.getName() != null && event.getContactnum() > 5999999999l
				&& event.getContactnum() < 9999999999l) {

			System.out.println(System.nanoTime() + "Validation successfull at service : " + event);
			dao.saveEvent(event);
			return true;
		} else
			return false;
	}
	
	public EventEntity findEvent(int id) {
		
		if(id > 0) {
			if(dao.findEvent(id) != null) {
				return dao.findEvent(id) ;
			}
			else return null ;
		}	
		 else return null;
	}
	
	public boolean updateEvent(EventEntity event) {
		
		System.out.println("Update Event At Service Layer : "+event);
		
		EventEntity foundEvent = findEvent(event.getId()) ;
		
		if(foundEvent != null) {
			dao.updateEvent(event);
			return true ;
		}
		else return false ;
	}

	public boolean deletEvent(int id) {
		
		EventEntity foundEvent = findEvent(id);

		if (foundEvent != null) {

			dao.deleteEvent(foundEvent);
			return true ;
		} 
		return false ;
	}

}
