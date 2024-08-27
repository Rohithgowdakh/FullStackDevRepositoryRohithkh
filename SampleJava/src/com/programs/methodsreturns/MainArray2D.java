package com.programs.methodsreturns;
class Array2D
{
	int[] getFirstRow(int a[][])
	{
		int k=0;
		int sec[]=new int[a[0].length];
		for(int i=0;i<a[0].length;i++)
		{
			sec[k]=a[0][i];
			k+=1;
		}
		return sec;
	}
}

public class MainArray2D {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		Array2D ob1=new Array2D();
		int arrRow[]=ob1.getFirstRow(a);
		for(int i=0;i<arrRow.length;i++)
		{
			System.out.print(arrRow[i]+" ");
		}
	}

}
