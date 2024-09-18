package com.gentech.employeelombok.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gentech.employeelombok.entity.Customer;
import com.gentech.employeelombok.service.CustomerService;

@RestController
@RequestMapping("/v1/api")
public class CustomerController {
	
	@Autowired
	private CustomerService cusService;
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
	    
	    return new ResponseEntity<>(cusService.createCustomer(customer), HttpStatus.valueOf(201));
	}

	
}
