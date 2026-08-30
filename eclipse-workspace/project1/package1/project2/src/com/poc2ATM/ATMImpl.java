package com.poc2ATM;

import java.util.Scanner;

public class ATMImpl implements ATM {

    Scanner sc = new Scanner(System.in);

    int balance = 10000;
    int currentPin = 1234;

    @Override
    public boolean validatePin() {

        System.out.println("Enter PIN:");
        int enteredPin = sc.nextInt();

        if (enteredPin == currentPin) {
            System.out.println("PIN verified successfully");
            return true;
        } else {
            System.out.println("Incorrect PIN");
            return false;
        }
    }

    @Override
    public void checkBalance() {

        System.out.println("Current balance: ₹" + balance);
    }

    @Override
    public void deposit() {

        System.out.println("Enter deposit amount:");
        int depositAmount = sc.nextInt();

        if (depositAmount > 0) {

            balance = balance + depositAmount;

            System.out.println("Amount deposited successfully");
            System.out.println("Current balance: ₹" + balance);

        } else {

            System.out.println("Deposit amount must be greater than 0");
        }
    }

    @Override
    public void withdraw() {

        System.out.println("Enter withdrawal amount:");
        int withdrawAmount = sc.nextInt();

        int minimumBalance = 500;

        if (withdrawAmount > 0 &&
            withdrawAmount <= balance - minimumBalance) {

            balance = balance - withdrawAmount;

            System.out.println("Amount withdrawn successfully");
            System.out.println("Current balance: ₹" + balance);

        } else {

            System.out.println("Withdrawal failed");
            System.out.println("You must maintain minimum balance of ₹500");
        }
    }

    @Override
    public void changePin() {

        System.out.println("Enter current PIN:");
        int oldPin = sc.nextInt();

        if (oldPin == currentPin) {

            System.out.println("Enter new PIN:");
            int newPin = sc.nextInt();

            if (newPin >= 1000 &&
                newPin <= 9999 &&
                newPin != currentPin) {

                currentPin = newPin;

                System.out.println("PIN changed successfully");

            } else {

                System.out.println("Invalid new PIN");
            }

        } else {

            System.out.println("Incorrect current PIN");
        }
    }

    public static void main(String[] args) {

        ATMImpl atm = new ATMImpl();

    }
}