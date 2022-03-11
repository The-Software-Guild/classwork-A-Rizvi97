package com.awr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.awr.entity.CustomerDetails;
import com.awr.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/")
	public String getMainPageController() {
		return "index";
	}
	
	@RequestMapping("/searchCustomerPage")
	public String getSearchCustomerPage() {
		return "searchCustPage";
	}
	
	@RequestMapping("/searchCustomer")
	public ModelAndView searchEmployeeController(@RequestParam("customerId") String customerId) {
		ModelAndView modelAndView=new ModelAndView();
		CustomerDetails customerDetails= customerService.getCustomerById(customerId);
		modelAndView.addObject("customerDetails", customerDetails.getCustomerDetailList());
		modelAndView.setViewName("showCustomer");
		return modelAndView;
	}
}
