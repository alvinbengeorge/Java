package com.example.shortener;

import java.util.List;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShortenerRouter {

    @Autowired
    private ShortenerRepository repository;

    @GetMapping("/")
    public List<Database> getLinks(@RequestParam String username) {
        return repository.findByUsername(username);     
    }    

    @PostMapping("/")
    public HashMap<String, Object> addLink(@RequestBody ShortenRequest request) {
        System.out.println(request);
        Database find = repository.findByShortID(request.shortID);
        HashMap<String, Object> output = new HashMap<>();
        if (find != null) {
            output.put("Status", false);
            output.put("Message", "This Short ID already exists");
        } else {
            repository.save(new Database(request.username, request.shortID, request.url));
            output.put("Status", true);
            output.put("Message", "Completed!!");
        }
        return output;
    }

    @GetMapping("/{shortID}")
    public ResponseEntity<?> redirectLink(@PathVariable String shortID) {
        Database find = repository.findByShortID(shortID);
        if (find == null) {
            HashMap<String, String> output = new HashMap<>();
            output.put("Message", "There is no URL with this shortcode");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(output);
        } else {
            System.out.println("Redirecting to " + find.url);
            HttpHeaders headers = new HttpHeaders();
            headers.add("Location", find.url);
            return new ResponseEntity<>(headers, HttpStatus.FOUND);
        }

    }
}
