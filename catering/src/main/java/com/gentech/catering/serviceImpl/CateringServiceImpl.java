package com.gentech.catering.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.gentech.catering.dto.CateringDto;
import com.gentech.catering.entity.Catering;
import com.gentech.catering.exception.ResourceNotFoundException;
import com.gentech.catering.mapper.CateringMapper;
import com.gentech.catering.repository.CateringRepository;
import com.gentech.catering.service.CateringService;

@Service
public class CateringServiceImpl implements CateringService{
	
	@Autowired
	private CateringRepository cateringRepository;
	
	@Override
	public CateringDto createCateringOrder(CateringDto cateringDto) {
		
		Catering catering= CateringMapper.mappedTocatering(cateringDto);
		Catering savedCatering=cateringRepository.save(catering);
		return CateringMapper.mappedToCateringDto(savedCatering);
	}

	@Override
	public CateringDto getSpecificCatering(Long id) {
		Catering catering=cateringRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("catering", "customer", id));
		return CateringMapper.mappedToCateringDto(catering);
	}

	@Override
	public List<CateringDto> getAllCateringOrder() {
		
		return cateringRepository.findAll()
				.stream()
				.map((cater) -> CateringMapper.mappedToCateringDto(cater))
				.collect(Collectors.toList());
	}

	@Override
	public CateringDto updateCateringOrder2(CateringDto cateringDto, Long id) {
		Catering existingCatering=cateringRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("catering", "customer", id));
//		existingCatering.setId(id);
		existingCatering.setName(cateringDto.getName());
		existingCatering.setLocation(cateringDto.getLocation());
		existingCatering.setAmount(cateringDto.getAmount());
		existingCatering.setItems(cateringDto.getItems());
		Catering savedCatering=cateringRepository.save(existingCatering);
		return CateringMapper.mappedToCateringDto(savedCatering);
	}

	@Override
	public void deleteCateringOrder(Long id) {
		cateringRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("catering", "customer", id));
		cateringRepository.deleteById(id);
	}

	@Override
	public List<CateringDto> getCateringByCateringName(String name) {
		
		return cateringRepository.findByName(name)
				.stream()
				.map((catering) -> CateringMapper.mappedToCateringDto(catering))
				.collect(Collectors.toList());
	}

	@Override
	public List<CateringDto> getCateringByCateringLocation(String loc) {
		
		return cateringRepository.findByLocation(loc)
				.stream()
				.map((catering) -> CateringMapper.mappedToCateringDto(catering))
				.collect(Collectors.toList());
	}

	@Override
	public List<CateringDto> getCateringByCateringNameAndLocation(String name, String loc) {
		
		return cateringRepository.findByNameAndLocation(name, loc)
				.stream()
				.map((catering) -> CateringMapper.mappedToCateringDto(catering))
				.collect(Collectors.toList());
	}

	@Override
	public List<CateringDto> getCateringsWithSort(String columnName) {
		
		return cateringRepository.findAll(Sort.by(Sort.Direction.ASC,columnName))
				.stream()
				.map((catering) -> CateringMapper.mappedToCateringDto(catering))
				.collect(Collectors.toList());
	}

	@Override
	public List<CateringDto> getCateringWithPagenation(int pageNumber, int pageSize) {
		
		return cateringRepository.findAll(PageRequest.of(pageNumber, pageSize))
				.stream()
				.map((catering) -> CateringMapper.mappedToCateringDto(catering))
				.collect(Collectors.toList());
	}

	@Override
	public List<CateringDto> getCateringWithPagenationAndSort(int pageNumber, int pageSize, String columnName) {
		
		return cateringRepository.findAll(PageRequest.of(pageNumber, pageSize).withSort(Sort.by(Sort.Direction.ASC)))
				.stream()
				.map((catering) -> CateringMapper.mappedToCateringDto(catering))
				.collect(Collectors.toList());
	}
	
}
