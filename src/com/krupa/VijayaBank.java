package com.krupa;

public class VijayaBank implements Bank{

	String bankName = "VijayaBank";
	@Override
	public void interestRate(double rate) {
//		rate = 7.5;
		System.out.println("Interest rate: "+rate);
		
	}

	@Override
	public boolean goldLoan() {
		System.out.println("Gold loan provided: "+true);
		return true;
	}

	@Override
	public void lockerRate(double rate) {
//		rate =1000.00;
		System.out.println("locker Rate: "+rate);
	}

}
