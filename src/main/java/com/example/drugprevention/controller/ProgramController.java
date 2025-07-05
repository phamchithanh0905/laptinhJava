package com.example.drugprevention.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProgramController {
    @GetMapping("/programs")
    public String programList() {
        return "programs"; // Tạo file programs.html trong templates để hiển thị danh sách chương trình
    }
}