package com.hibernatedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			//HQL--> Hibernate Query Language
			//from City c where c.countryCode='TUR' AND c.district='Izmir'
			//AND OPERATÖRÜ
			//OR OPERATÖRÜ
			//WHERE KOÞULU
			//LIKE OPERATÖRÜ
			//from City c where c.name LIKE '%KAR%'
			//ASC--Ascending
			//DESC-Descending
			/*
			 * List<City> cities =
			 * session.createQuery("select c.countryCode from City c GROUP BY c.countryCode"
			 * ).getResultList();
			 * 
			 * for(City city : cities) { System.out.println(city.getName()); }
			 */
		
		//INSERT KODU
		/*
		 * City city = new City(); city.setName("Düzce 10"); 
		 * city.setCountryCode("TUR");
		 * city.setDistrict("Karadeniz"); 
		 * city.setPopulation(110000);
		 * session.save(city);
		 */
			
		//UPDATE
		/*
		 * City city = session.get(City.class, 4080);
		 *  city.setPopulation(1350000);
		 * session.save(city);
		 */
		//CRUD Create-Read-Update-Delete
			
		//DELETE iþlemi
		City city = session.get(City.class, 4080);
		session.delete(city);
		
		session.getTransaction().commit();
		System.out.println("Þehir Silindi.");
		
			
		}finally {
			factory.close();
		
		}

	}

}
