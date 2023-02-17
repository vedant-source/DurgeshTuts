package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorinjection/ciconfig.xml");
		
		Person p = (Person) context.getBean("p1");

		System.out.println(p);

		Addition ad = (Addition) context.getBean("add");
		ad.doSum();
		
		
	}

}
