package com.programs.methodsreturns;
class Factorial
{
	int factorial=1;
	int getFactorial(int num)
	{
		for(int i=num;i>0;i--)
		{
			factorial=factorial*i;
		}
		return factorial;
	}
}

public class mainFactorial {

	public static void main(String[] args) {
		Factorial ob1=new Factorial();
		int fact=ob1.getFactorial(5);
		System.out.println("factorial of given number is :"+ob1);

	}

}
