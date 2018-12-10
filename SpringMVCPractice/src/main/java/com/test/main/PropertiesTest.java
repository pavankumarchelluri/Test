package com.test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Employee.Spring.Configuration.EmployeeConfig;
import com.datasource.DataSourceProperties;

public class PropertiesTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		DataSourceProperties daProperties = context.getBean(DataSourceProperties.class);
		System.out.println("Dialect is"+daProperties.getDialect());
		System.out.println("UserName is"+daProperties.getUserName());
	}

}
