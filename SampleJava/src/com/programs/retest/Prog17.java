package com.programs.retest;
class Strinfg
{
	static int getNum()
	{
		int res=0;
		String a[]= {"12","34","6"};
		for(int i=0;i<a.length;i++)
		{
			res=res+Integer.parseInt(a[i]);
		}
		return res;
	}
}
public class Prog17 {

	public static void main(String[] args) {
		int res=Strinfg.getNum();
		System.out.println(res);
	}

}
