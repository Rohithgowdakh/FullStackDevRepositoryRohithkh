package com.programs.practice;
class Demo3
{
	int reverse(int num)
	{
		int rem=0;
		while(num>0)
		{
			 rem=num%10;
			 System.out.print(rem);
			 num=num/10;
		}
		return rem;
	}
}
public class DigitMain {

	public static void main(String[] args) {
	Demo3 ob1=new Demo3();
	ob1.reverse(4579);

	}

}
