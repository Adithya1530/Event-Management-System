package edu.jeevith.eventmanagement.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.jeevith.eventmanagement.Model.EventEntity;

@Repository
public class EventDao {

	@Autowired
	private EntityManager entityManager;

	public void saveEvent(EventEntity event) {

		EntityTransaction et = entityManager.getTransaction();

		et.begin();

		entityManager.persist(event);

		et.commit();

		System.out.println(System.nanoTime() + "Event Obj saved At DAO : " + event);
	}
	
	public EventEntity findEvent(int id) {

		EntityTransaction et = entityManager.getTransaction();

		et.begin();

		EventEntity event = entityManager.find(EventEntity.class, id) ;

		et.commit();
		
		if(event != null) return event ;

		else return  event ;
	}
	
	public void updateEvent(EventEntity event) {

		EntityTransaction et = entityManager.getTransaction();

		et.begin();

		entityManager.merge(event) ;

		et.commit();

	}

	public void deleteEvent(EventEntity event) {

		EntityTransaction et = entityManager.getTransaction();

		et.begin();

		entityManager.remove(event);

		et.commit();

		System.out.println(System.nanoTime() + "Event Obj saved At DAO : " + event);
	}
	
	public List<EventEntity> getAllEvent(){
		
		EntityTransaction et = entityManager.getTransaction() ;
		
		et.begin();
		
		Query query = entityManager.createQuery("select * from EventEntity") ;
		
		List list = query.getResultList();
		
		et.commit();
		
		return list ;
	}
	
	
}
