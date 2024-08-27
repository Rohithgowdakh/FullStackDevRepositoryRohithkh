package com.programs.methods.assignment;
class PrimeSumAll
{
	
	void prime()
	{
		int sum=0;
		for(int i=2;i<=100;i++)
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
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}

public class PrimeSum {

	public static void main(String[] args) {
		PrimeSumAll ob1=new PrimeSumAll();
		ob1.prime();

	}

}