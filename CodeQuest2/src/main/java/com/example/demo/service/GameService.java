package com.example.demo.service;

import com.example.demo.model.Level;
import com.example.demo.repository.LevelRepository;
import com.example.demo.repository.PlayerRepository;
import com.example.demo.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private LevelRepository levelRepository;

    @Autowired
    private PlayerRepository playerRepository;

    // Fetch all levels
    public List<Level> getAllLevels() {
        return levelRepository.findAll();
    }

    // Fetch a specific level by ID
    public Level getLevelById(Long id) {
        return levelRepository.findById(id).orElse(null);
    }

    // Create a new player (or fetch existing)
    public Player createPlayer(String playerName) {
        Player player = new Player(playerName);
        return playerRepository.save(player);
    }

    // Save the code submitted by the player for a specific level
    public void savePlayerCode(Player player, Long levelId, String code) {
        Level level = getLevelById(levelId);
        if (level != null) {
            // Example: Saving player's code (implementation depends on your design)
            player.setLastSubmittedCode(code);
            player.setLastLevel(level);
            playerRepository.save(player);
        }
    }
}
