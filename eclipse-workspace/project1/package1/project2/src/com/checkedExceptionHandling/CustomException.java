package com.checkedExceptionHandling;

import java.util.Scanner;


public class CustomException {

	public static void main(String[] args) throws Exception  {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("Registration succeussfully completed");
		} else {
			throw new InputageException();
		}
		
		System.out.println("enter password");
		String password =sc.next();
		int len=password.length();
		System.out.println(len);
		if(len>=8) {
			System.out.println("password is correct");
		}else {
			throw new InputpasswordException();
		}
		
	}	
}