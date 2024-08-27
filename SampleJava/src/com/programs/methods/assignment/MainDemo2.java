package com.programs.methods.assignment;
class IntArray1D
{
	int sum=0;
	
	void sum(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println("Sum of Array :"+sum);
	}
}
public class MainDemo2 {
	public static void main(String [] args) {
		int a[]= {10,20,30,40,50,60,70};
		IntArray1D ob1=new IntArray1D();
		ob1.sum(a);
	}

}
