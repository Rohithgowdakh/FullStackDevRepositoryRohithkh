package com.programs.inheritance;
class Employee
{
	String empName;
	Employee(String Name)
	{
		System.out.println("employeee name :"+Name);
	}
	void getName()
	{
		this.empName="manu";
		System.out.println("Employee Name :"+empName);
	}
}
class EmployeeAge extends Employee
{
	EmployeeAge (String name,int age)
	{
		super(name);
		System.out.println("employee Age:"+age);
	}
	
	void getAge(int age)
	{
		super.getName();
		System.out.println("Employee Age :"+ age);
	}
}
class EmployeeSalary extends EmployeeAge
{
	EmployeeSalary (String name,int age,double salary)
	{
		super(name,age);
		System.out.println("employee salary:"+salary);
	}
	
	
	void getSalary(double salary)
	{
		System.out.println("Employee salary :"+ salary);
	}
}
public class MainMultilevel {

	public static void main(String[] args) {
		EmployeeSalary obj1=new EmployeeSalary("Rohith",19,50000);
		System.out.println();
		obj1.getAge(30);
		obj1.getSalary(50000);
		
	}

}
