package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class MainController {
    @GetMapping("/hello")
    public String helloWorld() {
        return "Привет, мир!";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(defaultValue = "Пользователь") String name) {
        return "Добро пожаловать, " + name + "!";
    }

    @GetMapping("/info")
    public Map<String, String> info() {
        return Map.of(
                "name", "Demo Application",
                "version", "1.0",
                "status", "working"
        );
    }
}