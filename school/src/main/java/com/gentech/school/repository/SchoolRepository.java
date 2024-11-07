package com.gentech.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gentech.school.entity.School;

public interface SchoolRepository extends JpaRepository<School, Long> {
	

}
