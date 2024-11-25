package com.gentech.resource.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "material_id")
    private Long id;

    @Column(name = "material_name", nullable = false, length = 100)
    private String name;

    @Column(name = "material_type", length = 50)
    private String materialType;
   
	
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "material_det_id",referencedColumnName = "material_id")
    private List<MaterialDetails> details=new ArrayList<>();
}

