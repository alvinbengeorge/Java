package com.example.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class TodoDatabase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String content;
    public boolean completed;

    public TodoDatabase() {}

    public TodoDatabase(String content, boolean completed) {
        this.content = content;
        this.completed = completed;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setStatus(boolean completed) {
        this.completed = completed;
    }
    
}
