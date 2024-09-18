package com.gentech.employeelombok.service;

import java.util.List;

import com.gentech.employeelombok.entity.Customer;

public interface CustomerService {

	Customer createCustomer(Customer customer);
	
	List<Customer> getCustomer(Customer customer);
}
