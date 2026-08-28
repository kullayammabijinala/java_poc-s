package com.arrays;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    show2();
	}

	static void show2() { 
	int[] n1= {5,6,7,3,2,9};
		int[] n2= {6,8,4,7,12};
		int[] n3=new int[n1.length+n2.length];
		int len=0;
		for(int i=0;i<n1.length;i++) {
		if(n1.length>n2.length) {
				len=n1.length;
		}
		else {
		len=n2.length;
		}
	}
		int[] c=new int[len];
		for(int i=0;i<len;i++) {
			if(i<n1.length) {
				c[i]=n2[i];
			}else if(i<n2.length) {
				c[i]=n1[i];
				
			}else {
			c[i]=n1[i]+n2[i];
			}
		}
		System.out.println(Arrays.toString(c));
			
		}
}
