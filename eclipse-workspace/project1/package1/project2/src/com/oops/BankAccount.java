package com.oops;

public class BankAccount {
	
	int accountNumber;
	String holderName;
	 private double balance=5000;
	 
	 void deposit(double amount) { 
		 if(amount>0) {
		 balance+=amount;
		 System.out.println(balance);
		 }	 
	 }
	
	 void withdraw(double amount) {
		 if(balance>0 && amount<=balance-500) {
		 balance-=amount;
		 System.out.println(balance);
		 }
		 
	 }
	
	public int getAccountNumber() {
		return accountNumber;
	}
	 public void setAccountNumber(int accountNumber) {
		 this.accountNumber = accountNumber;
	 }

	 public String getHolderName() {
		 return holderName;
	 }

	 public void setHolderName(String holderName) {
		 this.holderName = holderName;
	 }

	 public double getBalance() {
		 return balance;
	 }

	 public void setBalance(double balance) {
		 this.balance = balance;
	 }


}
