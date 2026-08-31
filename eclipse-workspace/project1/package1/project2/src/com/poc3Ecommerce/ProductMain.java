package com.poc3Ecommerce;


public class ProductMain extends ProductImpl {
	
	public static void main(String[] args) {
		
		 ProductMain pm=new  ProductMain();
		 pm.getProductName();
			pm.getProductPrice();
			pm.getQuantity();
			
			pm.displayBill();

	}

}
