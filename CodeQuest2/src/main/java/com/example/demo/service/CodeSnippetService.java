package com.example.demo.service;

import com.example.demo.model.CodeSnippet;
import com.example.demo.repository.CodeSnippetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CodeSnippetService {

    @Autowired
    private CodeSnippetRepository codeSnippetRepository;

    // Save a code snippet
    public CodeSnippet saveCodeSnippet(CodeSnippet codeSnippet) {
        return codeSnippetRepository.save(codeSnippet);
    }

    // Get all code snippets
    public List<CodeSnippet> getAllCodeSnippets() {
        return codeSnippetRepository.findAll();
    }

    // Get a code snippet by ID
    public Optional<CodeSnippet> getCodeSnippetById(Long id) {
        return codeSnippetRepository.findById(id);
    }

    // Delete a code snippet
    public void deleteCodeSnippet(Long id) {
        codeSnippetRepository.deleteById(id);
    }
}
