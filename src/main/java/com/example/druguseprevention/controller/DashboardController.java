package com.example.druguseprevention.controller;

import com.example.druguseprevention.service.DashboardService;
import com.example.druguseprevention.model.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/reports")
    public List<Report> getReports() {
        return dashboardService.getAllReports();
    }

    @GetMapping("/summary")
    public String getDashboardSummary() {
        return dashboardService.getDashboardSummary();
    }
}