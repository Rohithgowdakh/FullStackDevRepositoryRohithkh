package com.programs.practice;
class MainDigit
{
	int getDigit(int num)
	{
		int count=0;
		if(num==0)
		{
			return 1;
		}
		while(num>0)
		{ 
			num=num/10;
			count=count+1;
		}
		return count;
	}
}
public class MainDigits 
{
	public static void main(String[] args)
	{
		MainDigit ob1=new MainDigit();
		int digit=ob1.getDigit(290);
		System.out.println("the digits of given num :"+digit);
	}

}
