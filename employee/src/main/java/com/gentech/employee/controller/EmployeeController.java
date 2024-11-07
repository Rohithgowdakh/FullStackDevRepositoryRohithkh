package com.gentech.employee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gentech.employee.entity.Employee;
import com.gentech.employee.service.EmployeeService;

@RestController
@RequestMapping("/r1/api")
public class EmployeeController {
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@GetMapping("/employee")
	public List<Employee> getAllEmployee()
	{
		return employeeService.getEmployee();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getParticularEmployee(@PathVariable Long id) throws Exception
	{
		return employeeService.getSpecificEmployee(id);
	}
	
	@PostMapping("/employee") 
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return employeeService.addEmployee(employee);
	}
	
	@PutMapping("/employee/{id}")
	public Employee updateEmployee(@RequestBody Employee employee,@PathVariable Long id)
	{
		employee.setE_id(id);
		return employeeService.updateEmployee(employee);
	}
	
	
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable Long id)
	{
		employeeService.deleteEmployee(id);
		return "The Employee ID "+id+"has deleted";
	}
	
	
	
}
