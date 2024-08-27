package com.gentech.programs;

	class Employee
	{
		String empName;
		int empId;
		int salary;
	}
	class Dept
	{
		String deptName;
		int deptId;
	}
	class Insurance
	{
		String memberName;
		String insName;
	}
	public class Employees {
	public static void main(String[] args)
	{
		Employee rohith=new Employee();
		rohith.empName="ROHITH KH";
		rohith.empId=1;
		rohith.salary=50000;
		System.out.println("employee name :"+rohith.empName);
		System.out.println("employee ID :"+rohith.empId);
		System.out.println("employee salary :"+rohith.salary);
		System.out.println("++++++++++++++");
		Employee manu=new Employee();
		manu.empName="Manu D P";
		manu.empId=2;
		manu.salary=50000;
		System.out.println("employee name :"+manu.empName);
		System.out.println("employee ID :"+manu.empId);
		System.out.println("employee salary :"+manu.salary);
		System.out.println();
		Dept Department=new Dept();
		Department.deptName="Sales";
		Department.deptId=10;
		System.out.println("Department name :"+Department.deptName);
		System.out.println("dept id :"+Department.deptId);
		System.out.println("++++++++++++++");
		Dept Department1=new Dept();
		Department1.deptName="IT";
		Department1.deptId=20;
		System.out.println("Department name :"+Department1.deptName);
		System.out.println("dept id :"+Department1.deptId);
		System.out.println();
		Insurance health=new Insurance();
		health.memberName="James";
		health.insName="Health Insurance";
		System.out.println("members name :"+health.memberName);
		System.out.println("insurance type :"+health.insName);
		System.out.println("++++++++++++++");
		Insurance life=new Insurance();
		life.memberName="Mark";
		life.insName="Life Insurance";
		System.out.println("members name :"+life.memberName);
		System.out.println("insurance type :"+life.insName);
	}

}

