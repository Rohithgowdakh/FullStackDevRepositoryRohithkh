package com.practice.returnmethods;
class Tables
{
	String[] getTable(int num)
	{
		String arr[]=new String[10];
		for(int i=1;i<=10;i++)
		{
			arr[i-1]=num+"*"+i+"="+(num*i);
		}
		return arr;
	}
}
public class Table7 {

	public static void main(String[] args) {
		Tables o1=new Tables();
		String res[]=o1.getTable(9);
		for(String kk:res)
		{
			System.out.println(kk);
		}
	}

}
