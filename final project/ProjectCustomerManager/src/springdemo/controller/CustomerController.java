package springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springdemo.entity.Customer;
import springdemo.service.CustomerService;

@Controller
public class CustomerController
{
	@Autowired
	private CustomerService service;
	
	//redirects to list
	@RequestMapping("/")
	public String showMyPage()
	{
		return "index";
	}
	
	//grab customers from service, add to model, redirect to list
	@RequestMapping("/customer/list")
	public String showForm(Model theModel)
	{
		
		List<Customer> customers = service.getAllCustomers();
		theModel.addAttribute("customers", customers);
		return "list-customers";
	}
	
	//create a new customer, add it to the model, redirect to form
	@RequestMapping("customer/showFormForAdd")
	public String addCustomer(Model theModel)
	{
		Customer tempCustomer = new Customer();
		theModel.addAttribute(tempCustomer);
		return "customer-form";
	}
	
	//grab customer object from model, use service to upsert, redirect to list
	@RequestMapping("customer/saveCustomer")
	public String saveCustomer(@ModelAttribute Customer tempCustomer)
	{
		service.addCustomer(tempCustomer);
		return "redirect:/";
	}
	
	//grab customer id from url, use service to delete, redirect to list
	@RequestMapping("customer/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId)
	{
		service.deleteCustomer(theId);
		return "redirect:/";
	}
	
	//grab customer id from url, add it to the model, redirect to form
	@RequestMapping("customer/showFormForUpdate")
	public String updateCustomer(@RequestParam("customerId") int theId, Model theModel)
	{
		Customer tempCustomer = service.getCustomer(theId);
		theModel.addAttribute(tempCustomer);
		return "customer-form";
	}
	

}
