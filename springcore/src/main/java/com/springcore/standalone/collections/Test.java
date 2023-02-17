package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/alone_config.xml");
		Person p = context.getBean("person1",Person.class);
		System.out.println(p.getFriends());
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(p.getFriends().getClass().getName());
		System.out.println("---------------------------Example of Map Collection-------------------------------");
		System.out.println(p.getFeestructure());
		System.out.println(p.getFeestructure().getClass().getName());
		System.out.println("---------------------------Example of Property Collection-------------------------------");
		System.out.println(p.getProps());
		System.out.println(p.getProps().getClass().getName());
	}

}
