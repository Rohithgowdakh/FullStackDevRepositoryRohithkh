package p1.polymorphism;
abstract class GeometricFigure
{
	abstract void area();
}

class Square extends GeometricFigure
{
	void area()
	{
		int side=10;
		System.out.println("Area of a Square :"+(side * side));
	}
}

class Rectangle extends GeometricFigure
{
	void area()
	{
		int length,breadth;
		length=12;breadth=15;
		System.out.println("Area of a Rectangle :"+(length * breadth));
	}
}

 class Circle extends GeometricFigure
{
	void area()
	{
		double pi=3.14;
		double r=2.5;
		System.out.println("Area of a Circle :"+(pi * r * r));
	}
}
public class Shapes {
	public static void main(String[] args) {
		GeometricFigure figure=null;
		
		Square square=new Square();
		Rectangle rectangle=new Rectangle();
		Circle circle=new Circle();
		
		figure=square;
		figure.area();
		
		figure=rectangle;
		figure.area();
		
		figure=circle;
		figure.area();
	}

}
