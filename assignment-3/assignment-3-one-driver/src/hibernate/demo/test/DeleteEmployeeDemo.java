package hibernate.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.demo.entity.Employee;

public class DeleteEmployeeDemo
{
	int employeeId;
	
	public DeleteEmployeeDemo(int employeeId)
	{
		this.employeeId = employeeId;
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
			// start the transaction
			session.beginTransaction();
			
			//delete employee
			Employee myEmployee = session.get(Employee.class, employeeId);
			session.delete(myEmployee);
			
			//commit transaction
			session.getTransaction().commit();
		}
		finally
		{
			factory.close();
		}
	}
}
