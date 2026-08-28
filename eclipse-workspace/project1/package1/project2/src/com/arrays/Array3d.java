package com.arrays;
import java.util.Scanner;

public class Array3d {

	public static void main(String[] args) {
		
		sum();
		leftdiagona();
		rightdiagona();
		Scanner sc=new Scanner(System.in);	
	int[][] arr=new int[3][3];
	int sum=0;
	  System.out.println(" enter a number");  
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {		
		arr[i][j]=sc.nextInt();
			sum+=arr[i][j];	
		}	
	}
		System.out.println(sum);
	}
	
	
	
	 static void sum() {
		 int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
			int sum=0;

			for(int n[]:arr) {
				for(int n1:n) {
					sum+=n1;
				}
			}
			System.out.println("sum of the elements:"+sum);
		 
	 }
	 
	 static void leftdiagona() {
		 int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {		

					if(i==j) {
						sum+=arr[i][j];
								}
				}
					}
			System.out.println("left diagonal sum :" +sum);


		 
	 }
	 
	 static void rightdiagona() {
		 int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {		

					if((i+j)==arr.length-1) {
						sum+=arr[i][j];
								}
				}
					}
			System.out.println("right diagonal sum : "+sum);
	 
	 }

}
