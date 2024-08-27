package com.programs.testreturn;
class Fact
{
	int fact(int n)
	{
		int fact1=1;
		for (int i=1;i<=n;i++)
		{
			fact1=fact1*i;
		}
		return fact1;
	}
	
}

public class Prog10
{
	public static void main(String args[])
	{
		
		Fact o1=new Fact();
		int res=o1.fact(3);
		
		System.out.println(res+" ");
		
		
	}

}
