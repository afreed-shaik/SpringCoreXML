package com.ojas.SpringCoreXML.model;

public class Address {
	private String hno;
	private String colName;
	private String city;
	
	
	public Address(String hno, String colName, String city) {
		this.hno = hno;
		this.colName = colName;
		this.city = city;
	}


	@Override
	public String toString() {
		return "Address [hno=" + hno + ", colName=" + colName + ", city=" + city + "]";
	}
	
	
	
}
