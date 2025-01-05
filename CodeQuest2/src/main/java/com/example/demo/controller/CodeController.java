package com.example.demo.controller;

import com.example.demo.model.CodeSnippet;
import com.example.demo.model.Player;
import com.example.demo.model.Level;
import com.example.demo.service.GameService;
import com.example.demo.repository.CodeSnippetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/code")
public class CodeController {

    @Autowired
    private CodeSnippetRepository codeSnippetRepository;

    @Autowired
    private GameService gameService;

    // Submit a new code snippet
    @PostMapping
    public CodeSnippet submitCode(@RequestParam Long playerId, @RequestParam Long levelId, @RequestParam String code) {
        Player player = gameService.createPlayer("Player_" + playerId); // Placeholder to create player, can be adjusted
        Level level = gameService.getLevelById(levelId);

        if (level != null) {
            CodeSnippet codeSnippet = new CodeSnippet(code, player, level);
            return codeSnippetRepository.save(codeSnippet);
        }
        return null;
    }

    // Get all code snippets for a specific player
    @GetMapping("/player/{playerId}")
    public List<CodeSnippet> getPlayerCodeSnippets(@PathVariable Long playerId) {
        return codeSnippetRepository.findByPlayerId(playerId);
    }

    // Get all code snippets for a specific level
    @GetMapping("/level/{levelId}")
    public List<CodeSnippet> getLevelCodeSnippets(@PathVariable Long levelId) {
        return codeSnippetRepository.findByLevelId(levelId);
    }
}
