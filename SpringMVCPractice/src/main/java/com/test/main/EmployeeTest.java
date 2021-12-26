package com.test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Employee.Spring.Configuration.EmployeeConfig;
import com.Employee.Spring.Service.EmployeeInf;

//test
public class EmployeeTest {
	
 public static void main(String[] args) {
	
	 ApplicationContext context= new AnnotationConfigApplicationContext(EmployeeConfig.class);
	 EmployeeInf inf =context.getBean(EmployeeInf.class);
	 inf.save();
}

}
