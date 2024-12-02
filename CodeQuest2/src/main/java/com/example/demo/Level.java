package com.example.demo;

import jakarta.persistence.*;

@Entity
public class Level {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String story;
    private String question;
    private String solution;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getStory() { return story; }
    public void setStory(String story) { this.story = story; }
    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }
    public String getSolution() { return solution; }
    public void setSolution(String solution) { this.solution = solution; }
}

