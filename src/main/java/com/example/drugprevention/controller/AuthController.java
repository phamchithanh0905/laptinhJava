package com.example.drugprevention.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String loginPage(@RequestParam(value = "error", required = false) String error, Model model) {
        if (error != null) {
            model.addAttribute("error", "Sai tên đăng nhập hoặc mật khẩu!");
        }
        return "login";
    }

    @PostMapping("/login")
    public String doLogin(@RequestParam String username, @RequestParam String password, Model model) {
        // Đơn giản: tài khoản admin/admin
        if ("admin".equals(username) && "admin".equals(password)) {
            // Đăng nhập thành công, chuyển đến trang admin
            return "redirect:/admin";
        } else {
            // Đăng nhập thất bại
            model.addAttribute("error", "Sai tên đăng nhập hoặc mật khẩu!");
            return "login";
        }
    }
}