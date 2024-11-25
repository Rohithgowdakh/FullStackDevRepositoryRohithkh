package com.gentech.resource.serviceImpl;

import com.gentech.resource.entity.MaterialDetails;
import com.gentech.resource.repository.MaterialDetRepository;
import com.gentech.resource.service.MaterialDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialDetailsServiceImpl implements MaterialDetailsService {

    private final MaterialDetRepository materialDetRepository;

    public MaterialDetailsServiceImpl(MaterialDetRepository materialDetRepository) {
        this.materialDetRepository = materialDetRepository;
    }

    @Override
    public List<MaterialDetails> getAllMaterialDetails() {
        return materialDetRepository.findAll();
    }

    @Override
    public MaterialDetails getSpecificMaterialDetail(Long id) throws Exception {
        return materialDetRepository.findById(id)
                .orElseThrow(() -> new Exception("Material Detail not found with id: " + id));
    }

    @Override
    public MaterialDetails addMaterialDetail(MaterialDetails materialDetail) {
        return materialDetRepository.save(materialDetail);
    }

	@Override
	public void deleteMaterialDetails(Long id) throws Exception {
		materialDetRepository.findById(id).orElseThrow(() -> new Exception("Material Detail not found with id: " + id));;
		materialDetRepository.deleteById(id);
		
	}


}
