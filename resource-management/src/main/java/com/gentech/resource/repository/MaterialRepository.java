package com.gentech.resource.repository;

import com.gentech.resource.entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<Material, Long> {
	
}
