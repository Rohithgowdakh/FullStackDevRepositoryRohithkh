package com.programs.methods.assignment;
class DigitCount
{
	int count=0;
	void givenNum(int num)
	{
		if(num==0)
		{
			count=1;
		}
		
		while(num>0)
		{
			num=num/10;
			count=count+1;
		}
		System.out.println("number of digits :"+count);
	}
}

public class MainDigitCount {

	public static void main(String[] args) {
		DigitCount ob1=new DigitCount();
		ob1.givenNum(68678);

	}

}
