package com.employee.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int empId;
	private String empName;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void display() {
		System.out.println("Id: " + empId);
		System.out.println("Name: " + empName);	
	}
	
}
