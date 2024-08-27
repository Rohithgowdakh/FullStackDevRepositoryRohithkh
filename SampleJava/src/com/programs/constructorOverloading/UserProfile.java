package com.programs.constructorOverloading;
class Profile
{
	
	Profile(String firstName,String lastName)
	{
		System.out.println("First Name:"+firstName);
		System.out.println("Last Name :"+lastName);
	}
	Profile(int age)
	{
		this("roohith","gyugu");
		System.out.println("age :"+age);
		
	}
	Profile(String emailId)
	{
		
		this(20);
		System.out.println("Email id :"+emailId);
	}
}

public class UserProfile {

	public static void main(String[] args) {
		Profile person1=new Profile("Rohitt","k H");
		Profile person2=new Profile("Rohit@geck.com");
		Profile person3=new Profile(20);
	}

}
