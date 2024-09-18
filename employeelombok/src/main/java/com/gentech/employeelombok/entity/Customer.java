package com.gentech.employeelombok.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="customer_id")
	private Long id;
	
	@Column(name="customer_name")
	private String name;
	
	@Column(name="customer_age")
	private int age;
	
	@Column(name="customer_city")
	private String city;
	
	@CreationTimestamp
	@Column(name="createdAt", nullable=false,updatable=false)
	private Date createdAt;
	
	@UpdateTimestamp
	@Column(name="updatedAt",nullable=false)
	private Date updatedAt;
	
}
