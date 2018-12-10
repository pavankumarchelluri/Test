/**
 * 
 */
package com.Employee;

import static org.junit.Assert.fail;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

/**
 * @author Pavan
 *
 */
@Entity
@Table(name = "EMPLOYEENEW")
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4184892888379331067L;
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column(name = "DESIGNATION", length = 20, nullable = false)
	private String designation;
	@Column(name = "SALARY", nullable = false, length = 20)
	private String salary;
	@Column(name = "DATEOFJOINING", nullable = true)
	private Date doj;

	//private Address address;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	/*public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}*/

}
