package com.example.Xuong_duAn_L1.service.impl;

import com.example.Xuong_duAn_L1.entity.Brand;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBrandService {

    List<Brand> getAllBrands();

    Page<Brand> getAllBrandPage(Pageable pageable);

    Brand addBrand(Brand brand);

    void updateBrand(Brand brand);

    void deleteBrand(Integer id);
}
