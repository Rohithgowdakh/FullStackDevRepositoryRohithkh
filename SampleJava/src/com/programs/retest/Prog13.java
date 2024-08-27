package com.programs.retest;
class Avg
{
	double getSvg(int a,int b,int c)
	{
		double avg=(a+b+c)/3;
		return avg;
	}
}
public class Prog13 {

	public static void main(String[] args) {
		Avg o1=new Avg();
		double res=o1.getSvg(10, 20, 30);
		System.out.println(res);
	}

}
