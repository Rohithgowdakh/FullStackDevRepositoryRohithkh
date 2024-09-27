package com.gentech.catering.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gentech.catering.dto.CateringDto;
import com.gentech.catering.service.CateringService;

@RestController
@RequestMapping("/v1/api")
public class CateringController {
	
	@Autowired
	private CateringService cateringService;
	
	@PostMapping("/catering")
	public ResponseEntity<CateringDto> createCateringOrder(@RequestBody CateringDto cateringDto)
	{
		return new ResponseEntity<CateringDto>(cateringService.createCateringOrder(cateringDto),HttpStatusCode.valueOf(201));
	}
	
	@GetMapping("/catering/{id}")
	public ResponseEntity<CateringDto> getSpeificCateingOrder(@PathVariable Long id)
	{
		return new ResponseEntity<CateringDto>(cateringService.getSpecificCatering(id),HttpStatusCode.valueOf(201));
	}
	
	@GetMapping("/caterings")
	public ResponseEntity<List<CateringDto>> getAllCateringOrder()
	{
		return new ResponseEntity<List<CateringDto>>(cateringService.getAllCateringOrder(),HttpStatusCode.valueOf(200));
	}

	
	@PutMapping("/catering/{id}")
	public ResponseEntity<CateringDto> updateCateringOrder(@RequestBody CateringDto cateringDto,@PathVariable Long id)
	{
		return new ResponseEntity<CateringDto>(cateringService.updateCateringOrder2(cateringDto, id),HttpStatusCode.valueOf(200));
	}
	
	@DeleteMapping("/catering/{id}")
	public ResponseEntity<String> deleteCateringOrder(@PathVariable Long id)
	{
		cateringService.deleteCateringOrder(id);
		return new ResponseEntity<String>("The given id "+id+" is deleted",HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("/catering/findbyname")
	public ResponseEntity<List<CateringDto>> getCateringByCateringName(@RequestParam String name)
	{
		return new ResponseEntity<List<CateringDto>>(cateringService.getCateringByCateringName(name),HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("/catering/findbylocation")
	public ResponseEntity<List<CateringDto>> getCateringByCateringLocation(@RequestParam String location)
	{
		return new ResponseEntity<List<CateringDto>>(cateringService.getCateringByCateringLocation(location),HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("/catering/findbynameandlocation")
	public ResponseEntity<List<CateringDto>> getCateringByCateringNameAndLocation(@RequestParam String name,@RequestParam String location)
	{
		return new ResponseEntity<List<CateringDto>>(cateringService.getCateringByCateringNameAndLocation(name, location),HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("/catering/all/{field}")
	public ResponseEntity<List<CateringDto>> getCateringWithSort(@PathVariable("field") String columnName)
	{
		return new ResponseEntity<List<CateringDto>>(cateringService.getCateringsWithSort(columnName),HttpStatus.OK);
	}
	
	@GetMapping("/catering/filtercateringwithpagenation")
	public ResponseEntity<List<CateringDto>> getCateringWithPagenation(@RequestParam int pageNumber,@RequestParam int pageSize)
	{
		return new ResponseEntity<List<CateringDto>>(cateringService.getCateringWithPagenation(pageNumber, pageSize),HttpStatus.OK);
	}
	
	@GetMapping("/catering/filtercateringwithpagenationandsort")
	public ResponseEntity<List<CateringDto>> getCateringWithPagenationAndSort(@RequestParam int pageNumber,@RequestParam int pageSize,@RequestParam String columnName)
	{
		return new ResponseEntity<List<CateringDto>>(cateringService.getCateringWithPagenationAndSort(pageNumber, pageSize, columnName),HttpStatusCode.valueOf(200));
	}
}
