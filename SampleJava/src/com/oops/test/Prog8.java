package com.oops.test;
class Employee11
{
	String name="john";
	private int age=30;
	private int salary=300000;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	void empDet() {
		
		System.out.println("Employee Name :"+name);
		System.out.println("Employee age :"+age);
		System.out.println("Employee salary :"+salary);
	}
}
public class Prog8 {

	public static void main(String[] args) {
		Employee11 o1=new Employee11();
		o1.empDet();
		o1.setAge(40);
		o1.setSalary(400000);
		o1.empDet();
	
	}

}
