package com.programs.practice;
class Reverse2dTo1d
{
	int[] reverse(int a[][])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
		    for(int j=0;j<a[i].length;j++)
			{
				
				count=count+1;
			}

		}
		int b[]=new int[count];
		int n=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[n]=a[i][j];
				n=n+1;
			}
		}
		return b;
	}
}
public class Main2dto1d {

	public static void main(String[] args) {
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		Reverse2dTo1d ob1=new Reverse2dTo1d();
		int val[]=ob1.reverse(a);
		for(int i=0;i<val.length;i++)
		{
			System.out.print(val[i]+",");
		}
	}

}
