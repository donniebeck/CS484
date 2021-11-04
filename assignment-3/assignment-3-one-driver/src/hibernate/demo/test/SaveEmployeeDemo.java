package hibernate.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.demo.entity.Employee;

public class SaveEmployeeDemo
{
	String firstName;
	String lastName;
	String companyName;
	String joinDate;
	float salary;
	
	public SaveEmployeeDemo(String firstName, String lastName, String companyName, String joinDate, float salary)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.joinDate = joinDate;
		this.salary = salary;
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
			// use session object to save the object
			// create the object
			Employee employee0 = new Employee(firstName, lastName, companyName, joinDate, salary);
			
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
