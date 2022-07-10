package com.ex.javaappcode.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex.javaappcode.dto.Customer;

@RestController
public class AppController {
	
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("Customer1","Reg-1", new Date()));
		customers.add(new Customer("Customer2","Reg-2", new Date()));
		customers.add(new Customer("Customer3","Reg-3", new Date()));
		customers.add(new Customer("Customer4","Reg-4", new Date()));
		return customers;
	}

}
