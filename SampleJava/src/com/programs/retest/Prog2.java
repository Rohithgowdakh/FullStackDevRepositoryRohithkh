package com.programs.retest;
class Brand
{

	static String getName(String nm)
	{
		return nm;
	}
	
}
public class Prog2 {

	public static void main(String[] args) {
		String val=Brand.getName("ThinkPad");
		System.out.println(val);
	}

}
