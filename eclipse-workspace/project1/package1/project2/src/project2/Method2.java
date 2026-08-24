package project2;

public class Method2 {

	public static void main(String[] args) {
		Method2 m=new Method2();
		m.showPlanDetails();
		m.recharge(289);
		// TODO Auto-generated method stub

	}
    void showPlanDetails() {
    	 int Current_Recharge_Plan=28;
    	System.out.println("Current Recharge Plan:"+ Current_Recharge_Plan);
    	String PlanName ="unlimited 299";
    	 int Validity  = 28 ;
    	 float Data  = 1.5f;
    	 String Calls   = "Unlimited";
    	 System.out.println(PlanName );
    	 System.out.println(Validity +" "+"days");
    	 System.out.println(Data+" "+"GB" );
    	 System.out.println( Calls);
    	
    }
    void  recharge(double amount) {
    	float RechargeAmount=299;
    	if(RechargeAmount<=300) {
    		System.out.println("recharge succussfully");
    		
    	}else {
    		System.out.println("recharge not succussfully");
    		
    	}
    }
}
