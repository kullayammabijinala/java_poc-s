package project2;
import java.util.Scanner;
public class NestedIfBanking {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter email:");
		String email=sc.next();
		System.out.println("enter password:");
		String password=sc.next();
		
		System.out.println("enter new password:");
		String newpassword=sc.next();
		
		  if(password.equals(newpassword)) {
		    	 System.out.println("login successfully");
		    	 //NestedIfBanking n=new NestedIfBanking();
		  
		    		 System.out.println("check balance:");
		    		long balance=sc.nextLong();
		    		
		    		 if(balance==1000000) {
		    			 System.out.println("balance unavailable");
		    		 }else {
		    			 System.out.println("balance available");
		    			 System.out.println("enter withdraw amount:");
		    			 long withdraw=sc.nextLong();
		    			 
		    			 if (balance>=withdraw) {
		    				 System.out.println("withdraw sucussfully");
		    				 System.out.println("print receipt");
		    				 
		    			 }
		    			 else {
		    				 System.out.println("u have insufficient amount");
		    				 System.out.println("deposit amount:");
		    				 long deposit=sc.nextLong();
		    				 if(withdraw>=balance) {
		    					 balance+=deposit;
		    					 System.out.println("deposit sucussfully done:"+balance);
		    					 } else {
		    						 System.out.println("amount not deposit some happens ,retry");
		    						 System.out.println("check if ur account is active or not");
		    						 boolean accountActive=sc.nextBoolean();
		    						 if(accountActive) {
		    							 System.out.println("KYC updated");
		    						 } else {
		    							 System.out.println("KYC not updated,retry");
		    						 }
		    					 }
		    			 }
		    			 
		    		 }
		  }else {
		    		 System.out.println("invalid OTP");
		    		 
		  }
	
	}
		
}
