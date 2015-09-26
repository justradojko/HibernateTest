package org.radojko.hibernate;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.radojko.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		Date date = new Date(12432123);
		UserDetails user = new UserDetails();
		
		user.setUserID(1);
		user.setFirstName("Radojko");
		user.setLastName("Maksimovic");
		user.setRegistrationDate(date);

		//CREATING SESSION FACTORY		
//		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
//		} catch (Exception e){
//			e.printStackTrace();
//		}
	}
}
