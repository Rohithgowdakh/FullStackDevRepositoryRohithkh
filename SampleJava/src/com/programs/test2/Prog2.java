package com.programs.test2;
class School
{
	String name;
	int age;
	void getName()
	{
		this.name="Rohith";
		System.out.println("Name of Student"+this.name);
	}
	void getAge()
	{
		this.age=21;
		System.out.println("age :"+this.age);
	}
	
}
class Library 
{
	Library()
	{
		School o1=new School();
		o1.getAge();
		o1.getName();
		
	}
}
public class Prog2 {

	public static void main(String[] args) {
		Library o1=new Library();
	}

}
