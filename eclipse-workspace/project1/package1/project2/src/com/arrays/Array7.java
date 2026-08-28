package com.arrays;

import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		//print missing values
		int[] arr= {1,2,4,6,8};
		int max=arr[0];
    	int c=0;
		for(int i=1;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]-arr[j])==1) {
					arr[i]=arr[j];
					arr[j]=arr[j]+1;
						
				}else {
					c=arr[i]+1;
					}	
			}
			System.out.println(c);	
		}
		
		//remove duplicates
		int[] arr1= {1,2,2,3,4,4};
		for(int i=0;i<arr1.length;i++) {
			boolean duplicate=false;
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					duplicate=true;
					break;
					
				}
			}
			if(!duplicate) {
				System.out.println(arr1[i]);
			}
			}
		 //System.out.println(Arrays.toString(arr1));	
	}
	
	
	
}
