package com.gentech.catering.service;

import java.util.List;

import com.gentech.catering.dto.CateringDto;

public interface CateringService {
	
	CateringDto createCateringOrder(CateringDto cateringDto);
	
	CateringDto getSpecificCatering(Long id);
	
	List<CateringDto> getAllCateringOrder();
	
	CateringDto updateCateringOrder2(CateringDto cateringDto,Long id);
	
	void deleteCateringOrder(Long id);
	
	List<CateringDto> getCateringByCateringName(String name);
	
	List<CateringDto> getCateringByCateringLocation(String name);
	
	List<CateringDto> getCateringByCateringNameAndLocation(String name,String loc);
	
	List<CateringDto> getCateringsWithSort(String columnName);
	
	List<CateringDto> getCateringWithPagenation(int pageNumber,int pageSize);
	
	List<CateringDto> getCateringWithPagenationAndSort(int pageNumber,int pageSize,String columnName);
}
