package project2;

public class Product {
	 int productId;
	 String productName;
	 int price;
	 
	Product(){
		 System.out.println("no args constructor called");
		  productId=10;
		  productName="anu";
		price=767;
	}

	Product( int pid,String pn,int p){
		 System.out.println("parameterized constructor called");
		productId= pid;
		 productName= pn;
		 price=p;
	}

	public static void main(String[] args) {
		Product p=new Product();
		p.show();
		 p.instance();
	
		Product p1=new Product(17,"soap",76);
		p1.show();
		p1.instance();
		
		// TODO Auto-generated method stub

	}
	void show() {
		System.out.println(productId);
		System.out.println(productName);
		System.out.println(price);
		
	}
	void instance() {
		System.out.println(productId=98);
		System.out.println(productName="ankitha");
		System.out.println(price=7367);
		//Product p=new Product();
		
		
	}

}
