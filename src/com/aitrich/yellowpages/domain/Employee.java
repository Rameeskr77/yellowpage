package com.aitrich.yellowpages.domain;

public class Employee {
	private int employeeId;
	private String employeeName;
	private	String employeeDesignation;
	private String employeeCity;
	private String employeeGenter;
	private int employeeNumber;
	private Company company;
	public Employee() {
		this.employeeId=0;
		this.employeeName=null;
		this.employeeDesignation=null;
		this.employeeCity=null;
		this.employeeGenter=null;
		this.employeeNumber=0;
//		this.company=null;
	}
	public Employee(int empId,String empName,String empDesig,String empCity,String empGenter,int empnum,Company company) {
		this.employeeId=empId;
		this.employeeName=empName;
		this.employeeDesignation= empDesig;
		this.employeeCity=empCity;
		this.employeeGenter=empGenter;
		this.employeeNumber=empnum;
		 this.company=company;
	}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int id) {
	this.employeeId=id;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String name) {
	this.employeeName=name;
}
public String getEmployeeDesignation() {
	return employeeDesignation;
}
public void setEmployeeDesignation(String designation) {
	this.employeeDesignation=designation;
}
public String getEmployeeCity() {
	return employeeCity;
}
public void setEmployeeCity(String city) {
	this.employeeCity=city;
}
public String getEmployeeGenter() {
	return employeeGenter;
}
public void setEmployeeGenter(String genter) {
	this.employeeGenter=genter;
}
public int getEmployeeNumber() {
	return employeeNumber;
}
public void setEmployeeNumber(int number) {
	this.employeeNumber=number;
}
public Company getEmployeeCompany() {
	return company;
}
public void setEmployeeCompany(Company company) {
	this.company=company;
}

@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDesignation="
			+ employeeDesignation + ", employeeCity=" + employeeCity + ", employeeGenter=" + employeeGenter
			+ ", employeeNumber=" + employeeNumber + ", company=" + company + "]";
}

}
