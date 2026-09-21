package com.oops;
import java.util.Scanner;

public class ShoppingCart {
	
	
	   private int cartItems ;
	  private double totalAmount;
	  
	  void addItem( double price) {
		  if(price>0) {
			  cartItems++;
			  totalAmount+=price;
			  System.out.println("add cartItem"+" "+ cartItems +"\n "+"totalamount"+" "+ totalAmount);
		  }
		  
	  }
	 void removeItem(double price) {
		 if(price>0 && cartItems>0 && price<=totalAmount) {
			 cartItems--;
			 totalAmount-=price;
			 System.out.println(" remove cartItem"+" "+ cartItems +"\n "+"totalamount"+" "+ totalAmount);
			 
		 }	 
	 }
	 double getTotal() {
		return totalAmount;	 
	 }
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  ShoppingCart s=new ShoppingCart();
		  System.out.println("enter a price:");
		  double addprice=sc.nextDouble();
		  
		  s.addItem(addprice);
		  System.out.println("enter remove item price:");
		  double removeprice=sc.nextDouble();
		  s.removeItem(removeprice) ;
		 System.out.println(" final total amount:" +s.getTotal());
		  
		  
	  }
	   
	

}
