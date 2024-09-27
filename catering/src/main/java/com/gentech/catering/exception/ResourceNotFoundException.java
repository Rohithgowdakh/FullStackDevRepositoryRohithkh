package com.gentech.catering.exception;

public  class ResourceNotFoundException extends RuntimeException {
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resourceName;
	private String fieldName;
	private Long id;
	public ResourceNotFoundException(String resourceName, String fieldName, Long id) {
		super(String.format("The %s database does not contain an order for the ID: %s related to %s.", resourceName, id, fieldName));
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
