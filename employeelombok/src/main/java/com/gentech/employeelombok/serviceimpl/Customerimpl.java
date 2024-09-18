package com.gentech.employeelombok.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gentech.employeelombok.entity.Customer;
import com.gentech.employeelombok.repository.CustomerRepository;
import com.gentech.employeelombok.service.CustomerService;

@Service
public class Customerimpl implements CustomerService {
    
    @Autowired
    private CustomerRepository custRepository;
    
    @Override
    public Customer createCustomer(Customer customer) {
        return custRepository.save(customer);
    }

	@Override
	public List<Customer> getCustomer(Customer customer) {
		
		return custRepository.findAll();
	}
}
