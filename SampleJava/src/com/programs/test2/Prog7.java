package com.programs.test2;
class InsStaBlock
{
	{
		System.out.println("instance block");
	}
	static
	{
		System.out.println("static block");
	}
}
class ParCons
{
	ParCons(int num1,int num2)
	{
		InsStaBlock o1=new InsStaBlock();
		System.out.println("num 1:"+num1+"num 2 :"+num2);
	}
}
public class Prog7 {

	public static void main(String[] args) {
		ParCons ob1=new ParCons(10,20);
	}

}
