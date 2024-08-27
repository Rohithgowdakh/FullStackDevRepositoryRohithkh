package com.oops.test;
class Employee22
{
	void getDetails(String name,int age)
	{
		System.out.println("name of employee11 :"+name);
		System.out.println("age of employee11 :"+age);
	}
}
class Employee33 extends Employee22
{
	void getDetails(String name,int age)
	{
		super.getDetails("Rohith", 21);
		System.out.println("name of employee33 :"+name);
		System.out.println("age of employee33 :"+age);
	}
}
public class Prog10 {

	public static void main(String[] args) {
		Employee33 o1=new Employee33();
		o1.getDetails("manu", 22);
	}

}
