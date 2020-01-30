package com.employee.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.employee.config.EmployeeConfiguration;
import com.employee.model.Employee;
import com.employee.service.EmployeeReadOnlyService;
import com.employee.service.EmployeeService;

public class EmployeeController {
	public static void main(String[] args) {
		AbstractApplicationContext ac=new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
		
		Employee emp = new Employee();
		emp.setEmpId(1);
		emp.setEmpName("Test 1");
		
		EmployeeService es = ac.getBean(EmployeeService.class);
		es.saveEmployee(emp);
		
		EmployeeReadOnlyService empReadOnlyService = ac.getBean(EmployeeReadOnlyService.class);
		empReadOnlyService.findById(1);
	}
}
