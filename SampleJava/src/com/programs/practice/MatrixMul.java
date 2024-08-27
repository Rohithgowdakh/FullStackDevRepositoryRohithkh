package com.programs.practice;
class MultiplyMatrix
{
    int[][] main(int a[][],int b[][])
	{
	   
		int l[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
		    for(int j=0;j<a[i].length;j++)
			{
				l[i][j]=0;
				for(int k=0;k<a[i].length;k++)
				{
				    l[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		return l;
		
	}
}
public class MatrixMul {
	public static void main(String[ ]args)
	{
		 int a[][]={{1,2,3},{4,5,6},{7,8,9}};
			int b[][]={{1,2,3},{4,5,6},{7,8,9}};
			MultiplyMatrix ob1=new MultiplyMatrix();
			int res[][]=ob1.main(a,b);
			for(int i=0;i<res.length;i++)
			{
			    for(int j=0;j<res[i].length;j++)
				{
					System.out.print(res[i][j]+" ");
				}
			    System.out.println();
			}
	}
}
