package com.programs.inheritance;
class Animal
{
	String animalsName;
	Animal(String animalsName)
	{
		System.out.println("animal name :"+animalsName);
	}
}
class Lion extends Animal
{
	int age;
	Lion(String animalsName)
	{
		
		super(animalsName);
		
	}
	
}
class Tiger extends Animal
{
	Tiger(String name,String TigerName)
	{
		super(name);
		System.out.println("tiger name :"+TigerName);
	}
	
}
class BabyTiger extends Tiger
{
	BabyTiger(String name,String Tiger,String BabyName)
	{
		super(name,Tiger);
		System.out.println("baby tiger name :"+BabyName);
	}
	void getBabyTigerDetails(String type,int age)
	{
		System.out.println("baby Tiger belongs to :"+type);
		System.out.println("baby Tiger age  :"+age);
	}
	
}
public class MainHybrid {

	public static void main(String[] args) {
		BabyTiger obj1=new BabyTiger("Tiger","Ronaldo","junRonaldo");
		obj1.getBabyTigerDetails("Animals", 10);
		System.out.println( );
		
		Lion obj2=new Lion("Lion");
		obj2.age=10;
		System.out.println("Age of Lion :"+obj2.age);
	}

}
