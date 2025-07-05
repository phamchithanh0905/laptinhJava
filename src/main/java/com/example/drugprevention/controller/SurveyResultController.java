package com.example.drugprevention.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SurveyResultController {
    @GetMapping("/survey-results")
    public String surveyResultList() {
        return "survey-results"; // Tạo file survey-results.html trong templates để hiển thị kết quả khảo sát
    }
}