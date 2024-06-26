package com.example.Xuong_duAn_L1.repository;

import com.example.Xuong_duAn_L1.entity.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDetailRepo extends JpaRepository<ProductDetail, Integer> {

    List<ProductDetail> findByIdProduct(Integer idProduct);

    @Query("SELECT pd FROM ProductDetail pd JOIN FETCH pd.product JOIN FETCH pd.size JOIN FETCH pd.color WHERE pd.product.idProduct = :productId")
    List<ProductDetail> findByProductIdWithDetails(@Param("productId") Integer productId);
}
