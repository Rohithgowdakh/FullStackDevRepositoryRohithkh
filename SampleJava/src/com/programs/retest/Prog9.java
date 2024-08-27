package com.programs.retest;
class OddNum
{
	int[] getOdd()
	{
		int k=0;
		int res[]=new int[5];
		for(int i=21;i>=11;i--)
		{
			if(i%2==1)
			{
				res[k]=i;
				k=k+1;
			}
		}
		return res;
	}
}
public class Prog9 {

	public static void main(String[] args) {
		OddNum o1=new OddNum();
		int res[]=o1.getOdd();
		for(int ele:res)
		{
			System.out.println(ele);
		}
	}

}
