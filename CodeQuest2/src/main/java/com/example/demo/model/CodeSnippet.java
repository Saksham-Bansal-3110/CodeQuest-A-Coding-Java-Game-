package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class CodeSnippet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;

    @ManyToOne
    @JoinColumn(name = "level_id")
    private Level level;

    public CodeSnippet() {}

    public CodeSnippet(String code, Player player, Level level) {
        this.code = code;
        this.player = player;
        this.level = level;
    }

    // Getters and Setters
}
