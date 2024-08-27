package com.programs.methods.assignment;
class PrimeNum
{
	
	void prime()
	{
	
		for(int i=2;i<=50;i++)
		{
			boolean isPrime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime==true)
			{
				System.out.println(i+" ");
			}
		}
		
	}
}

public class MainPrime {

	public static void main(String[] args) {
		PrimeNum ob1=new PrimeNum();
		ob1.prime();

	}

}
