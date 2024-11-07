package com.gentech.event.entity;

import java.util.Date;

import org.hibernate.annotations.CurrentTimestamp;
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
@Table(name = "tbl_event")
public class Event {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="event_id")
	private Long id;
	
	@Column(name="event_name")
	private String name;
	
	@Column(name="event_location")
	private String location;
	
	@Column(name="event_status")
	private String status;
	
	@CurrentTimestamp
	@Column(name="createdAt")
	private Date createdAt;
	
	@UpdateTimestamp
	@Column(name="updatedAt")
	private Date updatedAt;
	
}
