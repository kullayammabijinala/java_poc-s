package com.oops;

public abstract class Shape {
	abstract void area() ;

}
class Circle extends Shape{
	@Override
	public void area() {
		int r=2;
		System.out.println("area of the circle:"+3.14*r*r);
		
	}
	
}
class Rectangle extends Shape{
	@Override
	public void area() {
		double length=23.4;
		double breadth=33.4;
		System.out.println(" area of the rectange:"+length*breadth);

	}
	
}

class Triangle extends Shape{
	@Override
	public void area() {
		double base=9;
		double height=7;
		System.out.println("area of the triangle:"+(0.5)*base*height);
		
	}
	
	
}


