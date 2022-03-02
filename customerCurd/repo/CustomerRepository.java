package com.example.customerCurd.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.customerCurd.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	
	@Query("select s from Customer s where s.name=?1")
	 public Optional<Customer> findByName(String name);
}
