package com.example.customerCurd.services;

import java.util.List;
import java.util.Optional;

import com.example.customerCurd.model.Customer;


public interface CustomerService {
public List<Customer> findAllCustomer();

public String insertCustomer(Customer customer);
public Optional<Customer> findById(int htno);
public Optional<Customer> findByName(String name);
public String updateCustomer(Customer customer);
public String deleteCustomer(int htno);

}
