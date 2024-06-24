package com.example.Xuong_duAn_L1.service;

import com.example.Xuong_duAn_L1.entity.Product;
import com.example.Xuong_duAn_L1.entity.ProductDetail;
import com.example.Xuong_duAn_L1.repository.ProductDetailRepo;
import com.example.Xuong_duAn_L1.repository.ProductRepo;
import com.example.Xuong_duAn_L1.service.impl.IProductDetailService;
import com.example.Xuong_duAn_L1.service.impl.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDetailService implements IProductDetailService {

    @Autowired
    private ProductDetailRepo productDetailRepo;

    @Override
    public List<ProductDetail> getAll() {
        return productDetailRepo.findAll();
    }
}
