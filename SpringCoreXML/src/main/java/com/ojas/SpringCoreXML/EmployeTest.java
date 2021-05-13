package com.ojas.SpringCoreXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.SpringCoreXML.model.Customer;
import com.ojas.SpringCoreXML.model.Employe;

public class EmployeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new 
				ClassPathXmlApplicationContext("employeContext.xml");
        Employe emp= (Employe) ac.getBean("empObj");
        System.out.println(emp);
	}

}
