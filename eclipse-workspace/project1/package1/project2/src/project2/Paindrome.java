package project2;

import java.util.Scanner;

public class Paindrome {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		boolean status=ispalindrone(n);
		 if(status) {
			 System.out.println("palindrone");
		 }else {
			 System.out.println("not palindrone");
		 }

	}
	 static boolean ispalindrone(int n) {
		 boolean status =false;
		// int n1=String.valueOf(n).length();
		 int temp=n;
		 int r=0;
			int rev=0;
			while(temp>0) {
				r=temp%10;		
				temp=temp/10;
				rev=rev*10+r;
				
				//System.out.println(sum);
			}
			if(rev==n) {
				status=true;
			}
		
		 return status;
		 
	 }
		// TODO Auto-generated method stub

	

}
