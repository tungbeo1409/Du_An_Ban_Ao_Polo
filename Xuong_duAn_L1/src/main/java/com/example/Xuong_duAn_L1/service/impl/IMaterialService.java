package com.example.Xuong_duAn_L1.service.impl;

import com.example.Xuong_duAn_L1.entity.Material;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IMaterialService {

    List<Material> getAllMaterial();

    Page<Material> getAllMaterialPaged(Pageable pageable);

    Material addMaterial(Material material);

    Material updateMaterial(Material material);

    void deleteMaterial(Material material);
}
