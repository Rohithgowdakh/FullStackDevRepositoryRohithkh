package com.programs.practice;

public class SwapWithoutTemp {
	
	static void swapWithoutTemp(int a,int b)
	{
//		int temp=a;
//		a=b;
//		b=temp;
//		a=a+b;
//		b=a-b;
//		a=a-b;
		a=b^a;
		b=a^b;
		a=a^b;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}

	public static void main(String[] args) {
		
		swapWithoutTemp(10,20);
	}

}
