package com.programs.inheritance;
class StudentsDetails
{
	String studentName;
	
	void getDetails(String name)
	{
		this.studentName=name;
		System.out.println("Student Name :"+this.studentName);
	}
}
class StudentMarks extends StudentsDetails
{
	int marks;
	void getDetails(String name,int marks)
	{
		super.getDetails(name);
		this.marks=marks;
		System.out.println("Student1 marks :"+this.marks);

	}
}
class StudentBranch extends StudentMarks
{
	String stream;
	void getDetails(String name,int marks,String branch)
	{
		super.getDetails(name, marks);
		this.stream=branch;
		System.out.println("Student1 Branch :"+this.stream);
	}
}
public class MainMultilvelSame {

	public static void main(String[] args) {
		StudentBranch obj1=new StudentBranch();
		obj1.getDetails("Rahul", 600, "CSE");
	}

}
