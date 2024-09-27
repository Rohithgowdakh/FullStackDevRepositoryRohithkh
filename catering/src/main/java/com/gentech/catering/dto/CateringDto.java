package com.gentech.catering.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CateringDto {
	
	private Long id;
	private String name;
	private String location;
	private String items;
	private int amount;
	private Date createdAt;
	private Date updatedAt;
}
