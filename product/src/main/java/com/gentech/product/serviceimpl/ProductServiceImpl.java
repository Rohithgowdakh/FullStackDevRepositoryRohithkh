package com.gentech.product.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gentech.product.dto.ProductDto;
import com.gentech.product.entity.Product;
import com.gentech.product.mapper.ProductMapper;
import com.gentech.product.repository.ProductRepository;
import com.gentech.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public ProductDto createProduct(ProductDto productDto) {
		
		Product product=ProductMapper.mapToProduct(productDto);
		Product saveProduct=productRepository.save(product);
		return ProductMapper.mapToProductDto(saveProduct);
	}

	@Override
	public ProductDto displaySpecificProduct(Long id) {
		Product product=productRepository.findById(id).orElseThrow(() -> new RuntimeException("The given id "+id+" not avilable"));
		
		return ProductMapper.mapToProductDto(product);
	}

	@Override
	public List<ProductDto> getAllProducts() {
		return productRepository.findAll()  //it gives list of Product 
				.stream()				//it converts list<Product> to stream (means elements)
				.map((product) -> ProductMapper.mapToProductDto(product))  //the elements are mapped to productDto
				.collect(Collectors.toList());	//convert the productDto elements to List<productDto>
	}

	@Override
	public ProductDto updateProduct(ProductDto productDto) {
		Product product=ProductMapper.mapToProduct(productDto);
		Product savedProduct=productRepository.save(product);
		return ProductMapper.mapToProductDto(savedProduct);
	}

	@Override
	public ProductDto updateProduct2(ProductDto productDto,Long id) {
		Product existingProduct=productRepository.findById(id).orElseThrow(() -> new RuntimeException("The Given Id "+id+" has not found in database"));
		existingProduct.setId(id);
		existingProduct.setProductName(productDto.getProductName());
		existingProduct.setProductType(productDto.getProductType());
		existingProduct.setProductDesc(productDto.getProductDesc());
		
		Product saveToProduct=productRepository.save(existingProduct);
		return ProductMapper.mapToProductDto(saveToProduct);
	}

	@Override
	public void deleteProduct(Long id) {
		productRepository.findById(id).orElseThrow(() -> new RuntimeException("The given id "+id+" has not found in database"));
		productRepository.deleteById(id);
		
		
	}
}
