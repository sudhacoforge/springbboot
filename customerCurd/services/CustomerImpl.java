package com.example.customerCurd.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customerCurd.model.Customer;
import com.example.customerCurd.repo.CustomerRepository;

@Service
public class CustomerImpl implements CustomerService {
	 
	
	@Autowired
	CustomerRepository repo;
	

	@Override
	public List<Customer> findAllCustomer() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}


	@Override
	public String insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		repo.save(customer);
		return "Inserted successfully";
	}

	@Override
	public Optional<Customer> findById(int htno) {
		// TODO Auto-generated method stub
		
		return repo.findById(htno);
		
	}

	@Override
	public Optional<Customer> findByName(String name) {
		// TODO Auto-generated method stub
		return repo.findByName(name);
	}

	@Override
	public String updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		repo.save(customer);
		return "customer updated successfully";
	}

	@Override
	public String deleteCustomer(int htno) {
		// TODO Auto-generated method stub
		repo.deleteById(htno);
		return "customer deleted";
	}


}
