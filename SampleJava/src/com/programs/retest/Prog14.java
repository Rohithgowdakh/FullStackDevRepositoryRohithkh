package com.programs.retest;
class Array2D
{
	int getCount(short a[][])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				count=count+1;
			}
		}
		return count;
	}
}
public class Prog14 {

	public static void main(String[] args) {
		short a[][]= {{1,2,3},{12,12,13},{23,34,23}};
		Array2D o1=new Array2D();
		int res=o1.getCount(a);
		System.out.println(res);
	}

}
