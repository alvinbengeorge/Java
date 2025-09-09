package com.example.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.HashMap;
import java.util.List;

@RestController
public class TodoRoutes {

    @Autowired
    private TodoRepository repository;

    @GetMapping("/")
    public HashMap<String, String> root() {
        HashMap<String, String> var = new HashMap<>();
        var.put("API", "Todo App");
        return var;
    }

    @PostMapping("/todo")
    public TodoDatabase addToList(@RequestBody TodoDatabase todo) {
        return repository.save(todo);
    }

    @GetMapping("/todo")
    public List<TodoDatabase> getList() {
        return repository.findAll();
    }    
}
