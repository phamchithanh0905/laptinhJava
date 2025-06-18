package com.example.druguseprevention.model;

import java.time.LocalDateTime;

public class Report {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime generatedDate;

    public Report() {
    }

    public Report(Long id, String title, String content, LocalDateTime generatedDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.generatedDate = generatedDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getGeneratedDate() {
        return generatedDate;
    }

    public void setGeneratedDate(LocalDateTime generatedDate) {
        this.generatedDate = generatedDate;
    }
}