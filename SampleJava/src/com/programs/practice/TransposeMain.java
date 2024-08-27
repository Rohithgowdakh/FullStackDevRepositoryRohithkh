package com.programs.practice;
class Demo2
{
	int[][] getTrans(int a[][])
	{
		int b[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[j][i]=a[i][j];
			}
			
		}
		return b;
	}
}
public class TransposeMain {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		Demo2 ob1=new Demo2();
		int res[][]=ob1.getTrans(a);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}

}
