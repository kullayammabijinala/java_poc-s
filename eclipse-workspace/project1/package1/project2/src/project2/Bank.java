package project2;

public class Bank {
	static long accountnumber=10010210;
	String bankname;
	int IFSC;
	String holdername;
	double balance;
	
	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bank b=new  Bank();
			b.display("sbi",87387,"sandhya",30000);
			Bank b1=new  Bank();
				b1.display("baroda",87367,"siri",56000);
			Bank b2=new  Bank();
					b2.display("ICICI",88787,"anu",76000);

					
	}
	void display(String bankname,int IFSC,String holdername,double balance) {
		System.out.println(accountnumber++);
		System.out.println(bankname);
		System.out.println(IFSC);
		System.out.println( holdername);
		System.out.println(balance);
		
		
	}

}
