package com.division6.so.question32217125;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Map<String, String> properties= new HashMap<>();
		properties.put("hibernate.connection.driver_class", "org.hsqldb.jdbc.JDBCDriver");
		properties.put("hibernate.connection.url", "jdbc:hsqldb:mem:.");
		properties.put("hibernate.connection.username", "sa");
		properties.put("hibernate.connection.password", "");
		properties.put("hibernate.dialect", "HSQL");
		properties.put("hibernate.current_session_context_class", "thread");
		properties.put("hibernate.hbm2ddl.auto", "create");

        final EntityManagerFactory entityManagerFactory= 
    			Persistence.createEntityManagerFactory("com.division6.so.question32217125", properties);
        final EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
		final List<User> result = entityManager.createQuery( "from User u where u.login = :login", User.class )
				.setParameter("login", "foo")
				.getResultList(); 
        for ( User user : result ) {
            System.out.println( user );
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
