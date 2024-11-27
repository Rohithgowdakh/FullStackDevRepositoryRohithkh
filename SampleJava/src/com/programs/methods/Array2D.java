package com.programs.methods;
class Array1
{
	void display(char a[][])
	{
	
		
		for(int i=0;i<a[0].length;i++)
		{
			
			System.out.print(a[0][i]+" ");
		}
	}
}

public class Array2D {

	public static void main(String[] args) {
		char b[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		Array1 o1=new Array1();
		o1.display(b);

	}

}
