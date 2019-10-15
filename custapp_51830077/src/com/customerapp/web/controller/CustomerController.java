package com.customerapp.web.controller;



import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.customerapp.model.persistance.Customer;
import com.customerapp.model.service.CustomerService;

@Controller

public class CustomerController {
	@Autowired
private CustomerService customerService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "redirect:login";
	}
	@RequestMapping(value="allcustomers")
	public String getCustomers(ModelMap map){
		map.addAttribute("customers", customerService.getAllCustomers());
		return "all_customers";
	}
	@RequestMapping(value="addcustomer")
	public String addcustomer(ModelMap map){
		map.addAttribute("customer", new Customer());
		return "addcustomer";
	}
	@RequestMapping(value="addcustomer",method=RequestMethod.POST)
	public String addCustomerUpdateCustomerPost(@Valid Customer customer,
			BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return "addcustomer";
		}
		else{
			if(customer.getCustomerId()==0)
			customerService.addCustomer(customer);
			else
			customerService.updateCustomer(customer);
		}
		return "redirect:allcustomers";
	}
	@RequestMapping(value="update")
	public String updateCustomer(HttpServletRequest req,ModelMap map){
		int customerId=Integer.parseInt(req.getParameter("id"));
		Customer custToBeUpdate=customerService.getCustomerById(customerId);
		map.addAttribute("customer", custToBeUpdate);
		return "addcustomer";
	}
	@RequestMapping(value="delete")
	public String deleteCustomer(HttpServletRequest req,ModelMap map){
		int customerId=Integer.parseInt(req.getParameter("id"));
		
		customerService.removeCustomer(customerId);
		return "redirect:allcustomers";
	}
}
