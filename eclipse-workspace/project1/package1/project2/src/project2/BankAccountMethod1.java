package project2;

public class BankAccountMethod1 {
	

	public static void main(String[] args) {
		add(10,20);
		BankAccountMethod1 b=new BankAccountMethod1();
		
		b.displayAccount();
		add(10,20);
		b.sub(20,30);
		mul();
		// TODO Auto-generated method stub

	}
	void displayAccount() {
		 int Account_Number=2;
			 String Account_Holder_Name="ankitha"; 
			 String Account_Type="business account";
			 double Balance=87387.9;
			 System.out.println(Account_Number);
			 System.out.println(Account_Holder_Name);
			 System.out.println(Balance);
			 System.out.println( Account_Type);
			//sub(30,40);
	}
	static int add(int a,int b) {
		mul();
		//BankAccountMethod1 b1=new BankAccountMethod1();
		 //b1.sub(20,30);
		int sum=a+b;
		return sum;
		
		
	}
	void sub(int a,int b) {
		displayAccount();
		add(10,20);
		int c=a-b;
		System.out.println(c);
	}
	static float mul(){
		
		int a=10;
		int b=20;
		int c=a*b;
		return c;
		
	}

}
