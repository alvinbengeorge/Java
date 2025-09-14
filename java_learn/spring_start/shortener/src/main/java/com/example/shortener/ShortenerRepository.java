package com.example.shortener;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ShortenerRepository extends JpaRepository<Database, Long> {
    List<Database> findByUsername(String username);
    Database findByShortID(String shortid);
}
