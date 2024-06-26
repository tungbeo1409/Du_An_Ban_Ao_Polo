package com.example.Xuong_duAn_L1.service.impl;

import com.example.Xuong_duAn_L1.entity.Brand;
import com.example.Xuong_duAn_L1.entity.Size;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ISizeService {

    List<Size> getAllSizes();

    Page<Size> getAllSizePage(Pageable pageable);

    Size addSize(Size size) throws Exception;

    void updateSize(Size size);

    void deleteSize(Integer id);
}
