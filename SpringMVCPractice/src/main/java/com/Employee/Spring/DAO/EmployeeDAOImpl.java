package com.Employee.Spring.DAO;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Employee.Employee;


@Repository
public class EmployeeDAOImpl implements EmployeeInfDAO {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	/**
	 * Save the Employee Information in Database
	 */
	public void save(Employee employee) {
		System.out.println("Came Inside the SaveDAO Method");
		getCurrentSession().save(employee);

	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getEmployeeInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
