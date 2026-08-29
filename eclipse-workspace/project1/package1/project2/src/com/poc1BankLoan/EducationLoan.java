package com.poc1BankLoan;

public class EducationLoan extends LoanImpl {
	public double getLoanROI() {
	 int cibil=getCibilScore();
	 double roi;
	 if(cibil>=300 && cibil<=649) {
		 System.out.println(" Low score; shows past missed payments or high debt, making new loans hard to get.");
		  roi=4.0;
	 }else if(cibil>=650 && cibil<=749) {
			 System.out.println("Good score; standard approval chances with decent terms");
			 roi=2.0;
		 }else if(cibil>=750 && cibil<=900) {
			 System.out.println("Excellent score; lenders view you as low risk and approve loans quickly.");
			 roi=0.5;
		 } else {
			 System.out.println("sorry your rejected ");
			 roi=6.0;
		 }
	 return cibil;	
} 

public static void main(String[] args) {

	EducationLoan el=new EducationLoan();
el.getCustomerName();

if(el.getCustomerSalary()>=350000 && el.getCibilScore()>=300 && el.getCibilScore()<=900&& el.getCustomerAge()>=20) {
	System.out.println("Basic information for customer loan");
	System.out.println(el.getIsPhoneVal());
	System.out.println(el.getIsAadharVal());
	System.out.println(el.getIsPanVal());
	   double roi = el.getLoanROI();
       System.out.println("Loan ROI: " + roi + "%");
}else {
	System.out.println("re-check your details,try again");
}

}

}
