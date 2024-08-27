package com.programs.methods.assignment;
class PrimeCheck
{
	
	void prime()
	{
		int count=0;
		for(int i=50;i<=150;i++)
		{
			boolean isPrime1=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isPrime1=false;
					break;
				}			
			}
			if(isPrime1==true)
			{
				count=count+1;
			}
			
		}
		System.out.println(count);
	}

}

public class PrimeCount {

	public static void main(String[] args) {
		PrimeCheck ob1=new PrimeCheck();
		ob1.prime();

	}

}