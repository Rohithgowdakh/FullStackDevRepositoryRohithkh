package com.gentech.demo.factorial;


public class Product {
	
	private String name;
	private String salary;
	private Product() {
		
	}
	public Product(String name, String salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

}
