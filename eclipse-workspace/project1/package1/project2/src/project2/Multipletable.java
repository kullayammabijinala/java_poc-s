package project2;
import java.util.Scanner;


public class Multipletable {
	void findnumber(int n) {
		for (int i=1;i<=10;i++) {
			System.out.println(n+ " * "+ i+ " = "+ (n*i));
		}
	}
	void alphabets() {
		for (char i='A';i<='Z';i++) {
			System.out.println(i);
		}
	}
	void alphabets1() {
		for (char i='Z';i>='A';i--) {
			System.out.println(i);
		}
	}
	void even() {
		for (int i=0;i<=100;i++) {
			if(i%2==0)
			System.out.println(i);
		}
	}
	void odd() {
		for (int i=1;i<=10;i++) {
			if(i%2!=0)
			System.out.println(i);
		}
	}
	void factors(int n) {
		for (int i=1;i<=10;i++) {
			if(n%i==0)
			System.out.println(i);
		}
	}
	void factorial(int n) {
		
			if(n==0||n==1)
				
			System.out.println(n*(n-1));
		}
	
	void neon(int n) {
		 int sum1=n*n;
		int sum=0;
		while(sum1>0){
		 int n1=sum1%10;
		 sum=sum+n1;
		 sum1=sum1/10;
		 if(sum==n) {
			 System.out.println("its a neon number");
		 }
		}
		
	}
	
	void numbers() { 
		int sum=0;
		for (int i=0;i<=100;i++) {
			sum=sum+i;
			//System.out.println(sum);
			//sum=sum+i;
		}
		System.out.println(sum);
	}
	 void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt(); 
		 findnumber(n);
		 even();
		 odd();
		 factors( n);
		 factorial(n);
		// alphabets();
		 alphabets1();
		 neon(n);
		 numbers();
//		for (int i=1;i<=10;i++) {
//			System.out.println(n + " * "+ i+ " = "+ (n*i));
//	
		// TODO Auto-generated method stub

	
	 }

}
