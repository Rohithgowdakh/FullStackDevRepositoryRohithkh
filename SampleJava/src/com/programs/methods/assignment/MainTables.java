package com.programs.methods.assignment;
class Tables
{
	void Tables1to20(int j)
	{
		int k=1;
		for(int i=1;i<=200;i++)
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
		System.out.println();
	}
}

public class MainTables {

	public static void main(String[] args) {
		Tables ob1=new Tables();
		ob1.Tables1to20(1);
		ob1.Tables1to20(2);
		ob1.Tables1to20(3);
		ob1.Tables1to20(4);
		ob1.Tables1to20(5);
		ob1.Tables1to20(6);
		ob1.Tables1to20(7);
		ob1.Tables1to20(8);
		ob1.Tables1to20(9);
		ob1.Tables1to20(10);
		ob1.Tables1to20(11);
		ob1.Tables1to20(12);
		ob1.Tables1to20(13);
		ob1.Tables1to20(14);
		ob1.Tables1to20(15);
		ob1.Tables1to20(16);
		ob1.Tables1to20(17);
		ob1.Tables1to20(18);
		ob1.Tables1to20(19);
		ob1.Tables1to20(20);

	}

}
