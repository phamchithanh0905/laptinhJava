package com.example.druguseprevention.model;

public class EducationProgram {
    private Long id;
    private String title;
    private String content;
    private String feedback;

    public EducationProgram() {
    }

    public EducationProgram(Long id, String title, String content, String feedback) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.feedback = feedback;
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

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}