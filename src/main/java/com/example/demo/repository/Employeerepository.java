package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.details.Employeedetails;

@Repository
public interface Employeerepository extends JpaRepository<Employeedetails,Integer>{

}
