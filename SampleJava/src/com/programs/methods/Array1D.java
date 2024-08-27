package com.programs.methods;
class Array
{
	void display(String a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}

public class Array1D {

	public static void main(String[] args) {
		String b[]= {"ab","cd","ef","gh","ij"};
		Array o1=new Array();
		o1.display(b);

	}

}
