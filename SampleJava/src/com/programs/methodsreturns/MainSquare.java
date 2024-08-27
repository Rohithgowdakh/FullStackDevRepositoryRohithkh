package com.programs.methodsreturns;
class Square
{
	int[] getSquare()
	{
		int n=0;
		int a[]=new int[10];
		for(int i=1;i<=10;i++)
		{
			 a[n]=i*i;
			 n+=1;
		}
		return a;
	}
}
public class MainSquare {

	public static void main(String[] args) {
		Square ob1=new Square();
		int square[]=ob1.getSquare();
		for(int i=0;i<square.length;i++)
		{
			System.out.print(square[i]+" ");
		}

	}

}
