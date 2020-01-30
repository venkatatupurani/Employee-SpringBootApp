package com.employee.service;

import java.util.List;

import com.employee.model.Employee;

public interface EmployeeReadOnlyService {

	List<Employee> findAll();

	Employee findById(int empId);

	Employee findByName(String empName);

}