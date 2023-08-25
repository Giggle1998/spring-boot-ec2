package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test1")
    public ResponseEntity<String> test1() {
        return ResponseEntity.ok("test1 입니다.");
    }

    @GetMapping("/test2")
    public ResponseEntity<String> test2() {
        return ResponseEntity.ok("test2 입니다.");
    }

    @GetMapping("/test3")
    public ResponseEntity<String> test3() {
        return ResponseEntity.ok("test3 입니다.");
    }
}
