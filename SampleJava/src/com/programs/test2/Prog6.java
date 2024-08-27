package com.programs.test2;
class MultipleStatic1
{
	static
	{
		System.out.println("this is 1st static block");
	}
	
}
class MultipleStatic2
{
	static
	{
		MultipleStatic1 o1=new MultipleStatic1();
		System.out.println("this is 2nd static block");
	}
	
}
public class Prog6 {

	public static void main(String[] args) {
		MultipleStatic2 o1=new MultipleStatic2();
	}

}