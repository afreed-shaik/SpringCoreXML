package com.ojas.SpringCoreXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.SpringCoreXML.model.Employee;
import com.ojas.SpringCoreXML.model.Sample;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new 
				ClassPathXmlApplicationContext("empContext.xml");
        Employee e = (Employee) ac.getBean("empObj");
        System.out.println(e);
	}

}
