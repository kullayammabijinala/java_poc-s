package project2;

public class Rectangle {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.calculateArea();
		// TODO Auto-generated method stub

	}
	void calculateArea() {
		 int length=35;
		 int breadth=45;
		 int area=2*(length+breadth);
		 System.out.println("area of the rectangle:"+area);
	}

}
