package com.example.Xuong_duAn_L1.repository;

import com.example.Xuong_duAn_L1.entity.Brand;
import com.example.Xuong_duAn_L1.entity.InitializationFlag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InitializationFlagRepo extends JpaRepository<InitializationFlag, Long> {
}
