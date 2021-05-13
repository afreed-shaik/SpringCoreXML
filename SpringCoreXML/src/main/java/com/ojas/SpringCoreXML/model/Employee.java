package com.ojas.SpringCoreXML.model;

public class Employee {
	
	int empNo;
	String ename;
	double salary;
	
	Employee() {
		
	}

	public Employee(int empNo, String ename, double salary) {
		
		this.empNo = empNo;
		this.ename = ename;
		this.salary = salary;
	}

	
	public String toString() {
		return this.empNo + " " + this.ename + " " + this.salary;
	}
	
	
}
