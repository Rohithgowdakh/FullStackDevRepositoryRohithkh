package com.programs.methods.assignment;

class ArraySum2D
{
	void row2(int a[][])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[1][i];
		}
		System.out.println("sum is :"+sum);
	}
}
public class Double2D {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		ArraySum2D ob1=new ArraySum2D();
		ob1.row2(a);

	}

}
