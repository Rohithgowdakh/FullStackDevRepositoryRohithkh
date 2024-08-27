package com.programs.inheritance;
class College
{
	College(String collName,String Address)
	{
		System.out.println("College Name :"+collName);
		System.out.println("Address :"+Address);
	}
	
	void getDist()
	{
		System.out.println("district name mandya");
	}
}
class Library1 extends College
{
	int LibraryId;
	Library1(int libId)
	{
		
		super("GECK","KR PET");
		this.LibraryId=libId;
		System.out.println("Library ID :"+libId);
	}
}
public class MainParameter {

	public static void main(String[] args) {
		Library1 obj1=new Library1(10);
		obj1.getDist();
	}

}
