package com.ojas.SpringCoreXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.SpringCoreXML.config.StudentConfig;
import com.ojas.SpringCoreXML.model.Employee;
import com.ojas.SpringCoreXML.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new 
				AnnotationConfigApplicationContext(StudentConfig.class);
        Student s = (Student) ac.getBean("mystudent");
        System.out.println(s.dispName());
	}

}
