package com.gentech.event.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventDto {
	
	private Long id;
	private String name;
	private String location;
	private String status;
	private Date createdAt;
	private Date updatedAt;
}
