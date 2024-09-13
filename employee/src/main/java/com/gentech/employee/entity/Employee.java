package com.gentech.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="eid")
	private Long eid;
	
	@Column(name="ename")
	private String ename;
	public Long getEid() {
		return eid;
	}
	public void setEid(Long eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	
	@Column(name="cityname")
	private String cityname;
	
	@Column(name="statename")
	private String statename;
	
	@Column(name="pincode")
	private Long pincode;
	public Employee(String ename, String cityname, String statename, Long pincode) {
		super();
		this.ename = ename;
		this.cityname = cityname;
		this.statename = statename;
		this.pincode = pincode;
	}
	public Employee()
	{
		
	}
}
