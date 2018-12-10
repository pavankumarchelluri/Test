/**
 * 
 */
package com.Employee.Spring.Service;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Employee.Address;
import com.Employee.Employee;
import com.Employee.Spring.DAO.EmployeeInfDAO;

/**
 * @author Pavan
 *
 */


@Component
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeInf {

	@Autowired
	private EmployeeInfDAO employeeInfDAO;

	@Override
	public void save() {
		System.out.println("came inside service class");
		Employee employee = setEmpDetails();
		employeeInfDAO.save(employee);

	}

	@Override
	public void update() {
		//employeeInfDAO.update(employee);

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getEmployeeInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @return employee
	 */
	private Employee setEmpDetails() {
		Employee employee = new Employee();
		employee.setDesignation("AnalystI");
		employee.setId(1);
		employee.setSalary("200");
		/*Address address = new Address();
		address.setCity("HYD");
		address.setState("TELANGANA");
		address.setZipcode("500089");
		employee.setAddress(address);*/
		employee.setDoj(null);
		return employee;
	}

	public EmployeeInfDAO getEmployeeInfDAO() {
		return employeeInfDAO;
	}

	public void setEmployeeInfDAO(EmployeeInfDAO employeeInfDAO) {
		this.employeeInfDAO = employeeInfDAO;
	}

}
