package org.main.controller;


import lombok.RequiredArgsConstructor;
import org.main.entity.User;
import org.main.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User createUser(@RequestParam String username, @RequestParam String password) {
        return userService.createUser(username, password);
    }
}