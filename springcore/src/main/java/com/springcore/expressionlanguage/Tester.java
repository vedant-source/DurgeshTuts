package com.springcore.expressionlanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/expressionlanguage/elconfig.xml");
		
		Demo d1 = (Demo) con.getBean("demo");
		System.out.println(d1);
	}

}
