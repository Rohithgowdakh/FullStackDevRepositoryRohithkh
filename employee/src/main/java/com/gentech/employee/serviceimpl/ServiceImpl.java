package com.gentech.employee.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gentech.employee.entity.Employee;
import com.gentech.employee.repository.EmployeeRepository;
import com.gentech.employee.service.EmployeeService;
@Service
public class ServiceImpl implements EmployeeService {
	
	 private EmployeeRepository repository;
	 public List<Employee> getEmployee()
	 {
		 return repository.findAll();
	 }
	public ServiceImpl(EmployeeRepository repository) {
		super();
		this.repository = repository;
	}
	
}
