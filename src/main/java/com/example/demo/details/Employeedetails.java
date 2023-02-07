package com.example.demo.details;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employeedetails {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String company;
	private double number;
	public Employeedetails(int id, String name, String company, double number) {
		super();
		this.id = id;
		this.name = name;
		this.company =company;
		this.number = number;
	}
	
	public Employeedetails() {
		
	}
	public int getid() {
		return id;
	}
	public void setid( int id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getcompany() {
		return company;
	}
	public void setcompany(String company) {
		this.company = company;
	}
	public double getnumber() {
		return number;
	}
	public void setnumber( double number) {
		this.number = number;
	}
	
		// TODO Auto-generated method stub
		
	}



