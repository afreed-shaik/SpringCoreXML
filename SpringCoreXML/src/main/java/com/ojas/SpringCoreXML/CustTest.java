package com.ojas.SpringCoreXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.SpringCoreXML.config.StudentConfig;
import com.ojas.SpringCoreXML.model.Customer;
import com.ojas.SpringCoreXML.model.Student;

public class CustTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new 
				ClassPathXmlApplicationContext("customeraddress.xml");
        Customer c = (Customer) ac.getBean("custObj");
        System.out.println(c);

	}

}
