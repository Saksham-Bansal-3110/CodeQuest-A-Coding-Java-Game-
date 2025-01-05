package com.example.demo.repository;

import com.example.demo.model.CodeSnippet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CodeSnippetRepository extends JpaRepository<CodeSnippet, Long> {

    // Find all code snippets for a specific player
    List<CodeSnippet> findByPlayerId(Long playerId);

    // Find all code snippets for a specific level
    List<CodeSnippet> findByLevelId(Long levelId);
}
