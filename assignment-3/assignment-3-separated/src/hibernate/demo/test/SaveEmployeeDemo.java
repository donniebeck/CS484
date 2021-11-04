package hibernate.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.demo.entity.Employee;

public class SaveEmployeeDemo
{

	public static void main(String a[])
	{
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
		// create a session
		Session session = factory.getCurrentSession();
		try
		{
			// use session object to save the object
			// create the object
			Employee employee0 = new Employee("Kusuo", "Saiki", "Shueisha", "2012-05-14", 30000);
			
			// start the transaction
			session.beginTransaction();
			
			// save the object
			session.save(employee0);
			
			// commit
			session.getTransaction().commit();
		}
		finally
		{
			factory.close();
		}
	}
}
