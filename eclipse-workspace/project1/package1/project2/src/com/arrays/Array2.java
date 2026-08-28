package com.arrays;
import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		show();
		Scanner sc=new Scanner(System.in);
		int[] n=new int[5];
		int sum=0;
		for(int i=0;i<n.length;i++) {
			System.out.println("enter a number");
			n[i]=sc.nextInt();
			sum+=n[i];
		}
		
		int sum1=0;
		for(int n1:n) {
			sum1+=n1;
		}
		int avg=sum/n.length;
				System.out.println(sum);
				System.out.println(sum1);
				System.out.println(avg);	
	}
	
	
	static void show() {
		
		int[] arr= {10,20,30,40,50};
		for(int n:arr) {
			System.out.print(n +" ");
		}
		System.out.println("******************");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("******************");
		
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];	
		}
		int avg=sum/arr.length;;
		System.out.println(sum);
		System.out.println(avg);
		
	}

}
