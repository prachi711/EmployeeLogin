package com.cts.employee.bean;

public class EmployeeM {
	
	private String empId;
	private String firstName;
	private String lastname;
	private float salary;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public EmployeeM(String empId, String firstName, String lastname, float salary) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastname = lastname;
		this.salary = salary;
	}
	
	
	
	

}
