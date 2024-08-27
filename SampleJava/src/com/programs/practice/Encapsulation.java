package com.programs.practice;
class De2
{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		De2 ob1=new De2();
		ob1.setAge(10);
		ob1.setName("manu");
		int age=ob1.getAge();
		System.out.println(age);
		String Name=ob1.getName();
		System.out.println(Name);

	}

}
