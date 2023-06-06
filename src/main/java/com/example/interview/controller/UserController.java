package com.example.interview.controller;

import com.example.interview.model.User;
import com.example.interview.repository.TaskRepository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping ("/users")
public class UserController {
    private final UserRepository userRepository;

    @PostMapping("/user")
    public User createUser (@RequestBody User user){
         return userRepository.save(user);
    }
}
