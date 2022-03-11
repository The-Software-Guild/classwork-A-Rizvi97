package com.awr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.awr.entity.Customer;
import com.awr.entity.CustomerDetails;



@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public CustomerDetails getCustomerById(String id) {
		return restTemplate.getForObject("http://localhost:8085/details/"+id, CustomerDetails.class);
	}
	



	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
