package com.example.Xuong_duAn_L1.repository;

import com.example.Xuong_duAn_L1.entity.Style;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StyleRepo extends JpaRepository<Style, Integer> {
}
