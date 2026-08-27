package project2;

public class WrapperObject {
	  Integer	product_id;
	    String product_name;
	   Integer product_price;
	   Float product_rating;
	    Boolean product_available_status;
	    Boolean stock_quality;
	   Integer discount_percentange;
	    String product_code;
	    

		public static void main(String[] args) { 
			 WrapperObject w=new  WrapperObject();
			 w.product_id=4;
			   w.product_name="anu";
				  w.product_price=543;
				 w.product_rating=4.5f;
				   w.product_available_status=true;
				   w.stock_quality=true;
				 w.discount_percentange=10;
				   w.product_code="546f63";
				   
				   System.out.println(w.product_id);
				   System.out.println( w.product_name);
				   System.out.println(w.product_price);
				   System.out.println(w.product_rating);
				   System.out.println(w.product_available_status);
				   System.out.println(w.stock_quality);
				   System.out.println(w.discount_percentange+"%");
				   System.out.println(w.product_code);
				   
			
		
	}

}
