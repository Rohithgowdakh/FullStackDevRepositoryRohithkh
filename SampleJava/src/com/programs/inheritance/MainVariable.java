package com.programs.inheritance;
class Hotel
{
	String foodName;
	{
		foodName="IdliSamber";
		System.out.println("foodName 1:"+foodName);
	}
}
class Food extends Hotel
{
	String foodName;
	{
		super.foodName=foodName;
		
	}
}
class Food1 extends Food
{
	String foodName;
	{
		super.foodName="FigureRice";
		foodName="RiceBath";
		System.out.println("foodName 2 :"+super.foodName);
		System.out.println("foodName 3 :"+foodName);
	}
}
public class MainVariable {

	public static void main(String[] args) {
		Food1 ob1=new Food1();
	}

}
