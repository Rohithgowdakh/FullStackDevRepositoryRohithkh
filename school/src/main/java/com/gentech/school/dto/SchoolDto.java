package com.gentech.school.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolDto {

	private Long sid;
	private String parentFirstName;
	private String parentLastName;
	private Long parentNumber;
	private String parentEmail;
	private String parentLocation;
	private Date createdAt;
	private Date updatedAt;
	
}
