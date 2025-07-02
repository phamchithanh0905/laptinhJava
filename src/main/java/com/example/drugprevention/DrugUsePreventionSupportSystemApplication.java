package com.example.drugprevention;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.awt.Desktop;
import java.net.URI;

@SpringBootApplication
public class DrugUsePreventionSupportSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(DrugUsePreventionSupportSystemApplication.class, args);
        // Tự động mở trình duyệt khi chạy ứng dụng
        try {
            Desktop.getDesktop().browse(new URI("http://localhost:8080/"));
        } catch (Exception e) {
            System.out.println("Không thể tự động mở trình duyệt: " + e.getMessage());
        }
    }
}