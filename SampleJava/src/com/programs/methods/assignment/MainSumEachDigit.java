package com.programs.methods.assignment;
class SumOfNum
{
	int remainder=0;
	void sum(int num)
	{

			while(num>0)
			{
				remainder=remainder+num%10;
				num=num/10;
			}
			System.out.println("sum of nmbers :"+remainder);
	}
}

public class MainSumEachDigit {
	public static void main(String[]args) {
		SumOfNum ob1=new SumOfNum();
		ob1.sum(548);

	}

}
