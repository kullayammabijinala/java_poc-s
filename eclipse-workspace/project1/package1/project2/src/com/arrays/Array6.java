package com.arrays;
import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		int min=arr[0];
		int max=arr[0];
		int counteven=0;
		int countodd=0;
		for(int i=1;i<arr.length;i++) {
			System.out.println("enter number");
			arr[i]=sc.nextInt();
			if(arr[i]%2==0) {
				counteven++;
			}else {
				countodd++;
			}
			
			if(min>arr[i]) {
				min=arr[i];
				System.out.println(min);
			}if(max>arr[i]) {
				max=arr[i];
				System.out.println(max);
			}	
		}
	//	System.out.println(min);
//		System.out.println(max);
		System.out.println(counteven);
		System.out.println(countodd);
		// TODO Auto-generated method stub

	}

}
