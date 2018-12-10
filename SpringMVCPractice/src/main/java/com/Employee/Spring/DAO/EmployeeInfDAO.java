package com.Employee.Spring.DAO;

import com.Employee.Employee;

public interface EmployeeInfDAO {
	void save(Employee employee);

	void update(Employee employee);

	void delete(Employee employee);

	Employee getEmployeeInfo();

}
