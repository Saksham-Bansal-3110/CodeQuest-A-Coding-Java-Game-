package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String lastSubmittedCode;

    @ManyToOne
    @JoinColumn(name = "level_id")
    private Level lastLevel;

    public Player() {}

    public Player(String name) {
        this.name = name;
    }

    // Getters and Setters
    public String getLastSubmittedCode() {
        return lastSubmittedCode;
    }

    public void setLastSubmittedCode(String lastSubmittedCode) {
        this.lastSubmittedCode = lastSubmittedCode;
    }

    public Level getLastLevel() {
        return lastLevel;
    }

    public void setLastLevel(Level lastLevel) {
        this.lastLevel = lastLevel;
    }

    // Other fields and methods remain unchanged
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

   

