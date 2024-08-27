package com.programs.practice;
class Square2D
{
    int suareSum(int a[][])
	{
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
		    for(int j=0;j<a[i].length;j++)
			{
			    a[i][j]=a[i][j]*a[i][j];
				sum=sum+a[i][j];				
			}
			
		}
		
		return sum;
	}
}
public class SumSquare {

	public static void main(String[] args) {
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		Square2D ob1=new Square2D();
		int sum=ob1.suareSum(a);
		System.out.println(sum);
	}

}
