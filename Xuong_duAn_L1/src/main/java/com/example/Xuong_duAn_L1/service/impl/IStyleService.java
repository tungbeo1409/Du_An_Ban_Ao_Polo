package com.example.Xuong_duAn_L1.service.impl;

import com.example.Xuong_duAn_L1.entity.Material;
import com.example.Xuong_duAn_L1.entity.Style;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IStyleService {

    List<Style> getAllStyles();

    Page<Style> getAllStylePage(Pageable pageable);

    Style addStyles(Style style);

    void updateStyles(Style style);

    void deleteStyles(Integer id);
}
