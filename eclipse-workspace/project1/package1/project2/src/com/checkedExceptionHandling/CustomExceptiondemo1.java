package com.checkedExceptionHandling;

import java.util.Scanner;

public class CustomExceptiondemo1 {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username");
		String username=sc.next();
		String username1= "Ankitha";
		
		if(username.equalsIgnoreCase(username1)) {
			System.out.println("username already exists");
			throw new DuplicateUsernameException();		
		}else {
			System.out.println("create a account");	
		}
	}
}
