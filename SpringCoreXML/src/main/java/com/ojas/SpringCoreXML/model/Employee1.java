package com.ojas.SpringCoreXML.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee1 {
	private int empId;
	private String empName;
	private List<String> empSkillset;
	private Map<String, String> empProjects;
	private Set<String> empPhonenos;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getEmpSkillset() {
		return empSkillset;
	}
	public void setEmpSkillset(List<String> empSkillset) {
		this.empSkillset = empSkillset;
	}
	public Map<String, String> getEmpProjects() {
		return empProjects;
	}
	public void setEmpProjects(Map<String, String> empProjects) {
		this.empProjects = empProjects;
	}
	public Set<String> getEmpPhonenos() {
		return empPhonenos;
	}
	public void setEmpPhonenos(Set<String> empPhonenos) {
		this.empPhonenos = empPhonenos;
	}
	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empName=" + empName + ", empSkillset=" + empSkillset + ", empProjects="
				+ empProjects + ", empPhonenos=" + empPhonenos + "]";
	}
	
	
}
