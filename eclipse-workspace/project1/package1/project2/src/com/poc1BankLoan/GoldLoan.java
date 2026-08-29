package com.poc1BankLoan;

public class GoldLoan extends LoanImpl{public double getLoanROI() {
	 int cibil=getCibilScore();
	 double roi;
	 if(cibil>=300 && cibil<=649) {
		 System.out.println(" Low score; shows past missed payments or high debt, making new loans hard to get.");
		  roi=6.0;
	 }else if(cibil>=650 && cibil<=749) {
			 System.out.println("Good score; standard approval chances with decent terms");
			 roi=2.0;
		 }else if(cibil>=750 && cibil<=900) {
			 System.out.println("Excellent score; lenders view you as low risk and approve loans quickly.");
			 roi=1.0;
		 } else {
			 System.out.println("sorry your rejected ");
			 roi=8.0;
		 }
	 return cibil;	
} 

public static void main(String[] args) {

	GoldLoan gl=new GoldLoan ();
gl.getCustomerName();

if(gl.getCustomerSalary()>=400000 && gl.getCibilScore()>=300 && gl.getCibilScore()<=900&& gl.getCustomerAge()>=24) {
	System.out.println("Basic information for customer loan");
	System.out.println(gl.getIsPhoneVal());
	System.out.println(gl.getIsAadharVal());
	System.out.println(gl.getIsPanVal());
	   double roi = gl.getLoanROI();
       System.out.println("Loan ROI: " + roi + "%");
}else {
	System.out.println("re-check your details,try again");
}

}

}
