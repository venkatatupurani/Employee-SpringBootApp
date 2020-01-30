package com.employee.dao;

import java.util.List;

import com.employee.model.Employee;

public interface EmployeeDao {

	List<Employee> findAll();

	boolean saveEmployee(Employee e);

	void deleteById(int empId);

	Employee findByEmpId(int empId);

	Employee findByName(String name);

}