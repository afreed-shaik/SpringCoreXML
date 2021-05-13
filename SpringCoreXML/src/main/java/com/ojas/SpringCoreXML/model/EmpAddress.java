package com.ojas.SpringCoreXML.model;


public class EmpAddress {    
	private String city;    
	private String Country;    
	private int houseNo;     
	
	public EmpAddress() {        
		super();    
	}     
	
	public EmpAddress(String city, String country, int houseNo) {        
		super();        
		this.city = city;        
		Country = country;        
		this.houseNo = houseNo;    
	}     
	
	@Override    
	public String toString() {        
		return "EmpAddress [city=" + city + ", Country=" + Country + ", houseNo=" + houseNo + "]";    
	}     
	
	public String getCity() {        
		return city;    
	}     
	
	public void setCity(String city) {        
		this.city = city;    
	}     
	
	public String getCountry() {        
		return Country;    
	}     
	
	public void setCountry(String country) {        
		Country = country;    
	}     
	
	public int getHouseNo() {        
		return houseNo;    
	}     
	
	public void setHouseNo(int houseNo) {        
		this.houseNo = houseNo;    
	} 
}

