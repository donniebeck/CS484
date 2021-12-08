package springdemo.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springdemo.entity.Customer;

@Repository
public class DataAccessObject
{
	//Took me a while to wrap my head around the given xml and how this autowire works
	//I kept wanting to create a session object with it, but it gave errors
	@Autowired
	SessionFactory factory;
	
	public void addCustomer(Customer tempCustomer)
	{
		factory.getCurrentSession().saveOrUpdate(tempCustomer);
	}
	
	public Customer getCust(int theId)
	{
		Customer tempCustomer = factory.getCurrentSession().get(Customer.class, theId);
		return tempCustomer;
	}
	
	public Customer updateCustomer(Customer tempCustomer)
	{
		factory.getCurrentSession().update(tempCustomer);
		return tempCustomer;
	}
	
	public void deleteCustomer(int theId)
	{
		Customer tempCustomer = factory.getCurrentSession().get(Customer.class, theId);
		factory.getCurrentSession().delete(tempCustomer);
	}
	
	
	public List<Customer> getAllCustomers()
	{
		@SuppressWarnings("unchecked") //I feel bad about this, but oh well
		List<Customer> list = factory.getCurrentSession().createQuery("FROM Customer").list();
		return list;
	}
	
	
}
