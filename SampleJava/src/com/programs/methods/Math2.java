package com.programs.methods;
class Add
{
	void num(int j)
	{
		int count=0;
		for(int i=50;i<=150;i++)
		{
			if(i%j==0)
			{
				count+=1;
				
			}
			
		}
		System.out.println("count is :"+count);
	}
}

public class Math2 {

	public static void main(String[] args) {
		Add o1=new Add();
		o1.num(6);
	}

}
