package com.programs.practice;
class Fibonacci {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int fn=0;
		int sn=1;

		for (int i=0;i<=num;i++)
		{
			int result=fn+sn;
			System.out.println(result);
			fn=sn;
			sn=result;
		}
		
	}

}
