package com.example.drugprevention.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;
import java.util.List;

@Controller
public class NewsController {

    @GetMapping("/news")
    public String newsList(Model model) {
        // Demo dữ liệu mẫu
        List<News> newsList = Arrays.asList(
            new News(1L, "Chương trình tuyên truyền mới", "Nội dung tóm tắt chương trình tuyên truyền..."),
            new News(2L, "Cảnh báo chất gây nghiện mới", "Tóm tắt về chất gây nghiện mới xuất hiện...")
        );
        model.addAttribute("newsList", newsList);
        return "news";
    }

    @GetMapping("/news/{id}")
    public String newsDetail(@PathVariable Long id, Model model) {
        // Demo dữ liệu mẫu
        News news = new News(id, "Tiêu đề bài viết", "Nội dung chi tiết bài viết...");
        model.addAttribute("news", news);
        return "news-detail";
    }

    // Lớp News mẫu
    public static class News {
        public Long id;
        public String title;
        public String summary;
        public News(Long id, String title, String summary) {
            this.id = id;
            this.title = title;
            this.summary = summary;
        }
        // getter/setter nếu cần
    }
}