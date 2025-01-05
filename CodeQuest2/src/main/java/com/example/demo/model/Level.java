package com.example.demo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Level {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    // One-to-many relationship with Player
    @OneToMany(mappedBy = "lastLevel")
    private List<Player> players;

    public Level() {}

    public Level(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Getters and Setters
}
