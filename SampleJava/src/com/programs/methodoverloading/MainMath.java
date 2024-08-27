package com.programs.methodoverloading;
class Math1
{
	int getAddition(int x, int y)
	{
		int res=(x+y);
		return res;
	}
	String getAddition(String x)
	{
		String res=x;
		return res;
	}
}
public class MainMath {

	public static void main(String[] args) {
		Math1 o=new Math1();
		int val=o.getAddition(10, 20);
		System.out.println(val);

	}

}
