package com.gentech.catering.entity;

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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tbl_catering")
public class Catering {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="catering_id")
	private Long id;
	
	@Column(name="customer_name",nullable = false)
	private String name;
	
	@Column(name="customer_location",nullable = false)
	private String location;
	
	@Column(name="food_items",nullable = false)
	private String items;
	
	@Column(name="total_amount",nullable = false)
	private int amount;
	
	@CreationTimestamp
	@Column(name="createdAt",nullable = false,updatable = false)
	private Date createdAt;
	
	@UpdateTimestamp
	@Column(name="updatedAt",nullable = false)
	private Date updatedAt;
}
