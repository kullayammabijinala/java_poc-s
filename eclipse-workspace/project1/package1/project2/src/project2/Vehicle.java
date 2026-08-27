package project2;

public class Vehicle {
	 String model;
	 String brand;
	 double price;
	 int year;
	 
	 Vehicle(){
		 
	 }
	 Vehicle(String model){
		 
	 }
 Vehicle(String model,String brand,double price,int year){
	 this.model=model;
	 this.brand=brand;
	 this.price=price;
	 this.year=year;
		 
	 }
	 
	public static void main(String[] args) {
		Vehicle v=new Vehicle("jueh","hbhd",87809,1999);
		v.display();
		// TODO Auto-generated method stub

	}
	void display() {
		System.out.println(model);
		System.out.println(brand);
		System.out.println(price);
		System.out.println(year);
	}
	
}
class  Car extends Vehicle{
	
}
