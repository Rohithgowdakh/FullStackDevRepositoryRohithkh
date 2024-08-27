package com.practice.returnmethods;
class Square
{
	int[] getSquare(int x,int y)
	{
		int a[]=new int[y];
		for(int i=x;i<=y;i++)
		{
			a[i-1]=i*i;
		}
		return a;
	}
}
public class SuareMain {

	public static void main(String[] args) {
		Square ob1=new Square();
		int b[]=ob1.getSquare(1, 10);
		for(int kk:b)
		{
			System.out.println(kk+" ");
		}
	}

}
