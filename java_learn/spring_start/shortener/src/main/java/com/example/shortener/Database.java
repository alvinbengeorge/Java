package com.example.shortener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "links")
public class Database {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    
    @Column(nullable = false)
    public String username;

    @Column(nullable = false)
    public String shortID;
    
    @Column(nullable = false)
    public String url;

    public Database() {}
    
    public Database(String username, String shortID, String url) {
        this.username = username;
        this.shortID = shortID;
        this.url = url;
    }
}
