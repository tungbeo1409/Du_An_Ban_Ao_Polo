package com.example.Xuong_duAn_L1.service;

import com.example.Xuong_duAn_L1.entity.Size;
import com.example.Xuong_duAn_L1.repository.SizeRepo;
import com.example.Xuong_duAn_L1.service.impl.ISizeService;
import com.example.Xuong_duAn_L1.util.CodeGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SizeService implements ISizeService {

    @Autowired
    private SizeRepo sizeRepo;

    @Override
    public List<Size> getAllSizes() {
        return sizeRepo.findAll();
    }

    @Override
    public Page<Size> getAllSizePage(Pageable pageable) {
        return sizeRepo.findAll(pageable);
    }

    @Override
    public Size addSize(Size size) throws Exception {
        if (sizeRepo.existsByName(size.getName())) {
            throw new Exception("Size tồi tại");
        }
        String code = CodeGenerator.generateRandomCode(3);
        size.setCode("S_" + code);
        size.setUploadDate(LocalDate.now());
        return sizeRepo.save(size);
    }

    @Override
    public void updateSize(Size size) {

    }

    @Override
    public void deleteSize(Integer id) {
        Size size = sizeRepo.findById(id).get();
        sizeRepo.delete(size);
    }
}
