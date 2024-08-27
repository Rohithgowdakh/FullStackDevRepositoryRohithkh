package com.programs.practice;
class Employee
{
	String firstName;
	String jobName;
	
	Employee(String firstName,String jobName)
	{
		this.firstName=firstName;
		this.jobName=jobName;
	}
	
	public String toString()//method "toString"
	{
		return "Name of Employee "+firstName+" and Job "+jobName;
	}
	public String oString()
	{
		return "Name of Employee "+firstName+" and Job "+jobName;
	}
}
public class StringDemo1 {
	public static void main(String[] args) {
		Employee obj=new Employee("Santosh","Doctor");
		System.out.println(obj);
		String o1=obj.oString();
		System.out.println(o1);

	}

}

