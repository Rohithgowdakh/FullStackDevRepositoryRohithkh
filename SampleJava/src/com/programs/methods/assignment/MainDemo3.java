package com.programs.methods.assignment;
class BooleanArray1D
{

	
	void reverse(boolean a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println("reverse of Array :"+a[i]);
			
		}
		
	}
}
public class MainDemo3 {
	public static void main(String [] args) {
		boolean a[]= {true,true,true,false,false,false};
		BooleanArray1D ob1=new BooleanArray1D();
		ob1.reverse(a);
	}

}

