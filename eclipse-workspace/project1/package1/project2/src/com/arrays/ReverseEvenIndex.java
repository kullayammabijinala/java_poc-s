package com.arrays;

import java.util.Arrays;

public class ReverseEvenIndex {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int temp;
		for(int i=0;i<arr.length;i++) {
				if(i%2==0) {
					int start=0;
					int end=arr.length-1;
					while(start<=end) {
				 temp=arr[i][start];
					arr[i][start]=arr[i][end];
					arr[i][end]=temp;
					start++;
					end--;
					}
					for(int j=0;j<arr[i].length;j++)
			if((i!=j) &&( i%2!=0)) {
					arr[i][j]*=2;	
				}
			}
			 }
	for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			if(i==j) {
				arr[i][j]*=arr[i][j];
			}
			}	
	}
	System.out.println(Arrays.deepToString(arr));
}
}


		
