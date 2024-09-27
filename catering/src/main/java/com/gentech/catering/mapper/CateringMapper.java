package com.gentech.catering.mapper;

import com.gentech.catering.dto.CateringDto;
import com.gentech.catering.entity.Catering;

public class CateringMapper {
	
	public static Catering mappedTocatering(CateringDto cateringDto)
	{
		Catering catering=new Catering(
				cateringDto.getId(),
				cateringDto.getName(),
				cateringDto.getLocation(),
				cateringDto.getItems(),
				cateringDto.getAmount(),
				cateringDto.getCreatedAt(),
				cateringDto.getUpdatedAt());
		return catering;
	}
	public static CateringDto mappedToCateringDto(Catering catering)
	{
		CateringDto cateringDto=new CateringDto(
					catering.getId(),
					catering.getName(),
					catering.getLocation(),
					catering.getItems(),
					catering.getAmount(),
					catering.getCreatedAt(),
					catering.getUpdatedAt());
		return cateringDto;
	}
}
