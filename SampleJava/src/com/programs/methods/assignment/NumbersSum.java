package com.programs.methods.assignment;
class Numbers
{
	void addition()
	{
		int sum=0;
		for(int i=1;i<=20;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum is :"+sum);
	}
}

public class NumbersSum {

	public static void main(String[] args) {
		Numbers ob1=new Numbers();
		ob1.addition();

	}

}
