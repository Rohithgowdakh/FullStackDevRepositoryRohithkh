package com.programs.methodsreturns;
class ArrayShort1
{
	short[] getDiagonal(short a[][])
	{
		
		short diagonal[]=new short[a.length];
		for(int i=0;i<a.length;i++)
		{
			diagonal[i]=a[i][i];
		}
		return diagonal;
	}
}

public class MainShort2D {

	public static void main(String[] args) {
		short a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		ArrayShort1 ob1=new ArrayShort1();
		short Dia[]=ob1.getDiagonal(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(Dia[i]);
		}
	}
}
