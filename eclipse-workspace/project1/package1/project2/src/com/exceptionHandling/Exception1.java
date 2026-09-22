package com.exceptionHandling;
import java.util.Scanner;
public class Exception1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter one string");
		String str1=sc.next();
		System.out.println("enter second string");
		String str2=sc.next();
		int x=Integer.parseInt(str1);
		int y=Integer.parseInt(str2);
		
		try {
		System.out.println(x/y);
		}catch(ArithmeticException ae) {
			System.out.println("handing ArithmeticException");	
		}
		
		System.out.println("********************");
		System.out.println("all exceptions are handling");
		
		
		
		
       System.out.println("*********NumberFormatException*********");
		try {
			String s="one";
			int a=Integer.parseInt(s);
		System.out.println(a);
		System.out.println("exception");
		}
		catch(NumberFormatException ne) {
			System.out.println("handling numberformatexcepton");
			ne.toString();
		}
		
		
		System.out.println("--------StringIndexOutOfBoundsException---------");
		String s1="ankitha";
		System.out.println(s1.length());
		try {
		System.out.println(s1.charAt(9));
		}
		catch(StringIndexOutOfBoundsException se) {
			System.out.println(" handling StringIndexOutOfBoundsException");
			se.getMessage();
		}
		
		
		
		
		
		System.out.println("----------InputMismatchException---------");
		System.out.println("enter a1 number");
		try {
			int a1=sc.nextInt();
		System.out.println(a1);
		}
		catch(Exception ie) {
			System.out.println(" handling InputMismatchException");
			ie.printStackTrace();
			ie.getMessage();
		}
		System.out.println("uncehcked Exceptions are completed");
		
		
		
		System.out.println("-------ArrayIndexOutOfBoundsException------");
		
		 int[] arr=new int[6];
		 try {
		 arr[0]=10;
		 arr[1]=20;	
		 arr[2]=30;
		 arr[3]=40;	
		 arr[4]=50;	
		 arr[5]=60;	
		 arr[6]=70;
		 }catch(ArrayIndexOutOfBoundsException ae) {
			 System.out.println(" handling ArrayIndexOutOfBoundsException");
			 ae.toString();
		 }
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);	 
		 }
			
	
	}

}
