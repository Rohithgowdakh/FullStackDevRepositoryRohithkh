package com.gentech.catering.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gentech.catering.entity.Catering;

public interface CateringRepository extends JpaRepository<Catering, Long> {
	
	List<Catering> findByName(String name);
	
	List<Catering> findByLocation(String loc);
	
	List<Catering> findByNameAndLocation(String name,String loc);
}
