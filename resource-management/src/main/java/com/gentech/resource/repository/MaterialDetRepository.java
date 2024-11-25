package com.gentech.resource.repository;

import com.gentech.resource.entity.MaterialDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialDetRepository extends JpaRepository<MaterialDetails, Long> {}

