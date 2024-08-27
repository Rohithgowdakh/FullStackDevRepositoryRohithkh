package com.programs.NoArgs.constructor;

class Employee
	{
		String empName;
		int empId;
		int salary;
		Employee()
		{
			
			empName="Manu D P";
			empId=2;
			salary=50000;
			System.out.println("employee name :"+empName);
			System.out.println("employee ID :"+empId);
			System.out.println("employee salary :"+salary);
			System.out.println();
		}
	}
	class Dept
	{
		String deptName;
		int deptId;
		Dept()
		{
			
			deptName="Sales";
			deptId=10;
			System.out.println("Department name :"+deptName);
			System.out.println("dept id :"+deptId);
			System.out.println("++++++++++++++");
		}
	}
	class Insurance
	{
		String memberName;
		String insName;
		Insurance()
		{
			
			memberName="Mark";
			insName="Life Insurance";
			System.out.println("members name :"+memberName);
			System.out.println("insurance type :"+insName);
		}
	}
	public class EmployeeMain {
	public static void main(String[] args)
	{
		Insurance life=new Insurance();
		Dept Department=new Dept();
		Employee manu=new Employee();
		
	}

}
