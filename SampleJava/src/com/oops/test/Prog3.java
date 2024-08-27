package com.oops.test;

abstract class College
{
	static String CollName;
	static int collId;
	static String address;
	static
	{
		CollName="GECK";
		System.out.println("College Name :"+CollName);
		collId=1001;
		System.out.println("College Id :"+collId);
		address="KR PET";
		System.out.println("address :"+address);
	}
	abstract void Subclass(String BookName ,int bookId);
	
}
class SubClass extends College
{
	void Subclass(String BookName,int bookId)
	{
		
		System.out.println("book name :"+BookName);
		System.out.println("Book id :"+bookId);
	}
}
public class Prog3 {

	public static void main(String[] args) {
		College obj1=new SubClass();
		obj1.Subclass("miracle minds", 1001);
	}

}
