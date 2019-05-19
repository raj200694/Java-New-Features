package com.krupa;

public class InnerClassExample {

	public static void main(String[] args) {
		X x = new X();
		x.method1();
		
		/*X.Y y = x.new Y();
		y.method2();*/
	}
}


class X{
	private int num = 10;
	void method1() {
		System.out.println("Class A method1");
		Y y = new Y(){
			void method2() {
				System.out.println("Class B method2: "+ num);
			}
		};
	}
	
	class Y{
		void method2() {
			System.out.println("Class B method2: "+ num);
		}
	}
	
}