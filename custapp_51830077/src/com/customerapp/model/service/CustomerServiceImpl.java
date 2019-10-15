package com.customerapp.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerapp.model.persistance.Customer;
import com.customerapp.model.persistance.CustomerDao;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
@Autowired
private CustomerDao dao;
	@Override
	public List<Customer> getAllCustomers() {
		
		return dao.getAllCustomers();
	}

	@Override
	public Customer getCustomerById(int customerId) {
		
		
		Customer customer= dao.getCustomerById(customerId);
	if(customer==null){
		throw new CustomerNotFoundException("customer with id"+customerId+"is not found");
		}
		return customer;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		
		return dao.addCustomer(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		
		return dao.updateCustomer(customer);
	}

	@Override
	public Customer removeCustomer(int customerId) {
		
		return dao.removeCustomer(customerId);
	}

}
