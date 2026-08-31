package com.oops;

public class BankMain {

	public static void main(String[] args) {
		BankAccount b=new BankAccount();
		b.setAccountNumber(1234);
		b.setHolderName("neelu");
		b.setBalance(5000);
		System.out.println(b.getAccountNumber());
		System.out.println(b.getHolderName());
		System.out.println(b.getBalance());
		b.deposit(300);
		b.withdraw(400);

	}

}
