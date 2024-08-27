package com.programs.inheritance;
class School
{
	String schoolName;
	void getName(String schoolName)
	{
		this.schoolName=schoolName;
		System.out.println("School Name : "+schoolName);
	}
}
class Library extends School
{
	
	void getLib(String bookName,int bookId)
	{
		super.getName("Geck");
		System.out.println("Book Name: "+bookName);
		System.out.println("Book id :"+bookId);
	}
}
class Sports extends School
{
	Sports(String sportName,int noOfPlayers)
	{
		System.out.println("Sports name :"+sportName);
		System.out.println("Number of players :"+noOfPlayers);
	}
}
class Teacher extends School
{
	String teacherName;
		void getName()
		{
			super.getName("Geck");
			System.out.println("Teacher Name :"+teacherName);
		}
}
public class MainHeirarchical {

	public static void main(String[] args) {
		Sports ob1=new Sports("VolleyBall",6);
		ob1.getName("geck");
		Teacher ob2=new Teacher();		
		ob2.teacherName="Tejaswi";
		ob2.getName();
		Library ob3=new Library();
		ob3.getLib("corejava", 10);
	}

}
