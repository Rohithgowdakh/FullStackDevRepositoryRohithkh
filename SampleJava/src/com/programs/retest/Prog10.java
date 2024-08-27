package com.programs.retest;
class Factorial
{
	int getfact(int num)
	{
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
}
public class Prog10 {

	public static void main(String[] args) {
		Factorial o1=new Factorial();
		int res=o1.getfact(5);
		System.out.println(res);
	}

}
