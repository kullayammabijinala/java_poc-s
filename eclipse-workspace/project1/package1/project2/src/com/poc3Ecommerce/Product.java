package com.poc3Ecommerce;

public interface Product {
	    String getProductName();

	    double getProductPrice();

	    int getQuantity();

	    double calculateSubtotal();

	    double calculateDiscount();

	    double calculateGst();

	    double calculateFinalAmount();

	    void displayBill();

}
