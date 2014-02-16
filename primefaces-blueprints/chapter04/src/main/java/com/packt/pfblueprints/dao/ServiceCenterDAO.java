package com.packt.pfblueprints.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.packt.pfblueprints.model.ServiceCenter;

public class ServiceCenterDAO {

	private static SessionFactory sessionFactory;

	private static SessionFactory configureSessionFactory()
			throws HibernateException {
		Configuration configuration = new Configuration();
		configuration.configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionfactory = configuration
				.buildSessionFactory(builder.build());
		return sessionfactory;
	}

	public ServiceCenterDAO() throws SQLException {
		try {
			sessionFactory = configureSessionFactory();
		} catch (HibernateException ex) {

		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}

	}

	public List<ServiceCenter> getAllDealers() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query queryResult = session.createQuery("from servicecenter");
		java.util.List allDealers;
		allDealers = queryResult.list();
		session.getTransaction().commit();
		return allDealers;

	}

}
