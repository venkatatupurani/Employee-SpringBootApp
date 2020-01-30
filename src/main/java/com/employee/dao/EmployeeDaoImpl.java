package com.employee.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.employee.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Employee> findAll() {
		System.out.println(" Find All method-- ");
		return null;
	}
	
	
	@Override
	public boolean saveEmployee(Employee e) {
		System.out.println(" Saving Employee ");
		return true;
	}
	
	
	@Override
	public void deleteById(int empId) {
		System.out.println(" Deleting Emp Id :  "+empId);
	}
	
	
	@Override
	public Employee findByEmpId(int empId) {
		System.out.println(" Finding Employee Id : "+empId);
		return null;
	}
	
	@Override
	public Employee findByName(String name) {
		System.out.println(" Finding Employee Name : "+name);
		return null;
	}
}
