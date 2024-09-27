package com.gentech.product.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
	 
	private Long id;
	private String productName;
	private String productType;
	private String productDesc;
	private Date createdAt;
	private Date updatedAt;
}
