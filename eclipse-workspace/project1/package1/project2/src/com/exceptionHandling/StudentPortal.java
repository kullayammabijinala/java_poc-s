package com.exceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class StudentPortal {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		try {
		System.out.println("enter student name:");
		String Sname=sc.next();
		
		}
		catch(NullPointerException ne) {
			System.out.println("null pointer exception handling");
			ne.printStackTrace();
		}
		
		try {
		System.out.println("enter student age:");
		int  age=sc.nextInt();
		}
		catch(InputMismatchException ime) {
		System.out.println("handling inputmismatchexception");
		ime.printStackTrace();
		}
		
		System.out.println("enter size ");
		int size=sc.nextInt();
		int sum=0;
		try {
		for(int i=0;i<size;i++) {
	System.out.println("enter Student marks");
		int[] marks= new int[size];
		marks[i]=sc.nextInt();
		sum+=marks[i];
		
		System.out.println(marks[8]);
		System.out.println(sum/marks.length);
		}
		}
		catch(Exception e) {
			System.out.println("handling ArrayIndexOutOfBoundsException");
			System.out.println("handling arithmetic exception");
		}
		finally {
			System.out.println("handling unchecked exceptions are completed ");
		}
		
	}

}
