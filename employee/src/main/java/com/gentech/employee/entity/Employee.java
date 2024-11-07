package com.gentech.employee.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="e_id")
	private Long e_id;
	
	@Column(name="e_name")
	private String e_name;
	
	@Column(name="job")
	private String job;
	
	@Column(name="phone_no")
	private Long phone_no;
	
	@Column(name="salary")
	private Long salary;
	
	@CreationTimestamp
	@Column(name="createdAt", nullable=false,updatable=false)
	private Date createdAt;
	
	@UpdateTimestamp
	@Column(name="updatedAt",nullable=false)
	private Date updatedAt;
	
	public Employee()
	{
		
	}
	
	public Employee(String e_name, String job, Long phone_no, Long salary, Date createdAt, Date updatedAt) {
		super();
		this.e_name = e_name;
		this.job = job;
		this.phone_no = phone_no;
		this.salary = salary;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Long getE_id() {
		return e_id;
	}
	public void setE_id(Long e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(Long phone_no) {
		this.phone_no = phone_no;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}

}
