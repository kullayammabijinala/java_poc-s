package project2;
import java.util.Scanner;
public class DecimalTobinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  a number");
		int n=sc.nextInt();
		decimaltobinary(n);
		// TODO Auto-generated method stub

	}
 static void decimaltobinary(int n) {
	 String binVal=" ";
	 int r=0;
	 while(n>0) {
		 r=n%2;
		 n=n/2;
		 binVal=r+binVal;	
	 }
	 System.out.println(binVal);
	
 }
}
