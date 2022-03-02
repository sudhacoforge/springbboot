package com.example.customerCurd.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customerCurd.model.Customer;
import com.example.customerCurd.services.CustomerService;



@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Customer>> getDetails(){
		return new ResponseEntity(customerService.findAllCustomer(),HttpStatus.OK);
		
	}
	
	
	
	@PostMapping("/add")
	public ResponseEntity<String> createCustomer(@RequestBody Customer cusotmer)
	{
		
		return new ResponseEntity(customerService.insertCustomer(cusotmer), HttpStatus.CREATED);
		
	}
	
	
	@PostMapping("/htno/{htno}")
	public ResponseEntity<Optional<Customer>> getCustomerByHtno(@PathVariable("htno") int htno){
		
		return new ResponseEntity(customerService.findById(htno), HttpStatus.OK);
	}
	
	
	@PostMapping("/name/{name}")
	public ResponseEntity<Optional<Customer>> getCustomerByName(@PathVariable("name") String name){
		
		return new ResponseEntity(customerService.findByName(name), HttpStatus.OK);
	}
	

	
	@PutMapping("/update")
	public ResponseEntity<String> updateCustomer(@RequestBody Customer Customer)
	{
		
		return new ResponseEntity<String>(customerService.updateCustomer(Customer), HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/htno/{htno}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("htno") int htno){
		return new ResponseEntity(customerService.deleteCustomer(htno), HttpStatus.ACCEPTED);
	}
	


}
