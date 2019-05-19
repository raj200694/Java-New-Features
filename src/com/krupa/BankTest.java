package com.krupa;

public class BankTest {
	
	public static void main(String[] args) {
		
		VijayaBank vj = new VijayaBank();
		System.out.println("Bank Name: "+vj.bankName);
		vj.goldLoan();
		vj.interestRate(7.65);
		vj.lockerRate(1000.00);
		System.out.println("Note Ban: "+vj.noteBan());
		vj.InternetBanking();
		
		SyndicateBank sd = new SyndicateBank();
		System.out.println("Bank Name: "+sd.bankName);
		sd.goldLoan();
		sd.interestRate(8.00);
		sd.lockerRate(500.00);
		System.out.println("Note Ban: "+sd.noteBan());
		sd.InternetBanking();
		
		Bank.display();
		
	}

}
