package com.poc3Ecommerce;
import java.util.Scanner;


public class ProductImpl implements Product {
	Scanner sc=new Scanner(System.in);
	String productName;
	double productPrice;
	int quantity;
	
	@Override
	   public String getProductName() {
		System.out.println("enter product name:");
		 productName=sc.next();
		return productName;
		  
	  }
	@Override
	   public double getProductPrice() {
		System.out.println("enter product price:");
		productPrice=sc.nextDouble();
		return productPrice;
	    	
	    }
	@Override
	   public int getQuantity() {
		System.out.println("enter Quantity:");
		 quantity=sc.nextInt();
		return quantity;
	    	
	    }
	@Override
	   public double calculateSubtotal() {
		return productPrice*quantity;
	    	
	    }
	@Override
	   public double calculateDiscount() {
		double subtotal=calculateSubtotal();
		if(subtotal>=5000) {
			return subtotal*0.10;
		}else if(subtotal>=3000) {
			return subtotal*0.05;
		}else {
			return 0;
		}	
	    }
	@Override
	   public double calculateGst() {
		double subtotal=calculateSubtotal();
		double discount=calculateDiscount();
		double gst=subtotal-discount;
		return gst*0.12;
	    	
	    }
	@Override
	   public double calculateFinalAmount() {
		double subtotal=calculateSubtotal();
		double discount=calculateDiscount();
		double gst=calculateGst();
	
		return  subtotal-discount+gst;
	    	
	    }
	@Override
		   public void displayBill() {
		
		double subtotal=calculateSubtotal();
		double discount=calculateDiscount();
		double gst=calculateGst();
		double finalamount=calculateFinalAmount();
		
		System.out.println("product name is:"+productName);
		System.out.println("product price is:"+productPrice);
		System.out.println("product quantity:"+quantity);
		System.out.println("subtotal of all product:"+subtotal);
		System.out.println("discount:"+discount);
		System.out.println("calaucte GST:"+gst);
		System.out.println("calculate final amount:"+finalamount);
	    	
	    }

}
