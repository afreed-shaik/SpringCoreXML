package com.ojas.SpringCoreXML.model;

import org.springframework.stereotype.Component;

//Student student = new Student();
@Component
public class Student {
	String sname;

	public void setSname(String sname) {
		this.sname = sname;
	}



	public String dispName() {
		return "Hello " + sname;
	}
}
