package com.ex.javaappcode.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ex.javaappcode.dto.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
// we allow localhost:4200 for testing purposes
@CrossOrigin(origins = "http://localhost:4200")
public class HelloController {

    @RequestMapping(value = "/message", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> index() {
        return Collections.singletonMap("message", "Greetings from Spring Boot!");
    }

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
