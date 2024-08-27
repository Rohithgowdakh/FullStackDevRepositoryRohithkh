package com.programs.methods.assignment;

class Array2D
{
	void transpose(int a[][])
	{
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		int colm=a[0].length;
		int rows=a.length;
		int b[][]=new int[colm][rows];
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[j][i]=a[i][j];
			}
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}
public class Main2D {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		Array2D ob1=new Array2D();
		ob1.transpose(a);

	}

}
