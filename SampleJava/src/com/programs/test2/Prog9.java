package com.programs.test2;
class InstaceMethod1
{
	void getDet(int num1,int num2)
	{
		int res=num1*num2;
		System.out.println("Multiply result :"+res);
	}
	static void getDet2(int num1,int num2)
	{
		int res=num1+num2;
		System.out.println("Addition result :"+res);
	}
	static
	{
		InstaceMethod1 o1=new InstaceMethod1();
		o1.getDet(10,10);
		InstaceMethod1.getDet2(10, 100);
	}
}
public class Prog9 {

	public static void main(String[] args) {
		InstaceMethod1 o2=new InstaceMethod1();
	}

}
