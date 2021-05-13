package com.ojas.SpringCoreXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.ojas.SpringCoreXML.model.Employee1;

public class Employee1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new 
				ClassPathXmlApplicationContext("employee1Context.xml");
        Employee1 emp= (Employee1) ac.getBean("empObj");
        System.out.println(emp);
	}

}
