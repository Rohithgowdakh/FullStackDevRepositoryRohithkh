package com.gentech.demo.factorial;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductDet {
	@GetMapping("/det")
	public Product getDet()
	{
		return new Product("rohi","230$");
	}
	@GetMapping("/Product")
	public List<Product> getDetails()
	{
		List<Product> obj=new ArrayList<>();
		obj.add(new Product("rohi1","233$"));
		obj.add(new Product("rohi2","253$"));
		obj.add(new Product("rohi3","255$"));
		return obj;
	}
	@GetMapping("/prod1")
	public Product[] getDetails1()
	{
		Product obj[]= {new Product("rohi1","233$"),new Product("rohi1","233$"),new Product("rohi1","233$")};
		return obj;
	}
}
