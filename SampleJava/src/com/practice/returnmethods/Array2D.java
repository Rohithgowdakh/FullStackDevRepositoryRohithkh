package com.practice.returnmethods;
class ArrayPrac2
{
	int[] get1stRow(int a[][])
	{
		int b[]=new int[a[0].length];
		for(int i=0;i<a[0].length;i++)
		{
			b[i]=a[0][i];
		}
		return b;
	}
}
public class Array2D {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		ArrayPrac2 o1=new ArrayPrac2();
		int res[]=o1.get1stRow(a);
		for(int x:res)
		{
			System.out.print(x+" ");
		}
	}

}
