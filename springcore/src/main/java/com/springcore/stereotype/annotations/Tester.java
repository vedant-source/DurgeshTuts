package com.springcore.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/annotations/stereoconfig.xml");
		
		Student s = context.getBean("ob", Student.class);
		System.out.println(s);
		
//		System.out.println("_______Ex of Singleton Scope of Beans_________");
//		System.out.println("530486389\r\n"
//				+ "530486389");
		
		System.out.println(s.hashCode());
		
		Student s1 = context.getBean("ob", Student.class);
		System.out.println(s1.hashCode());
		
		System.out.println("____________________Teacher bean scope via XML file______________________________________");
		Teacher t = context.getBean("teacher",Teacher.class);
		Teacher t2 = context.getBean("teacher",Teacher.class);
		System.out.println(t.hashCode());
		System.out.println(t2.hashCode());
		
	}

}
