package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.details.Employeedetails;
import com.example.demo.service.Employeeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class Employeecontroller {

	@Autowired

	private Employeeservice employeeService;

	@PostMapping("/createEmployeedetails")
	public Employeedetails createEmployeedetails(@RequestBody Employeedetails employee) {
		return employeeService.createEmployeedetails(employee);

	}

	@GetMapping("/getEmployeedetails/{id}")
	public Employeedetails getEmployeedetails(@PathVariable Integer id) {
		return employeeService.getEmployeedetails(id);

	}

	@PutMapping("/updateEmployeedetails/{id}")
	public Employeedetails updateEmployeedetails(@RequestBody Employeedetails employee, @PathVariable Integer id) {
		return employeeService.updateEmployeedetails(employee, id);

	}

	@DeleteMapping("/deleteEmployeedetails/{id}")
	public void deleteEmployeedetails(@PathVariable Integer id) {
		employeeService.deleteEmployeedetails(id);
	}

}
