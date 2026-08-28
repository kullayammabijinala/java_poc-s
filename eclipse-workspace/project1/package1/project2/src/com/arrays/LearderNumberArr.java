package com.arrays;

import java.util.Arrays;

public class LearderNumberArr {

	public static void main(String[] args) {
	leader();
		transpose();
		transpose1();
	}
	static void leader() {
		int[] arr= {16,17,4,3,5,2};
		int leader=arr[arr.length-1];
		System.out.println(leader);	
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]>leader) {
				
				leader=arr[i];
			System.out.println(leader);	
			}
		}
		
	}
	static void transpose() {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					int temp=arr[i][j];
					arr[i][j]=arr[j][i];
					arr[i][j]=temp;
				}
				System.out.println(arr[j][i]);
				}
			}
	}
		
		static void transpose1() {
			int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
//			int[][] result=new int[3][3];
			for(int i=0;i<arr.length;i++) {
				int[][] result=new int[3][3];
				for(int j=0;j<arr.length;j++) {
				result[i][j]=arr[j][i];
				
				System.out.print(result[i][j]);
	}
					}
			
		}
		}
	

