package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDao;
import com.employee.model.Employee;

@Service
public class EmployeeReadOnlyServiceImpl implements EmployeeReadOnlyService {
   
  @Autowired
  private EmployeeDao empDao;
  
  @Override
public List<Employee>  findAll() {
	  System.out.println(" In Find All - read only service ");
	  return empDao.findAll();
  }
  
  @Override
public Employee findById(int empId) {
	  return empDao.findByEmpId(empId);
  }
  
  @Override
public Employee findByName(String empName) {
	  return empDao.findByName(empName);
  }
  
}
