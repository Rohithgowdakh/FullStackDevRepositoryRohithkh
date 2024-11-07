package com.gentech.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gentech.school.dto.SchoolDto;
import com.gentech.school.service.SchoolService;

@RestController
@RequestMapping("/v1/api")
@CrossOrigin(origins = "http://localhost:2004")
public class SchoolController {
	
	@Autowired
	private SchoolService schoolService;
	
	@PostMapping("/school")
	public ResponseEntity<SchoolDto> createNewParentDetails(@RequestBody SchoolDto schoolDto)
	{
		return new ResponseEntity<SchoolDto>(schoolService.createSchool(schoolDto),HttpStatusCode.valueOf(201));
	}
	
	@GetMapping("/school/{id}")
	public ResponseEntity<SchoolDto> getSchoolDetailsById(@PathVariable Long id)
	{
		return new ResponseEntity<SchoolDto>(schoolService.getSchoolDetailsById(id),HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("/school")
	public ResponseEntity<List<SchoolDto>> getAllSchoolDetails()
	{
		return new ResponseEntity<List<SchoolDto>>(schoolService.getAllSchoolDetails(),HttpStatusCode.valueOf(200));
	}
	
	@PutMapping("/school/{id}")
	public ResponseEntity<SchoolDto> updateParentDetails(@PathVariable Long id,@RequestBody SchoolDto schoolDto)
	{
		return new ResponseEntity<SchoolDto>(schoolService.updateSchoolDetails(schoolDto, id),HttpStatusCode.valueOf(200));
	}
	
	@DeleteMapping("/school/{id}")
	public String deleteSpecificParentDetails(@PathVariable Long id)
	{
		schoolService.deleteSchoolDetails(id);
		return "The Given Id "+id+" is deleted";
	}
}
