package com.poc1BankLoan;

public class CarLoan extends LoanImpl {
	public double getLoanROI() {
		 int cibil=getCibilScore();
		 double roi;
		 if(cibil>=300 && cibil<=649) {
			 System.out.println(" Low score; shows past missed payments or high debt, making new loans hard to get.");
			  roi=8.0;
		 }else if(cibil>=650 && cibil<=749) {
				 System.out.println("Good score; standard approval chances with decent terms");
				 roi=5.0;
			 }else if(cibil>=750 && cibil<=900) {
				 System.out.println("Excellent score; lenders view you as low risk and approve loans quickly.");
				 roi=2.0;
			 } else {
				 System.out.println("sorry your rejected ");
				 roi=10.0;
			 }
		 return cibil;	
	 } 

public static void main(String[] args) {
	CarLoan cl=new CarLoan ();
	cl.getCustomerName();
	
	if(cl.getCustomerSalary()>=1000000 && cl.getCibilScore()>=300 && cl.getCibilScore()<=900&& cl.getCustomerAge()>=25) {
		System.out.println("Basic information for customer loan");
		System.out.println(cl.getIsPhoneVal());
		System.out.println(cl.getIsAadharVal());
		System.out.println(cl.getIsPanVal());
		   double roi = cl.getLoanROI();
           System.out.println("Loan ROI: " + roi + "%");
	}else {
		System.out.println("re-check your details,try again");
	}
	
}
}
