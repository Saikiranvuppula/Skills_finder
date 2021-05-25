package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController

 public class EmployeeController 
{
@Autowired
	EmployeeService service;
@GetMapping("/employee")
 private List<Employee> getallEmployees()
{
 return service.getallemployees();
}
	
@GetMapping("/employee/{id}") 
private Employee getEmployee(@PathVariable("id")  int id)
	{
		return service.getemployeeById(id);
	}
@GetMapping("/employee/{Skills}")
public Employee getemployee(@PathVariable("skills") String skills)
{
	return service.getemployeeBySkills(skills);
}
@PostMapping("/employee")
public Employee saveEmployee(Employee employee)
{
	return service.saveEmployee(employee);
}
@DeleteMapping("/employee")
public void removeEmployee(@PathVariable("id") int id)   
{  
service.remove(id);
}  
}

