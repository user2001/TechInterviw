package com.example.interview.service;

import com.example.interview.model.Task;
import com.example.interview.model.User;
import com.example.interview.repository.TaskRepository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public Task createTask(Task task){
        return taskRepository.save(task);
    }

    public void deleteTask(long id){
        taskRepository.deleteById(id);
    }

    public List<Task> trackTask(User user){
        return taskRepository.findByOwner(user);
    }
}
