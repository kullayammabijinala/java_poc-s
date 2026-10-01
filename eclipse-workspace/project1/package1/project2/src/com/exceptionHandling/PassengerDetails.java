package com.exceptionHandling;
import java.util.*;
public class PassengerDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("enter passenger Id");
		String pId=sc.next();
		int pid1=Integer.parseInt(pId);
		
		System.out.println("enter passenger age");
		String age=sc.next();
		int page=Integer.parseInt(age);
		
		System.out.println("enter passenger seatNumber");
		String seatnumber=sc.next();
		int pseatno=Integer.parseInt(seatnumber);
		}
		catch(NumberFormatException ne) {
			System.out.println("handling numberformat exceptions");
		}
		catch(NullPointerException npe) {
			System.out.println("handling  Nullpointer exceptions");
		}
		
		try {
		System.out.println("enter number Of Passenger");
		int numberOfPassenger=sc.nextInt();
		
		System.out.println("enter total baggage");
		int baggage=sc.nextInt();
		
		int avg_baggage=baggage/numberOfPassenger;
		System.out.println(avg_baggage);
		}
		
		catch(InputMismatchException ie) {
			System.out.println("handling  InputMismatchException");	
		}
		catch(ArithmeticException ae) {
			System.out.println("handling ArithmeticException");	
		}
		  try {
		 Object[] arr= {101,"anu",45,"nandhyal","s23"};
		 System.out.println(arr[6]);
		  }
		  catch(ArrayIndexOutOfBoundsException ae) {
			  System.out.println("handling ArrayIndexOutOfBoundsException");  
		  }
		  
		  System.out.println("exceptions are completed");
	}

}
