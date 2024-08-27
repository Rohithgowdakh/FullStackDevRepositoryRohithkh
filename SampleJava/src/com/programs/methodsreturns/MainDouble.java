package com.programs.methodsreturns;
class ArrayDouble
{
	double[] getReverse(double a[])
	{
		double ele[]=new double[a.length];
		for(int i=a.length-1;i>=0;i--)
		{
			ele[i]=a[i];
		}
		return ele;
	}
}

public class MainDouble {

	public static void main(String[] args) {
		double a[]= {10.12,20.33,30.45,40.45,50.33,60.34,70.45,80.53};
		ArrayDouble ob1=new ArrayDouble();
		double reverse[]=ob1.getReverse(a);
		for(int i=reverse.length-1;i>=0;i--)
		{
			System.out.print(reverse[i]+" ");
		}
	}

}
