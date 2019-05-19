package com.krupa;

public class FunctionInterfaceTester implements FunctionalExample{
	
	@Override
	public void method() {
		System.out.println("This is functional method");
	}
	
	public static void main(String[] args) {
		
		FunctionInterfaceTester fe = new FunctionInterfaceTester();
		fe.method();
		fe.display();
		
		System.out.println(fe.id);
		FunctionalExample.staticmethod();
		
	}

	

}
