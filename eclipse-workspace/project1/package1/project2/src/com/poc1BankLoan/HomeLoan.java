package com.poc1BankLoan;

public class HomeLoan extends LoanImpl {
	 public double getLoanROI() {
		 int cibil=getCibilScore();
		 double roi;
		 if(cibil>=300 && cibil<=649) {
			 System.out.println(" Low score; shows past missed payments or high debt, making new loans hard to get.");
			  roi=10.0;
		 }else if(cibil>=650 && cibil<=749) {
				 System.out.println("Good score; standard approval chances with decent terms");
				 roi=8.0;
			 }else if(cibil>=750 && cibil<=900) {
				 System.out.println("Excellent score; lenders view you as low risk and approve loans quickly.");
				 roi=6.0;
			 } else {
				 System.out.println("sorry your rejected ");
				 roi=15.0;
			 }
		 return cibil;	
	 } 

public static void main(String[] args) {
	
	HomeLoan  hl=new HomeLoan  ();
	hl.getCustomerName();
	
	if(hl.getCustomerSalary()>=1200000 && hl.getCibilScore()>=300 && hl.getCibilScore()<=900 && hl.getCustomerAge()>=25) {
		System.out.println("Basic information for customer loan");
		System.out.println(hl.getIsPhoneVal());
		System.out.println(hl.getIsAadharVal());
		System.out.println(hl.getIsPanVal());
		   double roi = hl.getLoanROI();
            System.out.println("Loan ROI: " + roi + "%");
	}else {
		System.out.println("re-check your details,try again");
	}
	
}
}
