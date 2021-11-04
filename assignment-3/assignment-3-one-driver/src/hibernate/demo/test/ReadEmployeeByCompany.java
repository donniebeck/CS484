package hibernate.demo.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.demo.entity.Employee;

public class ReadEmployeeByCompany
{
	String company;
	public ReadEmployeeByCompany(String company)
	{
		this.company = company;
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
			
			//prepare Query
			String query = "from Employee e where e.company='" + company + "'";
			
			//Retrieve employees with company name
			List<Employee> theEmployees = session
					.createQuery(query)
					.getResultList();
			
			//commit
			session.getTransaction().commit();
			System.out.println("retrieved data: ");
			displayEmployee(theEmployees);
		} 
		finally
		{
			factory.close();
		}
	}
	private static void displayEmployee(List<Employee> theEmployees)
	{
		for (Employee employees : theEmployees)
		{
			System.out.println(employees);
		}
	}
}
