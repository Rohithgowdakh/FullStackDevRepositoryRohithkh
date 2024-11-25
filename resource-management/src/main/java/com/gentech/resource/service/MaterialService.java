package com.gentech.resource.service;

import com.gentech.resource.entity.Material;

import java.util.List;

public interface MaterialService {

    List<Material> getAllMaterials();

    Material getSpecificMaterial(Long id) throws Exception;

    Material addMaterial(Material material);
    
    void deleteMaterial(Long id) throws Exception;
}

