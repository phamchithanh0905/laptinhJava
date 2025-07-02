package com.example.drugprevention;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Chào mừng bạn đến với hệ thống hỗ trợ phòng chống ma túy!");
        return "index";
    }
}