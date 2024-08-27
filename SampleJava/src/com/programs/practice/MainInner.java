package com.programs.practice;
class Outer
{
	String firstName;
	Inner inner=new Inner();
	void getOuter()
	{
		
	
		inner.age=10;
		System.out.println(inner.age);
	}
	class Inner
	{
		int age;
		void getInner()
		{
			firstName="Rohith";
			System.out.println(firstName);
		}
	}
}
public class MainInner {

	public static void main(String[] args) {
		
		Outer outer=new Outer();
		outer.getOuter();
		outer.inner.getInner();
	}

}
