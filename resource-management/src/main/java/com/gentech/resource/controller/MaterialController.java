package com.gentech.resource.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.gentech.resource.entity.Material;
import com.gentech.resource.service.MaterialService;

@RestController
@RequestMapping("/v1/api")
@CrossOrigin(origins = "*")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @PostMapping("/material")
    public ResponseEntity<Material> createMaterial(@RequestBody Material material) {
        return new ResponseEntity<>(materialService.addMaterial(material), HttpStatus.CREATED);
    }

    @GetMapping("/material")
    public ResponseEntity<List<Material>> getAllMaterials() {
        return new ResponseEntity<>(materialService.getAllMaterials(), HttpStatus.OK);
    }

    @GetMapping("/material/{id}")
    public ResponseEntity<Material> getSpecificMaterial(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(materialService.getSpecificMaterial(id), HttpStatus.OK);
    }
    
    @DeleteMapping("/material/{id}")
	public ResponseEntity<String> deleteSpecificMaterial(@PathVariable Long id) throws Exception
	{
		materialService.deleteMaterial(id);
		return new ResponseEntity<String>("The given id "+id+" is deleted",HttpStatusCode.valueOf(200));
	}
  
}
