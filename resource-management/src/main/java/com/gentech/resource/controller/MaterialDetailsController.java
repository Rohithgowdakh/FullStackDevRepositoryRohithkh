package com.gentech.resource.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.gentech.resource.entity.MaterialDetails;
import com.gentech.resource.service.MaterialDetailsService;

@RestController
@RequestMapping("/v1/api")
@CrossOrigin(origins = "*")
public class MaterialDetailsController {

    @Autowired
    private MaterialDetailsService materialDetailsService;

    @PostMapping("/material-details")
    public ResponseEntity<MaterialDetails> createMaterialDetail(@RequestBody MaterialDetails materialDetails) {
        return new ResponseEntity<>(materialDetailsService.addMaterialDetail(materialDetails), HttpStatus.CREATED);
    }

    @GetMapping("/material-details")
    public ResponseEntity<List<MaterialDetails>> getAllMaterialDetails() {
        return new ResponseEntity<>(materialDetailsService.getAllMaterialDetails(), HttpStatus.OK);
    }

    @GetMapping("/material-details/{id}")
    public ResponseEntity<MaterialDetails> getSpecificMaterialDetail(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(materialDetailsService.getSpecificMaterialDetail(id), HttpStatus.OK);
    }
    
    @DeleteMapping("/material-details/{id}")
	public ResponseEntity<String> deleteSpecificMaterialDetails(@PathVariable Long id) throws Exception
	{
		materialDetailsService.deleteMaterialDetails(id);
		return new ResponseEntity<String>("The given id "+id+" is deleted",HttpStatusCode.valueOf(200));
	}

    
}
