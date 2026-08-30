package com.poc2ATM;

public interface ATM {
	boolean validatePin();
	void checkBalance();
	void deposit();
	void withdraw();
	void changePin();

}
