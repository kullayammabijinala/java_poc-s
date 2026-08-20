package project2;

import java.util.*;
public class Datatype {

	
		public static void main(String[] args) {

			Scanner sc= new  Scanner(System.in);
			
			
			
			/* System.out.println("enter your name:");
	String name=sc.nextLine();
	System.out.println("enter your roll no:");
	int rollNo = sc.nextInt();
	System.out.println("enter your age:");
	int age = sc.nextInt();
	System.out.println("enter your phone no.:");
	long phoneNo = sc.nextLong();
	sc.close();*/
			/*int i=sc.nextInt();
			int sum=0;
			for(int n=0;n<=i;n++) {
			sum+=n;	
			System.out.println(sum);
			}*/
			
			
			int i=sc.nextInt();
int reverse;
			int rev=i%10;
			for(int n=0;n<=10;n++) {
				reverse=rev*10+rev;
	n=i/10;
	System.out.println(reverse);
			}
	}
}


