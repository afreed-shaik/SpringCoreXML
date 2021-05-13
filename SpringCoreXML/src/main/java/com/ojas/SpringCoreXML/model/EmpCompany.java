package com.ojas.SpringCoreXML.model;

public class EmpCompany {    
	private String companyName;    
	private String companyLocation;     
	
	public EmpCompany() {        
		super();    
	}     
	
	public EmpCompany(String companyName, String companyLocation) {        
		super();        
		this.companyName = companyName;        
		this.companyLocation = companyLocation;    
	}     
	
	@Override    
	public String toString() {        
		return "EmpCompany [companyName=" + companyName + ", companyLocation=" + companyLocation + "]";    
	}     
	
	public String getCompanyName() {        
		return companyName;    
	}     
	
	public void setCompanyName(String companyName) {        
		this.companyName = companyName;    
	}     
	
	public String getCompanyLocation() {        
		return companyLocation;    
	}     
	
	public void setCompanyLocation(String companyLocation) {        
		this.companyLocation = companyLocation;    
	} 
}
