package com.practice.returnmethods;
class Fac
{
	int getFac(int num)
	{
		
		for(int i=num-1;i>=1;i--)
		{
			num=num*i;
		}
		return num;
	}
}
public class Factorial {

	public static void main(String[] args) {
		Fac ob1=new Fac();
		int val=ob1.getFac(5);
		System.out.println(val);
	}

}