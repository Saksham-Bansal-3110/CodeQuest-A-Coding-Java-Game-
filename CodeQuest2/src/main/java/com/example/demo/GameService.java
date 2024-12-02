package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private LevelRepository levelRepository;

    public boolean evaluateCode(Long levelId, String submittedCode) {
        Level level = levelRepository.findById(levelId).orElseThrow();
        return submittedCode.equals(level.getSolution());
    }

    public Level getLevelById(Long id) {
        return levelRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Level with ID " + id + " not found"));
    }
}

