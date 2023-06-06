package com.example.interview.controller;

import com.example.interview.model.Task;
import com.example.interview.model.User;
import com.example.interview.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;


    @PostMapping("/task")
    public Task createTask(@RequestBody Task task){
        return taskService.createTask(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask (@PathVariable long id){
        taskService.deleteTask(id);
    }

    @GetMapping("/{user_id}")
    public List<Task> trackTask(@PathVariable User user_id){
        return taskService.trackTask(user_id);
    }
}
