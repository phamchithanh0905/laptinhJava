package com.example.drugprevention.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class SupportController {

    @GetMapping("/support")
    public String supportPage(Model model) {
        List<String> resources = Arrays.asList(
            "Tư vấn tâm lý miễn phí",
            "Đường dây nóng hỗ trợ",
            "Tài liệu phòng chống ma túy"
        );
        model.addAttribute("resources", resources);
        return "support";
    }

    @PostMapping("/support/contact")
    public String contact(
            @RequestParam String name,
            @RequestParam String message,
            Model model) {
        model.addAttribute("message", "Cảm ơn " + name + " đã liên hệ!");
        model.addAttribute("resources", Arrays.asList(
            "Tư vấn tâm lý miễn phí",
            "Đường dây nóng hỗ trợ",
            "Tài liệu phòng chống ma túy"
        ));
        return "support";
    }
}