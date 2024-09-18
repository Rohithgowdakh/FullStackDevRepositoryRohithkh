package com.gentech.user.entity;
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
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Long id;
	
	@Column(name="user_name")
	private String name;
	
	@Column(name="emailId")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@CreationTimestamp
	@Column(name="created_at",nullable = false,updatable = false)
	private Date createdAt;
	
	@UpdateTimestamp
	@Column(name="updated_at",nullable=false)
	private Date updatedAt;
}
