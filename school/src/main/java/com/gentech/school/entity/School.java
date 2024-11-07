package com.gentech.school.entity;


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
@Table(name="school_tbl")
public class School {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private Long sid;
	
	@Column(name="parent_fname")
	private String parentFirstName;
	
	@Column(name="parent_lname")
	private String parentLastName;
	
	@Column(name="parent_number")
	private Long parentNumber;
	
	@Column(name="parent_email")
	private String parentEmail;
	
	@Column(name="parent_location")
	private String parentLocation;
	
	@CreationTimestamp
	@Column(name="created_at",nullable = false,updatable = false)
	private Date createdAt;
	
	@UpdateTimestamp
	@Column(name="updated_at",nullable = false)
	private Date updatedAt;
}
