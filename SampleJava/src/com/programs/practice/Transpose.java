package com.programs.practice;
class TransposeMatrix
{
    int[][] transpose(int a[][])
	{
		int rows=a.length;
		int cols=a[0].length;
		int b[][]=new int[cols][rows];
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[j][i]=a[i][j];
			}
			
		}
		return b;
	}
}
public class Transpose {

	public static void main(String[] args) {
		  int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		  TransposeMatrix ob1=new TransposeMatrix();
		  int res[][]=ob1.transpose(a);
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
