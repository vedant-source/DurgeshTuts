package com.springcore.constructorinjection;

public class Addition {
	
	private int a;
	private int b;
	
	
	public Addition(double a, double b) {
		super();
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Cons of double,doube");
	}
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Cons of int,int");
	}
	
	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Cons of String,String");
	}
	
	
	public void doSum() {
		System.out.println("Addn : " + (this.a+this.b));;
	} 
	
}
