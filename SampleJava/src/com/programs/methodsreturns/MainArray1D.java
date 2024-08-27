package com.programs.methodsreturns;
class Array
{
	int[] ArrayHalf(int a[])
	{
		int n=a.length/2;
		int firstHalf[]=new int[n];
		for(int i=0;i<n;i++)
		{
			firstHalf[i]=a[i];
		}
		return firstHalf;
		
	}
	
}

public class MainArray1D {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70,80};
		Array o1=new Array();
		int res[]=o1.ArrayHalf(a);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}

	}

}
