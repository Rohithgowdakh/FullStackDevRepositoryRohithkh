package com.gentech.school.service;

import java.util.List;

import com.gentech.school.dto.SchoolDto;
public interface SchoolService {

	SchoolDto createSchool(SchoolDto schoolDto);
	
	SchoolDto getSchoolDetailsById(Long id);
	
	List<SchoolDto>  getAllSchoolDetails();
	
	SchoolDto updateSchoolDetails(SchoolDto schoolDto,Long id);
	
	void deleteSchoolDetails(Long id);
}
