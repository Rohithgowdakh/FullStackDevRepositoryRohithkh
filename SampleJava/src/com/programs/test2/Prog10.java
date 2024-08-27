package com.programs.test2;
class InstaceMethod22
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
	InstaceMethod22()
	{
		getDet(20,20);
		InstaceMethod22.getDet2(100, 100);
	}
}
public class Prog10 {

	public static void main(String[] args) {
		InstaceMethod22 o2=new InstaceMethod22();
	}

}
