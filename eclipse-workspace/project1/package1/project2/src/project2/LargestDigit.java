package project2;
import java.util.Scanner;

public class LargestDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		largestDigit(n);
	}
	static void largestDigit(int n) {
		int r=0;
		int max=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			if(r>max) {
				max=r;
			}
		}
		System.out.println(max);
		}
	}
