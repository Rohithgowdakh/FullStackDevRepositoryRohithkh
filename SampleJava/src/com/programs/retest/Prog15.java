package com.programs.retest;
class Count
{
	int getCount()
	{
		int count=0;
		for(int i=50;i>=30;i--)
		{
			if(i%4==0)
			{
				count=count+1;
			}
		}
		return count;
	}
}
public class Prog15 {

	public static void main(String[] args) {
		Count o1=new Count();
		int res=o1.getCount();
		System.out.println(res);
	}

}
