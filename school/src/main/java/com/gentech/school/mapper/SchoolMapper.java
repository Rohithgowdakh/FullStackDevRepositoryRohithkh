package com.gentech.school.mapper;

import com.gentech.school.dto.SchoolDto;
import com.gentech.school.entity.School;

public class SchoolMapper {

	public static School mappedToSchool(SchoolDto schoolDto)
	{
		School school=new School(
				schoolDto.getSid(),
				schoolDto.getParentFirstName(),
				schoolDto.getParentLastName(),
				schoolDto.getParentNumber(),
				schoolDto.getParentEmail(),
				schoolDto.getParentLocation(),
				schoolDto.getCreatedAt(),
				schoolDto.getUpdatedAt());
		return school;
	}
	public static SchoolDto mappedToSchoolDto(School school)
	{
		SchoolDto schoolDto=new SchoolDto(
				school.getSid(),
				school.getParentFirstName(),
				school.getParentLastName(),
				school.getParentNumber(),
				school.getParentEmail(),
				school.getParentLocation(),
				school.getCreatedAt(),
				school.getUpdatedAt());
		return schoolDto;
	}
			
}

