package com.programs.abstractclass;
abstract class Employee1
{
	abstract String getDetails(String empName,double salary);
}
class Employee2 extends Employee1
{
	String empName;
	double salary;
	String getDetails(String empName,double salary)
	{
		this.empName=empName;
		this.salary=salary;
		System.out.println("Employee Name :"+this.empName);
		System.out.println("salary : "+this.salary);
		return empName;
	}

}
public class AbstractMethod {

	public static void main(String[] args) {
		Employee2 obj1=new Employee2();
		obj1.getDetails("Rohith", 50000);
	}

}
