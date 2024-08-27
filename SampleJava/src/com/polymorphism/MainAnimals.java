package com.polymorphism;
class Animal
{
	void eat()
	{
		System.out.println("foods for particuar animals");
	}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("dogs eat VEG and NON VEG Foods");
	}
}
class Cat extends Animal
{
	void eat()
	{
		System.out.println("cats eat VEG and NON VEG Foods");
	}
}
class Cow extends Animal
{
	void eat()
	{
		System.out.println("cows eat VEG Foods ");
	}
}
public class MainAnimals {

	public static void main(String[] args) {
		Animal o=new Dog();
		o.eat();
		
		o=new Cat();
		o.eat();
		
		o=new Cow();
		o.eat();
		
		
	}

}
