package com.poc1BankLoan;

public class PersonalLoan extends LoanImpl {
	@Override
	  public void getPersonalLoan(){
		  System.out.println("verify all your documents successfully");	
	}

		 public double getLoanROI() {
			 int cibil=getCibilScore();
			 double roi;
			 if(cibil>=300 && cibil<=649) {
				 System.out.println(" Low score; shows past missed payments or high debt, making new loans hard to get.");
				  roi=5.0;
			 }else if(cibil>=650 && cibil<=749) {
					 System.out.println("Good score; standard approval chances with decent terms");
					 roi=3.0;
				 }else if(cibil>=750 && cibil<=900) {
					 System.out.println("Excellent score; lenders view you as low risk and approve loans quickly.");
					 roi=1.0;
				 } else {
					 System.out.println("sorry your rejected ");
					 roi=10.0;
				 }
			 return cibil;	
		 } 

	public static void main(String[] args) {
		
		PersonalLoan  pl=new PersonalLoan ();
		pl.getCustomerName();
		
		if(pl.getCustomerSalary()>=500000 && pl.getCibilScore()>=300 && pl.getCibilScore()<=900&& pl.getCustomerAge()>=20) {
			System.out.println("Basic information for customer loan");
			System.out.println(pl.getIsPhoneVal());
			System.out.println(pl.getIsAadharVal());
			System.out.println(pl.getIsPanVal());
			   double roi = pl.getLoanROI();
	            System.out.println("Loan ROI: " + roi + "%");
		}else {
			System.out.println("re-check your details,try again");
		}
		
	}

}
