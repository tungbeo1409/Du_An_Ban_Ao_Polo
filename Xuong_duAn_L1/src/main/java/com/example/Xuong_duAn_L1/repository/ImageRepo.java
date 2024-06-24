package com.example.Xuong_duAn_L1.repository;

import com.example.Xuong_duAn_L1.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepo extends JpaRepository<Image, Integer> {
}
