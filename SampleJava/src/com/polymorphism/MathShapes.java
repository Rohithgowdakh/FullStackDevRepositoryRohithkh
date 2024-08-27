package com.polymorphism;
class Shapes
{
	void area() {
		System.out.println("shapes of circle,rectangle,");
	}
}
class Circle extends Shapes
{
	void area() {
		int r=6;
		double pi=3.12;
		System.out.println("Area of Circle :"+pi*r*r);
	}
}
class Rectangle extends Shapes
{
	void area() {
		int length=6;
		int breadth=3;
		System.out.println("Area of Rectangle :"+length*breadth);
	}
}
class Square extends Shapes
{
	void area()
	{
		int side=3;
		System.out.println("Area of Square :"+side*side);
	}
}
public class MathShapes {

	public static void main(String[] args) {
		Shapes shape=new Circle();
		shape.area();
		
		shape=new Rectangle();
		shape.area();
		
		shape=new Square();
		shape.area();
	}

}
