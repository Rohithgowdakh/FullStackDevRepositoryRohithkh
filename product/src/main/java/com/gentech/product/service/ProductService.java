package com.gentech.product.service;

import java.util.List;

import com.gentech.product.dto.ProductDto;

public interface ProductService {
	
	
	ProductDto createProduct(ProductDto productDto);
	
	ProductDto displaySpecificProduct(Long id);
	
	List<ProductDto> getAllProducts();
	
	ProductDto updateProduct(ProductDto productDto);
	
	ProductDto updateProduct2(ProductDto productDto,Long id);
	
	void deleteProduct(Long id);
	
}
