package com.oops.test;
abstract class Animal{
	abstract void eat();
}
class Dog extends Animal{
	void eat() {
		System.out.println("dog eats veg and nonveg foods");
	}
}
class Cat extends Animal{
	void eat() {
		System.out.println("cat eats veg and nonveg foods");
	}
}
class Cow extends Animal{
	void eat() {
		System.out.println("dog eats veg foods");
	}
}
public class Prog9 {

	public static void main(String[] args) {
		Animal object;
		
		object=new Dog();
		object.eat();
		
		object=new Cat();
		object.eat();
		
		object=new Cow();
		object.eat();
	}

}
