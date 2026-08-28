package com.arrays;

import java.util.Arrays;

public class ReplaceArray1 {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]%2==0) {
					arr[i][j]=0;
				}
				else {
					arr[i][j]=-1;
				}
			}	
		}
		System.out.println(Arrays.deepToString(arr));
	

	}

}
