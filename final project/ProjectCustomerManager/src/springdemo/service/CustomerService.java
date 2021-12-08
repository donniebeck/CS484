package springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springdemo.dao.DataAccessObject;
import springdemo.entity.Customer;

@Service
@Transactional
public class CustomerService
{
	@Autowired
	private DataAccessObject dao;
	
	@Transactional
	public void addCustomer(Customer tempCustomer)
	{
		dao.addCustomer(tempCustomer);
	}
	
	public Customer getCustomer(int theId)
	{
		return dao.getCust(theId);
	}
	
	public Customer updateCustomer(Customer tempCustomer)
	{
		return dao.updateCustomer(tempCustomer);
	}
	
	@Transactional
	public void deleteCustomer(int theId)
	{
		dao.deleteCustomer(theId);
	}
	
	@Transactional
	public List<Customer> getAllCustomers()
	{
		return dao.getAllCustomers();
	}

	public void setDataAccessObject(DataAccessObject dao)
	{
		this.dao = dao;
	}
}
