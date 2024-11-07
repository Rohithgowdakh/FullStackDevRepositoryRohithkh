package com.gentech.employeelombok.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gentech.employeelombok.entity.Customer;
import com.gentech.employeelombok.exception.ResourceNotFoundException;
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
	public List<Customer> getCustomers() {
		
		return custRepository.findAll();
	}

	@Override
	public Customer getCustomer(Long id) {
	
		return custRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("customer","id",id));
	}

	@Override
	public Customer upadateCustomer(Customer customer, Long id) {
		
		Customer existingCustomer=custRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Customer", "id", id));
		
		existingCustomer.setName(customer.getName());
		existingCustomer.setAge(customer.getAge());
		existingCustomer.setCity(customer.getCity());
		 
		return custRepository.save(existingCustomer);
	}

	@Override
	public void deleteCustomer(Long id) {
		
		custRepository.deleteById(id);
	}
}
