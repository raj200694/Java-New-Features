package com.krupa;

public class SyndicateBank implements Bank{
	
	String bankName = "SyndicateBank";
	@Override
	public void interestRate(double rate) {
		rate = 8;
		System.out.println(rate);
		
	}

	@Override
	public boolean goldLoan() {
		System.out.println("Gold loan provided: "+false);
		return false;
	}
	
	@Override
	public void InternetBanking() {
		System.out.println("Does not support internet banking ");
	}

	@Override
	public void lockerRate(double rate) {
		rate =500.00;
		System.out.println("locker Rate: "+rate);
	}
}
