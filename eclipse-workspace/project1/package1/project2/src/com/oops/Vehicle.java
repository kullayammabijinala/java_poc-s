package com.oops;
  
   class  Vehicle {
	  void start() {
		  System.out.println("welcom to java");
		  
	  }	
  }
   
   class  Car extends Vehicle{
	   void drive() {
		    System.out.println("car is child of vehicle class");
	   }

	public static void main(String[] args) {
	
		Car c= new Car();
		c.start();
		 c.drive();
	}

   }
   
 
