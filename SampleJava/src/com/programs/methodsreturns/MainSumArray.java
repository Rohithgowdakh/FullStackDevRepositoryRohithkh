package com.programs.methodsreturns;
class ArraySum
{
	int sum=0;
	int getSum(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}
}
public class MainSumArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		ArraySum o1=new ArraySum();
		int sum=o1.getSum(a);
		System.out.println("sum is :"+sum);

	}

}
