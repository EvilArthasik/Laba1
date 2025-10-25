package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private List<String> users = new ArrayList<>();

    @GetMapping
    public List<String> getAllUsers() {
        return users;
    }

    @PostMapping
    public String addUser(@RequestBody String userName) {
        users.add(userName);
        return "Пользователь " + userName + " добавлен";
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable int id) {
        if (id >= 0 && id < users.size()) {
            return users.get(id);
        }
        return "Пользователь не найден";
    }
}