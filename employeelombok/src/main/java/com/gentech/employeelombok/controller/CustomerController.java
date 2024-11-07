package com.gentech.employeelombok.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/customer")
	public ResponseEntity<List<Customer>> getCustomers()
	{
		return new ResponseEntity<List<Customer>>(cusService.getCustomers(),HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("/customer/{id}")
	public ResponseEntity<Customer> getSpecificCustomer(@PathVariable Long id)
	{
		return new ResponseEntity<Customer> (cusService.getCustomer(id),HttpStatusCode.valueOf(200));
	}
	
	@PutMapping("/customer/{id}")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer,@PathVariable Long id)
	{
		
		return new ResponseEntity<Customer>(cusService.upadateCustomer(customer, id),HttpStatusCode.valueOf(200));
	}
	
	@DeleteMapping("/customer/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable Long id)
	{
		cusService.deleteCustomer(id);
		return new ResponseEntity<String>("the customer id "+id+" has deleted",HttpStatusCode.valueOf(200));
	}
	
}
