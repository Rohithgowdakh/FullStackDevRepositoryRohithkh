package com.program.constructor;
class IsPrime
{
	int flag=0;
	IsPrime(int num)
	{
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag+=1;
				break;
			}
		}
	
		if(flag==0)
		{
			System.out.println(num+"is a prime");
		}
		else
		{
			System.out.println(num+"is not a prime");
		}
	}
}

public class MainIsPrime {

	public static void main(String[] args) {
		IsPrime ob1=new IsPrime(10);
		
	}

}
