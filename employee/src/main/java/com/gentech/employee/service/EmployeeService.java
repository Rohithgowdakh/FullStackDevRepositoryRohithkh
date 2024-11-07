package com.gentech.employee.service;

import java.util.List;

import com.gentech.employee.entity.Employee;

public interface EmployeeService {

	List<Employee> getEmployee();
	
	Employee getSpecificEmployee(Long id) throws Exception;
	
	Employee addEmployee(Employee employee);
	
	Employee updateEmployee(Employee employee);
	
	void deleteEmployee(Long id);
}
