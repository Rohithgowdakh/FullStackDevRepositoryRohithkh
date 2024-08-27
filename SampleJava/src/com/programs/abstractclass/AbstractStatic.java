package com.programs.abstractclass;
abstract class Employee
{
	static String empName;
	static String jobName;
	static double salary;
	static int empId;
	static void empDetails(String name,String job)
	{
		Employee.empName=name;
		Employee.jobName=job;
		System.out.println("employee name :"+empName);
		System.out.println("employee job :"+jobName);
	}
	static void empDetails2(double salary,int id)
	{
		empDetails("Manu","Developer");
		Employee.salary=salary;
		Employee.empId=id;
		System.out.println("employee name :"+Employee.salary);
		System.out.println("employee job :"+Employee.empId);
	}
}
public class AbstractStatic {

	public static void main(String[] args) {
		Employee.empDetails2(500000, 10);
		System.out.println();
		Employee.empDetails("Rohith","Developer");
	}

}
