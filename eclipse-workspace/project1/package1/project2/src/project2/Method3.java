package project2;

public class Method3 {

	public static void main(String[] args) {
		printWelcome();
		displayNumber('a',40);
		Method3 m=new Method3();
		 m.displayMessage();
		 printName();
		 m.printAge(40);
		 m.sayHello(20,30);m. isEven(40);
		 isOdd(30);
		
		// TODO Auto-generated method stub

	}
	 void displayMessage(){
		
		System.out.println("this is normal instance method");
	}
	static int printName(){
		printWelcome();
		int a=20;
		System.out.println(a);
		return a;
		
	}
	 void printAge(int a){
		System.out.println("in this method  passing the parameters");
	}
	static double printWelcome(){
		double a=2;
		System.out.println(a);
		return a;
		
	}
	void sayHello(int a, int b){
		int sum=a+b;
		System.out.println(sum);
		printAge(30);
	}
	
	
	static char displayNumber(char a,int b){
		System.out.println(a);
		System.out.println(b);
		printWelcome();
		return a;

		
	}
	 void isEven(int a) {
		 
		 if (a%2==0){
			 System.out.println("yes its even");
		 }
	 }
	 static void isOdd(int b) {
		 if (b%2!=0) {
			 System.out.println("yes its odd");
			 
		 }else {
			 System.out.println("its not odd ");
		 }
	 }
	
	

}
