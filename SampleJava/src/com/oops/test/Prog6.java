package com.oops.test;
interface A
{
	void getName(String Name);
	
}
interface B extends A
{
	void getDetails(String Name,int age,String place);
	
}
class Sub implements B{
	public void getName(String Name) 
	{
		System.out.println("Student name :"+Name);
	}
	public void getDetails(String Name,int age,String place)
	{
		System.out.println("Student2 name :"+Name);
		System.out.println("Student2 age :"+age);
		System.out.println("Student2 place :"+place);
	}
}
public class Prog6 {

	public static void main(String[] args) {
		Sub o1=new Sub();
		o1.getName("ROHITH SHARMA");
		o1.getDetails("Dp Manu", 21, "hassan");
	}

}
