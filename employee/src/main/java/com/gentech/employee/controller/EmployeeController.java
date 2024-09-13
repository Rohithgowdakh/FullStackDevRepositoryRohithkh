package com.gentech.employee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gentech.employee.entity.Employee;
import com.gentech.employee.service.EmployeeService;

@RestController
@RequestMapping("/v1/api")
public class EmployeeController {
	private EmployeeService service;
	
	public EmployeeController(EmployeeService service) {
		super();
		this.service = service;
	}

	@GetMapping("/employee")
	private List<Employee> getAllEmployees()
	{
		return service.getEmployee();
	}
}
