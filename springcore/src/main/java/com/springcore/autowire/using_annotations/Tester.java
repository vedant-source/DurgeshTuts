package com.springcore.autowire.using_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/using_annotations/autoconfig.xml");
		
		Emp e = (Emp) context.getBean("emp1");
		System.out.println(e);
	}

}