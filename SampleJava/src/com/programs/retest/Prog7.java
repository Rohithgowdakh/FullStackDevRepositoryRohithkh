package com.programs.retest;
class Tables
{
	int getSum(int n)
	{
		int a[]=new int[10];
		for(int i=1;i<=10;i++)
		{
			a[i-1]=(n*i);
		}
		int sum=0;
		for(int j=0;j<=9;j++)
		{
			sum=sum+a[j];
		}
		return sum;
	}
}
public class Prog7 {

	public static void main(String[] args) {
		Tables o1=new Tables();
		System.out.println(o1.getSum(10));
	}

}
