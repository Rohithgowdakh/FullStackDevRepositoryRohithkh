package com.gentech.resource.serviceImpl;

import com.gentech.resource.entity.Material;
import com.gentech.resource.repository.MaterialRepository;
import com.gentech.resource.service.MaterialService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {

    private final MaterialRepository materialRepository;

    public MaterialServiceImpl(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    @Override
    public List<Material> getAllMaterials() {
        return materialRepository.findAll();
    }

    @Override
    public Material getSpecificMaterial(Long id) throws Exception {
        return materialRepository.findById(id)
                .orElseThrow(() -> new Exception("Material not found with id: " + id));
    }

    @Override
    public Material addMaterial(Material material) {
        return materialRepository.save(material);
    }

	@Override
	public void deleteMaterial(Long id) throws Exception {
		materialRepository.findById(id).orElseThrow(() -> new Exception("Material Detail not found with id: " + id));;
		materialRepository.deleteById(id);
		
	}

   
}

