package project2;

public class ProductBilling {
	String  productName;
	double price;
	 int  quantity;
	 double totalcost;
	ProductBilling(){
		this("soap");
		
	}
	ProductBilling(  String  productName){
		this(productName,450);
		
		
	}
	ProductBilling(  String productName,  double price){
		this(productName,price,2);
		
	}
	ProductBilling(String productName,double  price, int  quantity){
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
		//totalcost=price*quantity;
		totalcost=price*quantity;
		//System.out.println(totalcost);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		ProductBilling p =new ProductBilling();
		p.display();
		

	}
	void display() {
		System.out.println( "productName :"+productName);
		System.out.println( "price :"+price);
		System.out.println( "quantity :"+quantity);
		System.out.println("totalcost:"+totalcost);
		
		
	}

}
