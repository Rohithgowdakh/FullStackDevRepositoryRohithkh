package com.programs.practice;
class Tables2
{
	String[] getTable(int num)
	{
		String tables[]=new String[10];
		for(int i=1;i<=10;i++)
		{
			tables[i-1]=num +"*"+ i+"="+(num*i);
		}
		return tables;
	}
}
public class Tables1To20 {

	public static void main(String[] args) {
		Tables2 ob1=new Tables2();
		String table7[]=ob1.getTable(7);
		for(int i=0;i<10;i++)
		{
			System.out.println(table7[i]);
		}

	}

}
