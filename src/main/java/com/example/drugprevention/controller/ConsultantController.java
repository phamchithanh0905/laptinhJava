package com.example.drugprevention.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConsultantController {
    @GetMapping("/consultants")
    public String consultantList() {
        return "consultants"; // Tạo file consultants.html trong templates để hiển thị danh sách chuyên gia
    }
}