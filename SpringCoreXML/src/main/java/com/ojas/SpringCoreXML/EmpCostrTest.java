package com.ojas.SpringCoreXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.SpringCoreXML.model.EmployeeConstr;

public class EmpCostrTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("empConstContext.xml");
		EmployeeConstr e = (EmployeeConstr) ac.getBean("EmpCon");
		e.display();
	}
}
