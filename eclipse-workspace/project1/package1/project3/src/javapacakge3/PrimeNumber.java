package javapacakge3;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a prime number");
		//boolean status=sc.nextBoolean();
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			if(isPrime(i)) {
				System.out.println(i +" ");
			
		}
		}
		
		// TODO Auto-generated method stub
	}
	 static boolean isPrime(int n) {
		 boolean prime=true;
		 if(n==0||n==1) {
		 return false;
		 }
		//boolean prime=true;
		for (int i=2;i<=n/2;i++) {
			if(n%i==0) {
				prime=false;
				break;
			}
			
			
		}
		return prime;
		//	 
		 
	 
	 }
}
