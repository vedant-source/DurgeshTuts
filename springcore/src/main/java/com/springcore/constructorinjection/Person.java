package com.springcore.constructorinjection;

import java.util.List;

public class Person {
	
	private String name;
	private int personId;
	private Certificate cert;
	private List<String> subjects;
	
	public Person(String name,int personId,Certificate cert,List<String> subjects) {
		this.name = name;
		this.personId = personId;
		this.cert = cert;
		this.subjects = subjects;
	}
	
	public String toString() {
		return this.personId + " : "+ this.name+" : "+cert+" : "+subjects;
	}

}
