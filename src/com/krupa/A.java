package com.krupa;

public interface A {
	
	/*//Abstract method not allowed 
	void method1();*/
	default void method1() {
		System.out.println("method1");
	}
	//Static method

}

@FunctionalInterface
interface B extends A{
	
	//Abstract method
	void method2();
}

interface C extends B{
	//Inheriting functional Interface
	//Abstract method 
	void method3();
	
}
