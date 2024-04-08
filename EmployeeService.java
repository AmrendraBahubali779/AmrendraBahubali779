package com.example.demo.service;

import java.util.List;

import com.example.demo.modal.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployee();
	void save(Employee employee);
	Employee getById(Long id);
	void deleteViaId(long id);
}
