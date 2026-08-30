package com.poc2ATM;

public class ATMMain extends ATMImpl {

	public static void main(String[] args) {
		 ATMMain atm1=new ATMMain();
	      if (atm1.validatePin()) {
	            int choice;
	            do {
	                System.out.println("\n===== ATM MENU =====");
	                System.out.println("1. Check Balance");
	                System.out.println("2. Deposit");
	                System.out.println("3. Withdraw");
	                System.out.println("4. Change PIN");
	                System.out.println("5. Exit");

	                System.out.println("Enter your choice:");
	                choice = atm1.sc.nextInt();

	                switch (choice) {

	                case 1:
	                    atm1.checkBalance();
	                    break;

	                case 2:
	                    atm1.deposit();
	                    break;

	                case 3:
	                    atm1.withdraw();
	                    break;

	                case 4:
	                    atm1.changePin();
	                    break;

	                case 5:
	                    System.out.println("Thank you for using ATM");
	                    break;

	                default:
	                    System.out.println("Invalid choice");
	                }

	            } while (choice != 5);

	        } else {

	            System.out.println("Access denied");
	        }
	    }

	}


