package com.programs.retest;
class Eligible
{
	static String getVot(int age)
	{
		String person;
		if(age>=18)
		{
			person="eligible for voting";
		}
		else
		{
			person="not eligible";
		}
		return person;
	}
}
public class Voting {

	public static void main(String[] args) {
		String res=Eligible.getVot(16);
		System.out.println(res);
	}

}
