package com.polymorphism;
class Wheels
{
	void NoOfWheels(int count)
	{
		System.out.println("Number of Wheels for a Particular Vehicles");
	}
}
class Bike extends Wheels
{
	void NoOfWheels(int count)
	{
		System.out.println("Number of Wheels in Bike :"+count);
	}
}
class Car extends Wheels
{
	void NoOfWheels(int count)
	{
		System.out.println("Number of Wheels in Car :"+count);
	}
}
class Truck extends Wheels
{
	void NoOfWheels(int count)
	{
		System.out.println("Number of Wheels in Truck :"+count);
	}
}
public class Vehicles {

	public static void main(String[] args) {
		Wheels o=new Bike();
		o.NoOfWheels(2);
		
		o=new Car();
		o.NoOfWheels(4);
		
		o=new Truck();
		o.NoOfWheels(8);
	}

}
