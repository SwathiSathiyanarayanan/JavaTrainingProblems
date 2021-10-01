package com.wissen.JavaPracticePrograms;

import java.util.HashSet;

public class A {

	static HashSet<Class> thereCanBeOnlyOneClass=new HashSet();
	
	public A() {
		Class c=this.getClass();
		if(thereCanBeOnlyOneClass.contains(c))
			throw new RuntimeException();
		thereCanBeOnlyOneClass.add(c);
	}
	
	static public class B extends A{}
	
	static public class C extends A{}
	
	public static void main(String[] args) {
		A a1=new A();
		System.out.println("A Object Created");
		B b1=new B();
		System.out.println("B Object Created");//OK
		C c1=new C();
		System.out.println("C Object Created");//Ok
		
		C c2=new C();
		System.out.println("C Object Creation Failed");//throws exception
	}
	
	
}
