package com.programs.practice;
class Array2d
{
	int[] getSecondHalf(int a[])
	{
		int k=0;
		int b[]=new int[a.length/2];
		for(int i=a.length/2;i<a.length;i++)
		{
			b[k]=a[i];
			k=k+1;
		}
		return b;
	}
}
public class Mainsecond {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70,80};
		Array2d ob1=new Array2d();
		int c[]=ob1.getSecondHalf(a);
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}

	}

}
