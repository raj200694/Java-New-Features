package com.krupa;

@FunctionalInterface
public interface FunctionalExample {
	int id =10; // data variable 
	
	void method(); // single abstract method
	
	default void display() { // multiple default method
		System.out.println("default display");
	}
	
	//Multiple static methods
	static void staticmethod() {
		System.out.println("This is static method");
	}
	//Methods from object class:
	int hashCode();
	boolean equals(Object obj);
}
