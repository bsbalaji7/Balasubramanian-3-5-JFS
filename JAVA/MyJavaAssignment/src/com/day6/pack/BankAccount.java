package com.day6.pack;

public class BankAccount {

	//instance variable
	double balance = 10000;
	
	void withdrawal() {
		//local variable
		
		double WithdrawalAmt = 2000;
		balance = balance - WithdrawalAmt;
		
		System.out.println("Remaining Balace: "+ balance);
	};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount acc = new BankAccount();
		acc.withdrawal();
	}

}
