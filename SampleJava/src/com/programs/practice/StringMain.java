package com.programs.practice;
class StringArray
{
	String[] getReverse(String a[])
	{
		int k=0;
		String  b[]=new String[a.length];
		for(int i=a.length-1;i>=0;i--)
		{
			b[k]=a[i];
			k=k+1;
		}
		return b;
	}
}
public class StringMain {
	public static void main(String []args)
	{
		String a[]= {"rohi","manu","sagar","john","virt"};
		StringArray o1=new StringArray();
		String res[]=o1.getReverse(a);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
	}
}
