package com.example.Xuong_duAn_L1.service.impl;

import com.example.Xuong_duAn_L1.entity.Color;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IColorService {

    List<Color> getAllColors();

    Page<Color> getAllColorPage(Pageable pageable);

    Color addColor(Color color);

    void updateColor(Color color);

    void deleteColor(Integer id);
}
