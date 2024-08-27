package com.programs.methods;
class Array1
{
	void display(char a[][])
	{
		String result="";
		
		for(int i=0;i<a[0].length;i++)
		{
			System.out.print(result+" ");
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
