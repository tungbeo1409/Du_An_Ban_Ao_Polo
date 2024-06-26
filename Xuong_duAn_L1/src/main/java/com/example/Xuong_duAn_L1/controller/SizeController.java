package com.example.Xuong_duAn_L1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Size")
public class SizeController {

    @GetMapping("")
    public String index() {
        return "Home";
    }
}
