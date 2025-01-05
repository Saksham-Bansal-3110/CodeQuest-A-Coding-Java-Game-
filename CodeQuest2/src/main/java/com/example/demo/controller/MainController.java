package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    // Serve homepage
    @GetMapping("/")
    public String homepage() {
        return "index";  // This should be your home page view
    }

    // Serve level selection page
    @GetMapping("/levels.html")
    public String levelSelection() {
        return "levels";  // View for level selection
    }

    // Serve code editor page
    @GetMapping("/editor.html")
    public String codeEditor() {
        return "editor";  // View for the code editor
    }
    @GetMapping("/menu.html")
    public String MainMenu() {
        return "menu";  // View for the code editor
    }
    @GetMapping("/story.html")
    public String Story() {
        return "story";  // View for the code editor
    }
}
