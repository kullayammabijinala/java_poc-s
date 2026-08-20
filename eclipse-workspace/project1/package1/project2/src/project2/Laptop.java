package project2;

public class Laptop {
	String companybrand;
	String color;
	double cost;
	double weight;
	
	Laptop(){
		 companybrand="dell";
		color="black";
		 cost=80009;
		 weight=30;
		
	}

	

	public Laptop(String companybrand, String color, double cost, double weight) {
		
		this.companybrand = companybrand;
		this.color = color;
		this.cost = cost;
		this.weight = weight;
	}



	public Laptop(String color, double weight) {
		
		this.color = color;
		this.weight = weight;
	}



	public Laptop(String companybrand, String color, double cost) {
		
		this.companybrand = companybrand;
		this.color = color;
		this.cost = cost;
	}



	public Laptop(String companybrand) {
		
		this.companybrand = companybrand;
	}



	public static void main(String[] args) {
		Laptop l=new Laptop();
		l.display();
		Laptop l1=new Laptop("lenovo","blue",40000,65);
		l1.display();
		Laptop l2=new Laptop("black",65);
		l2.display();
		Laptop l3=new Laptop("dell","yellow",76000);
		l3.display();
		Laptop l4=new Laptop("mac");
		l4.display();
		// TODO Auto-generated method stub

	}
	void display() {
		System.out.println(companybrand);
		System.out.println(color);
		System.out.println( cost);
		System.out.println(weight);
		
		
	}

}
