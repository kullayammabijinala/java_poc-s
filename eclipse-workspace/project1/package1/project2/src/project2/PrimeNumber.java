package project2;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a prime number");
		//boolean status=sc.nextBoolean();
		int n=sc.nextInt();
		int count=0;
		int num=2;
		while(count<n) {
			if(isPrime(num)) {
				System.out.println(num+" ");
				count++;
			}
			num++;
		}	
		
	}
	 static boolean isPrime(int n) {
		 boolean prime=true;
		 if(n==0||n==1) {
		 return false;
		 }
		for (int i=2;i<=n/2;i++) {
			if(n%i==0) {
				prime=false;
				break;
			}	
		}
		return prime;
	 }
}
