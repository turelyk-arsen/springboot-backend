package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/test")
    public String testDatabaseConnection() {
        String query = "SELECT 1";
        int result = jdbcTemplate.queryForObject(query, Integer.class);
        return "Connection to MySQL successful! Result: " + result;
    }
}

