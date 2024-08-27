package com.practice.returnmethods;
class Fac
{
	int getFac(int num)
	{
		int nu=1;
		for(int i=num;i>=1;i--)
		{
			nu=nu*i;
		}
		return nu;
	}
}
public class Factorial {

	public static void main(String[] args) {
		Fac ob1=new Fac();
		int val=ob1.getFac(5);
		System.out.println(val);
	}

}
