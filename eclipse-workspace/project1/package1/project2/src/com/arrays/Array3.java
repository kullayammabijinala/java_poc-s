package com.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= new int[10];
	
		for(int i=0;i<arr.length;i++) {
		System.out.println("enter marks");
			arr[i]=sc.nextInt();
		    if(arr[i]>25 && arr[i]<=35) {
				arr[i]=30;
				System.out.println(arr[i]);
			}
		    else if(arr[i]>35 && arr[i]<=45){
			 arr[i]=40	;
			 System.out.println(arr[i]);
			}
			else if(arr[i]>45 && arr[i]<=55) {
				arr[i]=50;
				System.out.println(arr[i]);
			}
			else if(arr[i]>55 && arr[i]<=65) {
				arr[i]=60;
				System.out.println(arr[i]);
			}
			else if(arr[i]>65 && arr[i]<=75) {
				arr[i]=70;
				System.out.println(arr[i]);
			}
			else if(arr[i]>75 && arr[i]<=85) {
				arr[i]=80;
				System.out.println(arr[i]);
			}
			else if(arr[i]>85 && arr[i]<=95) {
				arr[i]=90;
				System.out.println(arr[i]);
			}
			else if(arr[i]>95 && arr[i]<=100) {
				arr[i]=100;
				System.out.println(arr[i]);
			}
			
			else {
				System.out.println("fail");
			}
			
		}
		
		
		int[] marks= {56,76,45,34,56,78};
		for(int i=0;i<marks.length;i++) {
			int l=i%10;
			int f=i/10;
			
			if(l>=5) {
				marks[i]=(f+1)*10;
			}
		}
		System.out.println(Arrays.toString(marks));
	
			
		
	}	
}