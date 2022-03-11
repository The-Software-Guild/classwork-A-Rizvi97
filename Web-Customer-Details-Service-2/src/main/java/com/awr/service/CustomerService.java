package com.awr.service;

import java.util.List;

import com.awr.entity.Customer;

import com.awr.entity.CustomerDetails;


public interface CustomerService {
	
	public CustomerDetails getCustomerById(String id);
	
	
	
	public List<Customer> getAllCustomers();
}
