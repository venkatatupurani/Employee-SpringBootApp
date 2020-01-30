package com.employee.service;

import java.util.List;

import com.employee.model.Employee;

public interface EmployeeService {

	List<Employee> findAll();

	Employee findById(int empId);

	Employee findByName(String empName);

	void saveEmployee(Employee emp);

	void deleteById(int empId);

}