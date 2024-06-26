package com.example.Xuong_duAn_L1.service;

import com.example.Xuong_duAn_L1.entity.Material;
import com.example.Xuong_duAn_L1.entity.Style;
import com.example.Xuong_duAn_L1.repository.MaterialRepo;
import com.example.Xuong_duAn_L1.repository.StyleRepo;
import com.example.Xuong_duAn_L1.service.impl.IMaterialService;
import com.example.Xuong_duAn_L1.service.impl.IStyleService;
import com.example.Xuong_duAn_L1.util.CodeGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StyleService implements IStyleService {
    @Autowired
    private StyleRepo styleRepo;

    @Override
    public List<Style> getAllStyles() {
        return styleRepo.findAll();
    }

    @Override
    public Page<Style> getAllStylePage(Pageable pageable) {
        return styleRepo.findAll(pageable);
    }

    @Override
    public Style addStyles(Style style) {
        String code = CodeGenerator.generateRandomCode(3);
        style.setCode("ST_" + code);
        style.setUploadDate(LocalDate.now());
        return styleRepo.save(style);
    }

    @Override
    public void updateStyles(Style style) {

    }

    @Override
    public void deleteStyles(Integer id) {
        Style style = styleRepo.findById(id).get();
        styleRepo.delete(style);
    }
}
