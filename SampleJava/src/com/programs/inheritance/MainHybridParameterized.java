package com.programs.inheritance;
class Animal1
{
	String name;
	int age;
	Animal1(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Animal Name :"+name);
		System.out.println("Animal age :"+age);
	}
}
class Dog extends Animal1
{
	Dog(String dogName)
	{
		super("dog",10);
		System.out.println("Dog Name :"+dogName);
	}
}
class BabyDog extends Dog
{
	BabyDog(String dogName,String babyName)
	{
		super(dogName);
		System.out.println("Baby Dog name :"+babyName);
	}
}
class Cat extends Animal1
{
	Cat(String name,int age,String catName)
	{
		super(name,age);
		System.out.println("Cat Name :"+catName);
	}
}
public class MainHybridParameterized {

	public static void main(String[] args) {
		Cat obj1=new Cat("cat",5,"chotu");
		System.out.println();
		BabyDog obj2=new BabyDog("Pintu","mintu");
	}

}
