package com.example.Xuong_duAn_L1.service;

import com.example.Xuong_duAn_L1.entity.Color;
import com.example.Xuong_duAn_L1.repository.ColorRepo;
import com.example.Xuong_duAn_L1.service.impl.IColorService;
import com.example.Xuong_duAn_L1.util.CodeGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ColorService implements IColorService {

    @Autowired
    private ColorRepo colorRepo;

    @Override
    public List<Color> getAllColors() {
        return colorRepo.findAll();
    }

    @Override
    public Page<Color> getAllColorPage(Pageable pageable) {
        return colorRepo.findAll(pageable);
    }

    @Override
    public Color addColor(Color color) {
        String code = CodeGenerator.generateRandomCode(3);
        color.setCode("C_"+ code);
        color.setUploadDate(LocalDate.now());
        return colorRepo.save(color);
    }

    @Override
    public void updateColor(Color color) {

    }

    @Override
    public void deleteColor(Integer id) {
        Color color = colorRepo.findById(id).get();
        colorRepo.delete(color);
    }
}
