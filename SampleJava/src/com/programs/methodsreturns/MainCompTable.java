package com.programs.methodsreturns;
class TablesAll
{
	String[] getTables(int num)
	{
		String table[]=new String[10];
		for(int i=1;i<=10;i++)
		{
			table[i-1]=num+"*"+i+"="+(num*i);
		}
		return table;
	}
}
public class MainCompTable {

	public static void main(String[] args) {
		TablesAll ob1=new TablesAll();
		String table[]=ob1.getTables(9);
		for(int i=1;i<=10;i++)
		{
			System.out.println(table[i-1]+" ");
		}
	}

}

