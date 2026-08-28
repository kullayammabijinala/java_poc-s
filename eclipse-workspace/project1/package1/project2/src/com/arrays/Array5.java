package com.arrays;

public class Array5 {

	public static void main(String[] args) {
		two_d_arr1();
		two_d_arr2();
		two_d_arr3();
	}
	static void two_d_arr1() {
		int[][] arr= new int[3][3];
		arr[0][0]=87;
		arr[0][1]=85;
	    arr[0][2]=86;
		
		
		arr[1][0]=87;
		arr[1][1]=85;
	    arr[1][2]=86;
		
	   arr[2][0]=87;
		arr[2][1]=85;
	    arr[2][2]=86;
		
		
	for(int[] n:arr) {
		for(int n1:n )
		System.out.print(n1+" ");
		System.out.println();
		}
	System.out.println("**********************");
	
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}	
	}
	
	
	static void two_d_arr2() {
		int[][] arr= new int[2][];
		arr[0]=new int[3];
		arr[1]=new int[2];
		 for(int[] n:arr) {
			 for(int n1:n) {
				 System.out.print(n1+ " ");
			 }
			 System.out.println();		 
		 }
	}
	
	
	static void two_d_arr3() {
		String[][] names= {{"anu"},{"reems","jhfu"},{"fhurhfu","hfur","gry"},{"gfy","furf"}};
		for(String[] name:names) {
			for(String nms:name) {
				System.out.print(nms+" ");
			}
			System.out.println();	
		}
	}
	
	

}
