package com.programs.retest;
class AreaRec
{
	static int getRect(int length,int breadth)
	{
		int res=length*breadth;
		return res;
	}
}
public class AreaRect {

	public static void main(String[] args) {
		int res=AreaRec.getRect(10, 10);
		System.out.println(res);
	}

}
