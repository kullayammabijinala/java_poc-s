package project2;

import java.util.Scanner;

public class Binarytodecimal {

	public static void main(String[] args) {Scanner sc=new Scanner(System.in);
	System.out.println("enter  a number");
	int n=sc.nextInt();
	binarytodecimal(n);
	
	
	
	
	// TODO Auto-generated method stub

}
static void binarytodecimal(int n) {
int decimal=0;
int power=0;
 int r;
 while(n>0) {
	 r=n%10;
	 n=n/10;
	 decimal=decimal+r*(int)Math.pow(2, power);
	 power++;
 }
 System.out.println(decimal);

		// TODO Auto-generated method stub

	}

}
