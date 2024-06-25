package com.example.Xuong_duAn_L1.repository;

import com.example.Xuong_duAn_L1.entity.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDetailRepo extends JpaRepository<ProductDetail, Integer> {

    List<ProductDetail> findByProductIdProduct(Integer idProduct);
}
