package com.exceptionHandling;

import java.util.Scanner;
public class ATMexcephandling {
//	double balance=10;
	public static void main(String[] args) {
		double balance=1000;
		Scanner sc=new Scanner(System.in);
	System.out.println("enter  withdraw amount");
	
	try {
    String s=sc.next();
    int amount=Integer.parseInt(s);
	}catch(Exception e) { 
		try {	
		System.out.println(balance/0);
		}catch(Exception ae){
			System.out.println("handling arithmetic Exception");
			String s1=null;
			try {
			System.out.println(s1.length());
			}catch(NullPointerException ne) {
				System.out.println("handling NullPointerException  ");
			}
		}
	System.out.println("in catch");
	}   
	
	try {
	int[] transactions= {200,455,788,899};
	for(int i=0;i<transactions.length;i++) {
		System.out.println(transactions[5]);
	}
	}catch(Exception aie) {
		System.out.println("handling aie");
	}
	
	 
	
	}
}

