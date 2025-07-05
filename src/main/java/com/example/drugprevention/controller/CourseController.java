package com.example.drugprevention.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {
    @GetMapping("/courses")
    public String courseList() {
        return "courses"; // Tạo file courses.html trong templates để hiển thị danh sách khóa học
    }
}