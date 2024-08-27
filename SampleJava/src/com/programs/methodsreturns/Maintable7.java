package com.programs.methodsreturns;
class Tables
{
	String[] getTables()
	{
		int num=7;
		String table[]=new String[10];
		for(int i=10;i>=1;i--)
		{
			table[i-1]="7"+"*"+i+"="+(num*i);
		}
		return table;
	}
}
public class Maintable7 {

	public static void main(String[] args) {
		Tables ob1=new Tables();
		String table7[]=ob1.getTables();
		for(int i=10;i>=1;i--)
		{
			System.out.println(table7[i-1]+" ");
		}
	}

}
