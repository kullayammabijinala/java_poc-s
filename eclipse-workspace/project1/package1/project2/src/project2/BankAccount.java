package project2;

public class BankAccount {
	String accountHolder;
	long accountNumber;
	double balance;
	BankAccount(){
		this("unknown");
		
	}
	BankAccount( String accountHolder){
		this(accountHolder,0);
		
	}
	BankAccount( String  accountHolder,   long accountNumber){
		this( accountHolder,accountNumber,0.0);
		
	}
	BankAccount( String accountHolder,long  accountNumber, double balance){
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.balance=balance;
		
	}

	public static void main(String[] args) {
		BankAccount b=new BankAccount();
		b.display();
		BankAccount b1=new BankAccount("anu");
		b1.display();
		BankAccount b2=new BankAccount("anu",983787467);
		b2.display();
		BankAccount b3=new BankAccount("anu",768478485,9000000);
		b3.display();
		
		 
		
		
		// TODO Auto-generated method stub

	}
	void display() {
		System.out.println(accountHolder);
		System.out.println(accountNumber);
		System.out.println( balance);
	}
	

}

class customer{
	String accountHolder;
	long accountNumber;
	double balance;
	customer(){
		//super("sandhya");
		System.out.println("called super class");
	}
	customer(String accountHolder){
		this. accountHolder= accountHolder;
		System.out.println("called super class");
	}
 public static void main(String[] args) {
	 customer c=new customer();
	 c.show();
	
	 
 }
	void show() {
		System.out.println(this.accountHolder);
		System.out.println(this.accountNumber);
		System.out.println( this.balance);
		
	}
}
