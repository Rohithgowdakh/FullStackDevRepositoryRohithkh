package com.gentech.resource.service;

import com.gentech.resource.entity.MaterialDetails;

import java.util.List;

public interface MaterialDetailsService {

    List<MaterialDetails> getAllMaterialDetails();

    MaterialDetails getSpecificMaterialDetail(Long id) throws Exception;

    MaterialDetails addMaterialDetail(MaterialDetails materialDetail);
    
    void deleteMaterialDetails(Long id) throws Exception;

   
}

