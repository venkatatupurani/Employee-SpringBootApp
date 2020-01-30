package com.employee.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan({"com.employee"})
@ComponentScans( value = {@ComponentScan("com.employee.service"),@ComponentScan("com.employee.dao")})
public class EmployeeConfiguration {
	
}
