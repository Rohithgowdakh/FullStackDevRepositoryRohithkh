package com.gentech.employeelombok.tests;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

import com.gentech.employeelombok.entity.Customer;
import com.gentech.employeelombok.repository.CustomerRepository;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EmployeeUnitTest {
	
	@LocalServerPort
	private int port;
	
	private String baseURL="http://localhost";
	
	private static RestTemplate restTemplate;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@BeforeAll
	public static void initialization()
	{
		restTemplate=new RestTemplate();
	}
	
	@BeforeEach
	public void setUp()
	{
		baseURL=baseURL+":"+port+"/v1/api/customer";
	}
	
//	@AfterEach
//	public void tearDown()
//	{
//		customerRepository.deleteAll();
//	}
	
	@Test
	public void shouldcreatedepartment()
	{
		Customer cus1=new Customer();
		cus1.setAge(30);
		cus1.setCity("Dubai");
		cus1.setName("Manohar");
		
		Customer newCustomer=restTemplate.postForObject(baseURL, cus1, Customer.class);
		
		assertNotNull(newCustomer);
		assertThat(newCustomer.getId()).isNotNull();
		assertEquals("Manohar", newCustomer.getName());
		
		customerRepository.deleteById(newCustomer.getId());
	}
}
