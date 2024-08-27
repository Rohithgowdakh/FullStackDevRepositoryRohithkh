package com.programs.methods.assignment;
class ArrayCube
{
	void cube(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=a[i]*a[i]*a[i];
			System.out.println(a[i]+" ");
		}
	}
}

public class MainCube {

	public static void main(String[] args) {
		int b[]= {2,3,4,5,6,7,8,9};
		ArrayCube ob1=new ArrayCube();
		ob1.cube(b);
		
	}

}
