package com.practice.returnmethods;
class Pract1
{
	int[] getArr(int arr[])
	{
		int k=0;
		int a[]=new int[arr.length/2];
		for(int i=0;i<arr.length/2;i++)
		{
			a[k]=arr[i];
			k=k+1;
		}
		return a;
	}
}
public class Array1dMain {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80};
		Pract1 ob1=new Pract1();
		int c[]=ob1.getArr(arr);
		for(int k=0;k<c.length;k++)
		{
			System.out.print(c[k]+" ");
		}
	}

}
