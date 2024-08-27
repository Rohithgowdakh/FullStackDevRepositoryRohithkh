package com.oops.test;
interface A1
{
	void getName(String name);
}
interface B1 
{
	void getAge(int age);
}
abstract class Details
{
	abstract void getDet(String name,int age);
}
class Subb extends Details implements A1,B1
{
	void getDet(String name,int age)
	{
		System.out.println("abstract name "+name);
		System.out.println("abstract age "+age);
	}
	public void getName(String name)
	{
		System.out.println("interface name "+ name);
	}
	public void getAge(int age)
	{
		System.out.println("interface age "+age);
	}
}
public class Prog2 {

	public static void main(String[] args) {
		Subb o1=new Subb();
		o1.getDet("Manohar", 21);
		o1.getAge(21);
		o1.getName("Manju");
	}

}
