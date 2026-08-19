package project2;
import java.util.Scanner;

public class BasicCalculator {

	void  add(int a, int b) {
		System.out.println("addition:"+(a+b));
		
	}
	 void subtract(int a, int b) {
		 System.out.println("subtract:"+(a-b));
	 }
	int  multiply( int a, int b) {
		int c=a*b;
		 System.out.println("multiply:"+c);
		return c;
	}
	static int divide(int a, int b) {
		int c=a/b;
		System.out.println("divide:"+c);
		return c;
	}
	static int mod(int a, int b) {
		int c=a%b;
		System.out.println("module :"+c);
		return c;
		
	}

	public static void main(String[] args) {
		 BasicCalculator bc=new  BasicCalculator();
	Scanner sc =new Scanner(System.in);
	
	System.out.println("enter a number:");
	System.out.println("enter b number:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	bc.add(a,b);
	bc.subtract(a,b);
	bc.multiply( a, b);
	divide(a,b);
	mod(a,b) ;
	
		// TODO Auto-generated method stub

	}

}
