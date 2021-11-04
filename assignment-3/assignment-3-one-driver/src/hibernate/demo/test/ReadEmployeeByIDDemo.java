package hibernate.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.demo.entity.Employee;

public class ReadEmployeeByIDDemo
{
	int empID;
	
	public ReadEmployeeByIDDemo(int empID)
	{
		this.empID = empID;
	}
	public void commit()
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
			
			// get a new session
			session = factory.getCurrentSession();
			
			// begin transaction
			session.beginTransaction();
			
			// retrieve data
			Employee myEmployee = session.get(Employee.class, empID);
			
			//commit
			session.getTransaction().commit();
			System.out.println("retrieved data: ");
			System.out.println(myEmployee);
		} 
		finally
		{
			factory.close();
		}

	}
}
