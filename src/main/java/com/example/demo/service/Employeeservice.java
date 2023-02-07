package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.details.Employeedetails;
import com.example.demo.repository.Employeerepository;

@Service
public class Employeeservice {

	@Autowired
	private Employeerepository employeerepository;

	public Employeedetails createEmployeedetails(Employeedetails employee) {
		return employeerepository.save(employee);

	}

	public Employeedetails getEmployeedetails(Integer id) {
		Employeedetails emp = employeerepository.findById(id).orElse(null);
		return emp;
	}

	public Employeedetails updateEmployeedetails(Employeedetails employee, Integer id) {
		Employeedetails emp = employeerepository.findById(id).orElse(null);
		if (emp == null) {
			return null;
		}
		emp.setname(employee.getname());
		emp.setcompany(employee.getcompany());
		emp.setnumber(employee.getnumber());

		return employeerepository.save(emp);
	}

	public void deleteEmployeedetails(Integer id) {
		employeerepository.deleteById(id);
	}
}
