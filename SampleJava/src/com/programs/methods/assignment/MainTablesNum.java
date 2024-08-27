package com.programs.methods.assignment;
class TablesGivenNum
{
	void TablesNum(int j)
	{
		int k=1;
		for(int i=1;i<=20000;i++)
		{
			if(i%j==0)
			{
				System.out.println(j+"*"+k+"="+i);
				k+=1;
			}
			if(k==11)
			{
				break;
			}
		}
		
	}
}

public class MainTablesNum {

	public static void main(String[] args) {
		TablesGivenNum ob1=new TablesGivenNum();
		ob1.TablesNum(5);
	}
}