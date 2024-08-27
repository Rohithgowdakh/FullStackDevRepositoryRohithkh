package com.programs.inheritance;
class Employee1
{
	String name;
	String jobname;
	private double salary;
	Employee1(String Name)
	{
		this.name=Name;
		System.out.println("Name of Employee :"+Name);
	}
	Employee1(String Name,String jobName)
	{
		this(Name);
		this.jobname=jobName;
		System.out.println("Name of job :"+this.jobname);
	}
	Employee1(double salary)
	{
		this.salary=salary;
		System.out.println("salary is :"+this.salary);
	}
}
class Department1 extends Employee1
{
	Department1(String Name)
	{
		super(Name);
	}

	Department1(String name, String job)
	{
		super(name,job);
	}
	Department1(double salary)
	{
		super(salary);
	}
}
class Department2 extends Department1
{
	Department2(String Name)
	{
		super(Name);
	}
	Department2(String name, String job,String depName)
	{
		super(name,job);
		System.out.println("department name :"+depName);
		
	}
	Department2(double salary)
	{
		super(salary);
	}
}

public class MainOverload {

	public static void main(String[] args) {
		Department2 obj1=new Department2("Manu","Developer","IT");
		Department2 obj2=new Department2("Rohith");
		Department2 obj3=new Department2(500000);
	}

}
