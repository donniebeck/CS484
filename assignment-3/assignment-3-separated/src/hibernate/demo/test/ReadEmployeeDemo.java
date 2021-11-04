package hibernate.demo.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.demo.entity.Employee;

public class ReadEmployeeDemo
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
			
			// get a new session
			session = factory.getCurrentSession();
			
			// begin transaction
			session.beginTransaction();
			
			// retrieve employee with emp_id=1
			Employee myEmployee = session.get(Employee.class, 1);
			
			//Retrieve employees with company name "Shueisha"
			List<Employee> theEmployees = session
					.createQuery("from Employee e where e.company='Shueisha'")
					.getResultList();
			
			//commit
			session.getTransaction().commit();
			System.out.println("retrieved data: ");
			System.out.println(myEmployee);
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
