package com.programs.test2;//it executes in sequence order
class MultipleStatic
{
	static
	{
		System.out.println("this is 1st static block");
	}
	static
	{
		System.out.println("this is 2nd static block");
	}
	static
	{
		System.out.println("this is 3rd static block");
	}
}
public class Prog5 {

	public static void main(String[] args) {
		MultipleStatic o1=new MultipleStatic();
	}

}
