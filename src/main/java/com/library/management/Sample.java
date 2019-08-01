package com.library.management;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Sample {

	public static void main(String args[])
	{

		Item item = new Item();
		item.setId(1);
		item.setTitle("MyBook");
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml.tld").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(item);
		session.getTransaction().commit();
		session.close();

	}
}
