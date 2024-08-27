package com.programs.methodsreturns;
class ArrayShort
{
	short[] getArray(short a[])
	{
		int n=a.length/2;
		short secondHalf[]=new short[n];
		for(int i=0;i<n;i++)
		{
			secondHalf[i]=a[i+n];
		}
		return secondHalf;
	}
}
public class MainShort {

	public static void main(String[] args) {
		short a[]= {10,20,30,40,50,60,70,80};
		ArrayShort ob1=new ArrayShort();
		short secondHalf[]=ob1.getArray(a);
		for(int i=0;i<secondHalf.length;i++)
		{
		System.out.print(secondHalf[i]+" ");
		}
	}

}
