package com.krupa;

public interface Bank {
	
	void interestRate(double rate);
	boolean goldLoan();
	void lockerRate(double rate);

	default boolean noteBan() {
		return true;
	}
	
	default void InternetBanking() {
		System.out.println("Supporting internet banking");
	}
	
	static void display() {
		System.out.println("This is static method");
	}
}
