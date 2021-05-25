package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeRepo;
import com.example.demo.entity.Employee;

@Service
public class EmployeeService {
@Autowired 
EmployeeRepo repo;
public List<Employee> getallemployees()
{
	return repo.findAll();
}
public Employee getemployeeById(int id)
{
	return repo.getById(id);
}
public Employee getemployeeBySkills(String Skills)
{
	return repo.findBySkills();
}
public void remove(int id)
{
 repo.deleteById(id);
}
public Employee saveEmployee(Employee employee)
{
	return repo.save(employee);
}
}