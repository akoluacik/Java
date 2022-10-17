package com.hibernatedemo;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

import java.util.List;

import org.hibernate.Session;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sessions are useful when we execute multiple queries back to back\n"
			+ "And if one of them is errornous, the previous updates are withdrawn!");
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			// Execute queries
			// Typecast and getResultList is needed because createQuery return a query
			
			/* Straight query */
			//List<City> cities = session.createQuery("from City").getResultList(); // equivalent to SELECT * FROM city
			
			/* Conditional queries */
			//List<City> cities = session.createQuery("from City c where c.countryCode = 'TUR' OR c.countryCode = 'USA'").getResultList();
			//List<City> cities = session.createQuery("from City c where c.countryCode = 'TUR' AND c.name LIKE '%kar%'").getResultList();
			
			/* Order By ASC */
			//List<City> cities = session.createQuery("from City c ORDER BY c.name" /*+"ASC"*/).getResultList();
			//List<City> cities = session.createQuery("from City c ORDER BY c.name DESC").getResultList();
			
			/*List<City> cities = session.createQuery("from City c GROUP BY c.name").getResultList();
			for (City city : cities) {
				System.out.println(city.getName());
			}*/
			
			/* Group By */
			/*List<String> countryCodes = session.createQuery("SELECT c.countryCode FROM City c GROUP BY c.name").getResultList();
			for (String countryCode : countryCodes) {
				System.out.println(countryCode);
			}*/
			
			/* inserting a data to a db */
//			City city = new City(4080,"Düzce", "TUR", "Karadeniz", 10000);
//			session.save(city);
//			session.getTransaction().commit(); // update the database
//			System.out.println("City is added!");
			
			/* update */
//			City city = session.get(City.class, 4080);
//			city.setPopulation(city.getPopulation() + 10000);
//			session.save(city);
//			session.getTransaction().commit(); // update the database
//			System.out.println("City is updated!");
			
			/* delete */
			City city = session.get(City.class, 4080);
			session.delete(city);
			session.getTransaction().commit(); // update the database
			System.out.println("City is deleted!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Normally we would see session.rollBack if any error occurs, but hibernate can do this automatically so we do not need catch block");
		} finally {
			//factory.close();
			session.close();
		}
		System.out.println("To connect this class to db and fill fields with db columns, use @Entity Annotation in the Entity Class(in our case, it is City)");
		System.out.println("We can use org.hibernate.annotations, but better use javax.persistence");
		System.out.println("Entity means the class is actually a database object");
		System.out.println("To fill the columns, we used the annotations just above the the class fields");
		System.err.println("If you won't use @Column annotation, it tries to find the columns with exactly the same name of the variables");
	}
}
