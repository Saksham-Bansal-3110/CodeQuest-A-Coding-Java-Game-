package com.example.demo.controller;

import com.example.demo.model.Level;
import com.example.demo.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LevelController {

    @Autowired
    private GameService gameService;

    // Get all levels
    @GetMapping("/level")
    public List<Level> getLevels() {
        return gameService.getAllLevels();
    }

    // Get level by ID
    @GetMapping("/levels/{id}")
    public Level getLevelById(@PathVariable Long id) {
        return gameService.getLevelById(id);
    }
}
