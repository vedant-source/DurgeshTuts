package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component("stud")
public class Student {
	public void study() {
		System.out.println("Im studying...!!!");
	}
}
