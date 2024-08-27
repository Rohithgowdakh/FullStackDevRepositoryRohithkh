package com.programs.practice;
class Stringa
{
	boolean getString(String str)
	{
		int left=0;
		int right=str.length()-1;
		while(left<right)
		{
			if(str.charAt(left)!=str.charAt(right))
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
public class ReverseString {

	public static void main(String[] args) {
		Stringa o1=new Stringa();
		boolean val=o1.getString("racecar");
		System.out.println(val);
	}

}
