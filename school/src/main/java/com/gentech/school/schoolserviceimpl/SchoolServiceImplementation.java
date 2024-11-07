package com.gentech.school.schoolserviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gentech.school.dto.SchoolDto;
import com.gentech.school.entity.School;
import com.gentech.school.mapper.SchoolMapper;
import com.gentech.school.repository.SchoolRepository;
import com.gentech.school.service.SchoolService;

@Service
public class SchoolServiceImplementation implements SchoolService {
	
	@Autowired
	private SchoolRepository schoolRepository;
	@Override
	public SchoolDto createSchool(SchoolDto schoolDto) {
		
		School school=SchoolMapper.mappedToSchool(schoolDto);
		School savedSchool=schoolRepository.save(school);
		return SchoolMapper.mappedToSchoolDto(savedSchool);
	}
	@Override
	public SchoolDto getSchoolDetailsById(Long id) {
		
		School school=schoolRepository.findById(id).orElseThrow(()->new RuntimeException("Given Id Not Found") );
		return SchoolMapper.mappedToSchoolDto(school);
	}
	@Override
	public List<SchoolDto> getAllSchoolDetails() {
		
		return schoolRepository.findAll()
				.stream()
				.map((school)->SchoolMapper.mappedToSchoolDto(school))
				.collect(Collectors.toList());
	}
	@Override
	public SchoolDto updateSchoolDetails(SchoolDto schoolDto, Long id) {
		
		School school=schoolRepository.findById(id).orElseThrow(()->new RuntimeException("The given id is not available"));
		school.setParentFirstName(schoolDto.getParentFirstName());
		school.setParentLastName(schoolDto.getParentLastName());
		school.setParentEmail(schoolDto.getParentEmail());
		school.setParentLocation(schoolDto.getParentLocation());
		
		School savedSchool=schoolRepository.save(school);
		return SchoolMapper.mappedToSchoolDto(savedSchool);
		
	}
	@Override
	public void deleteSchoolDetails(Long id) {
		schoolRepository.deleteById(id);
		
	}

}
