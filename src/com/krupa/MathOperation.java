package com.krupa;

public class MathOperation{
	
	public static void main(String[] args) {
		int x= 10, y=20;
		/*MathOp addop = new AddOp();
		System.out.println("a: " + x + "b: " + y + " MathOp: " 
				+addop.binaryOp(x, y));*/
		
		MathOp addoperation = (a,b)->{
				System.out.println("This is addition");
				return a+b;
			};		
		System.out.println("x: " + x + "y: " + y + " AddOperation: " 
						+ addoperation.binaryOp(x, y));
		
		MathOp subtractoperation = (a,b)->a-b;
		System.out.println("x: " + x + " y: " + y + " SubtractOperation: " 
					+ subtractoperation.binaryOp(x, y));

	}
}
interface MathOp {
	int binaryOp(int a, int b);
}

class AddOp implements MathOp{
	@Override
	public int binaryOp(int a, int b) {
		System.out.println("this is addition");
		return a+b;
	}
}