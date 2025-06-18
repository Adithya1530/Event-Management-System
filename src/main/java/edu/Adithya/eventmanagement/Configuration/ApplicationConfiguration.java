package edu.jeevith.eventmanagement.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "edu.jeevith")
public class ApplicationConfiguration {
	
	@Bean
	public EntityManager createEntityManager() {
		 return Persistence.createEntityManagerFactory("Hibernate").createEntityManager() ;
		
	}

}
