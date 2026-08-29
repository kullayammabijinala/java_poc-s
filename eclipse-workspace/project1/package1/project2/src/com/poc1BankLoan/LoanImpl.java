package com.poc1BankLoan;
import java.util.Scanner;

public class LoanImpl implements Loan {
	Scanner sc=new Scanner(System.in);
	@Override
	   public String getCustomerName() {
		 System.out.println("enter customer name :");
		 String name=sc.next();
		 return name;	 
	 }
	@Override
	public
	 int getCustomerAge() {
		 System.out.println("enter customer age :");
		int age=sc.nextInt();
		if(age>=25 && age<=85) {
			System.out.println("your eligible   for applying  loan");
		}else {
			System.out.println("your not eligible for applying loan ");
		}
		 return age;	 
	 }
	@Override
	   public double getCustomerSalary() {
		  System.out.println("enter customer salary :");
			 double salary=sc.nextDouble();
			 if(salary>=900000) {
				 System.out.println("your eligible   for applying  loan");
				}else {
					System.out.println("your not eligible for applying loan ");
				}
			 return salary;	  
	  }
	@Override
	   public int getCibilScore() {
		  System.out.println("enter customer cibil score :");
			int cibilscore=sc.nextInt();
			 return cibilscore;
		  
	  }
	@Override
	 public double getLoanROI() {
		 int cibil=getCibilScore();
		 double roi;
		 if(cibil>=300 && cibil<=649) {
			 System.out.println(" Low score; shows past missed payments or high debt, making new loans hard to get.");
			  roi=10.0;
		 }else if(cibil>=650 && cibil<=749) {
				 System.out.println("Good score; standard approval chances with decent terms");
				 roi=5.0;
			 }else if(cibil>=750 && cibil<=900) {
				 System.out.println("Excellent score; lenders view you as low risk and approve loans quickly.");
				 roi=1.0;
			 } else {
				 System.out.println("sorry your rejected ");
				 roi=15.0;
			 }
		 return cibil;	 
	 } 
	@Override
	public boolean getIsPhoneVal() {
		 System.out.println("enter your phone number:");
		 String pno=sc.next();
		 if(pno.length()==10) {
			 System.out.println(" phone number verify succussfully");	 
		 }else {
			 System.out.println("error : pnone number having more than 10 digits");
		 }
		 return pno.matches("[6-9]{1}[0-9]{9}");
		 
	 }
	@Override
	 public boolean getIsAadharVal() {
		 System.out.println("enter your Aadhar number:");
		 String aadhar=sc.next();
		 if(aadhar.length()==12) {
			 System.out.println(" Aadhar verify succussfully");	 
		 }else {
			 System.out.println("error : Aadhar number having more than 12 digits");
		 }
		 return  aadhar.matches("[2-9]{1}[0-9]{11}");	
	}
	@Override
	public boolean getIsPanVal() {
		 System.out.println("enter your pan number:");
		String pan=sc.next();
		if(pan.length()==10) {
			 System.out.println(" pan verify succussfully");	 
		 }else {
			 System.out.println("error : pan number having more than 10 digits");
		 }
		 return  pan.matches("[A-Z,a-z]{5}[1-9]{4}[]A-Z,a-z]{1}");	 
	 }

	public static void main(String[] args) {
		
		LoanImpl l=new LoanImpl();
		l.getCustomerName();
		
		if(l.getCustomerSalary()>=900000 && l.getCibilScore()>=300 && l.getCibilScore()<=900 && l.getCustomerAge()>=25) {
			System.out.println("Basic information for customer loan");
			System.out.println(l.getIsPhoneVal());
			System.out.println(l.getIsAadharVal());
			System.out.println(l.getIsPanVal());
			   double roi = l.getLoanROI();
	            System.out.println("Loan ROI: " + roi + "%");	
		}else {
			System.out.println("re-check your details,try again");
		}

	}
	@Override
	public void getPersonalLoan() {
		// TODO Auto-generated method stub
		
	}
}
