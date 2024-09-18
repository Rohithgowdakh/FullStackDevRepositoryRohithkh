package com.gentech.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resourceName;
	private String fieldName;
	private Long id;
	public ResourceNotFoundException(String resourceName, String fieldName, Long id) {
		super(String.format("Resource %s not found for %s with ID: %s", resourceName,fieldName,id));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.id = id;
	}
	public String getResourceName() {
		return resourceName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public Long getId() {
		return id;
	}
	
	
}
