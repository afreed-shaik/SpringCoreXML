package com.ojas.SpringCoreXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.SpringCoreXML.model.Sample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContent.xml");
//        Sample s = (Sample) ac.getBean("sampleObj");
//        s.display();
    	
    	
    	AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContent.xml");
    	Sample s = (Sample)ac.getBean("sampleObj");
    	s.display();
    	Sample s1 = (Sample)ac.getBean("sampleObj");
    	s1.display();
    	ac.registerShutdownHook();
    }
}
