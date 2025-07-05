package com.example.drugprevention.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppointmentController {
    @GetMapping("/appointments")
    public String appointmentList() {
        return "appointments"; // Tạo file appointments.html trong templates để hiển thị danh sách lịch hẹn
    }
}