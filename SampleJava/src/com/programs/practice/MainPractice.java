package com.programs.practice;

class Demo23
{
	 int num;
	void getNum( int num)
	{
		this.num=num;
		
		System.out.println("it is a Instance method"+num);
		
	}
}
class Demo1
{
	static
	{
		Demo23 oo=new Demo23();
		oo.getNum(10);
		System.out.println("it is a static method");
	}
	
}
public class MainPractice {

	public static void main(String[] args) {
		Demo1 o=new Demo1();

	}

}
