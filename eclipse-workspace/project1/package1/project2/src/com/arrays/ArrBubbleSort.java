package com.arrays;

import java.util.Arrays;

public class ArrBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,5,3,6,2,7};
        int temp=0;
        for(int i=0;i<arr.length;i++) {
        	boolean flag=false;
        	for(int j=0;j<arr.length-1-i;j++) {
        		if(arr[j]>arr[j+1]) {
        			temp=arr[j];
        			arr[j]=arr[j+1];
        			arr[j+1]=temp;
        			flag=true;	
        		}
        	}
        	if(!flag) {
        		break;
        	}  	
      }
        System.out.println(Arrays.toString(arr));
        
        }

}
