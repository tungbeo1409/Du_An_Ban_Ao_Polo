package com.example.Xuong_duAn_L1.service;

import com.example.Xuong_duAn_L1.entity.Brand;
import com.example.Xuong_duAn_L1.repository.BrandRepo;
import com.example.Xuong_duAn_L1.service.impl.IBrandService;
import com.example.Xuong_duAn_L1.util.CodeGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BrandService implements IBrandService {

    @Autowired
    private BrandRepo brandRepo;

    @Override
    public List<Brand> getAllBrands() {
        return brandRepo.findAll();
    }

    @Override
    public Page<Brand> getAllBrandPage(Pageable pageable) {
        return brandRepo.findAll(pageable);
    }

    @Override
    public Brand addBrand(Brand brand) {
        String code = CodeGenerator.generateRandomCode(3);
        brand.setCode("B_" + code);
        brand.setUploadDate(LocalDate.now());
        return brandRepo.save(brand);
    }

    @Override
    public void updateBrand(Brand brand) {

    }

    @Override
    public void deleteBrand(Integer id) {
        Brand brand = brandRepo.findById(id).get();
        brandRepo.delete(brand);
    }
}
