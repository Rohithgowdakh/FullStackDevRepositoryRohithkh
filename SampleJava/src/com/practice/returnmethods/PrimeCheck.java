package com.practice.returnmethods;
class Prime
{
	
	boolean getPrime(int num)
	{
		boolean prime=true;
		for(int i=2;i<num;i++)
		{
			
			if(num%i==0)
			{
				prime=false;
				break;
			}
		}
		if(prime==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class PrimeCheck {

	public static void main(String[] args) {
		Prime o1=new Prime();
		boolean val=o1.getPrime(7);
		System.out.println(val);
		for(int i=10;i<=100;i++) {
			if(o1.getPrime(i)==true) System.out.println(i+" ");
		}
	}

}
