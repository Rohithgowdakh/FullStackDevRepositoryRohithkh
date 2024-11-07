package com.gentech.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gentech.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
