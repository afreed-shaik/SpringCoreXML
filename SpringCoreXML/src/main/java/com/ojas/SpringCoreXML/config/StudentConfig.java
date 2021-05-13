package com.ojas.SpringCoreXML.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ojas.SpringCoreXML.model.Student;

@Configuration
public class StudentConfig {
	
	@Bean(value="mystudent")
	public Student createStudent() {
		Student s = new Student();
		s.setSname("Afreed Shaik");
		return s;
	}
}
