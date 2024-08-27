package com.programs.retest;
class Operator
{
	int getLogic(int a,int b)
	{
		int c=0;
		if(a>=0 && b<=50)
		{
			c=a+b;
		}
		return c;
	}
}
public class Prog6 {

	public static void main(String[] args) {
		Operator ob1=new Operator();
		int res=ob1.getLogic(10, 25);
		System.out.println(res);
		
	}

}
