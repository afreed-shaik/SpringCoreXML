package com.ojas.SpringCoreXML.model;

public class EmployeeConstr {    
	private int id;    
	private String name;    
	private EmpAddress address;    
	private EmpCompany company;     
	
	public EmployeeConstr(int id, String name, EmpAddress address, EmpCompany company) {        
		super();        
		this.id = id;        
		this.name = name;        
		this.address = address;        
		this.company = company;    
	}     
	
	public void display() {        
		System.out.println(id + " " + name);        
		System.out.println(address.toString());        
		System.out.println(company.toString());    
	}     
	
	public EmployeeConstr() {        
		super();    
	}     
	
	public int getId() {        
		return id;    
	}     
	
	public void setId(int id) {        
		this.id = id;    
	}     
	
	public String getName() {        
		return name;    
	}     
	
	public void setName(String name) {        
		this.name = name;    
	}     
	
	public EmpAddress getAddress() {        
		return address;    
	}     
	
	public void setAddress(EmpAddress address) {        
		this.address = address;    
	}     
	
	public EmpCompany getCompany() {        
		return company;    
	}     
	
	public void setCompany(EmpCompany company) {        
		this.company = company;    
	}     
}