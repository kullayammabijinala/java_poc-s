package com.arrays;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		int[] arr=new int[3];
		System.out.println(arr);
		arr[0]=10;
		arr[1]=25;
		arr[2]=31;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				System.out.println(arr[i]+" "+"even");
			}
			else {
				System.out.println(arr[i]+" "+"odd");
				
			}
			//System.out.println(arr[i]+" ");
		}	
		
		show();
		//show1();
		//show2();
		//main1();
		//show3();
	}
	
	
	
	static void show() {
		int[] arr1= {2,4,7,5,8,9,3};
		int min=arr1[0];
		int max=arr1[0];
		int cntevn=0;
		int cntodd=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]%2==0) {
				cntevn++;
			}
			if(arr1[i]%2!=0) {
				cntodd++;
			}
			if(min>arr1[i]) {
				min=arr1[i];	
			}
			else if(max<arr1[i]) {
				max=arr1[i];	
			}
			else {
				System.out.println("error");
			}
			}
		System.out.println(min);
		System.out.println(max);
		System.out.println(cntevn);
		System.out.println(cntodd);
	System.out.println("**************")	;	
		
	for (int n:arr1) {
		if(min>n)
			min=n;
		if(max<n)
				max=n;	
		}
		System.out.println(min);
		System.out.println(max);
	}
 
	
	
	
	static void show1() {
		int[] arr= {9,5,4,5,3,2,4};
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	

	
	
	static void main1() {
		int[] arr2= {2,4,5,6,7,7};
		int[] arr3= {6,7,5,4,4,4};
		int[] arr4= {arr2.length+arr3.length};
		for(int i=0;i<arr2.length;i++) {
			arr4[i]=arr2[i];
			//System.out.println(arr4[i]);
		}
		for(int i=0;i<arr3.length;i++) {
			arr4[arr2.length+i]=arr3[i];
			//System.out.println(arr4[i]);
		}
		for(int i=0;i<arr4.length;i++) {
			arr4[i]=arr2[i]+arr3[i];
			//System.out.println(arr4[i]+" ");
		}
		System.out.println(Arrays.toString(arr4));
	}
	
		static void show3() {
		int[] marks= {56,76,45,34,56,78};
		for(int i=0;i<marks.length;i++) {
			int l=marks[i]%10;
			int f=marks[i]/10;
			
			if(l>=0 && l<=5) {
				marks[i]=f*10;	
			}
			else{marks[i]=(f+1)*10;}	
		}
		System.out.println(Arrays.toString(marks));
	}

}
