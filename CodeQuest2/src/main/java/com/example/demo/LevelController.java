package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/levels")
public class LevelController {
    @Autowired
    private GameService gameService;

    @GetMapping("/{id}")
    public String showLevel(@PathVariable Long id, Model model) {
        Level level = gameService.getLevelById(id);
        model.addAttribute("level", level);
        return "level";
    }

    @PostMapping("/{id}/submit")
    public String submitCode(@PathVariable Long id, @RequestParam String code, Model model) {
        boolean isCorrect = gameService.evaluateCode(id, code);
        return isCorrect ? "success" : "failure";
    }
}
